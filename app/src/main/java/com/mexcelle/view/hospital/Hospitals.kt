package com.mexcelle.view.hospital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import com.mexcelle.data.R
import com.mexcelle.data.databinding.ActivityAdvisoiesBinding
import com.mexcelle.data.databinding.ActivityHospitalsBinding
import com.mexcelle.presentation.di.Injector
import com.mexcelle.view.Advice.Advisoies
import com.mexcelle.view.Advice.AdvisorieAdapter
import kotlinx.android.synthetic.main.mainscreen.*
import javax.inject.Inject

class Hospitals : AppCompatActivity() {

    @Inject
    lateinit var hospitalFactory: HospitalViewModelFactory
    private lateinit var hospitalViewModel: HospitalViewModel
    var recyclerView: RecyclerView? = null
    private lateinit var binding: ActivityHospitalsBinding

    private lateinit var adapter: HospitalAdapter

    companion object
    {
        var shimmerFrameLayout: ShimmerFrameLayout? = null

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_hospitals)

        (application as Injector).createHospitalsSubComponent().inject(this)
        hospitalViewModel= ViewModelProvider(this,hospitalFactory).get(HospitalViewModel::class.java)
        initRecyclerView()

    }

    private fun initRecyclerView() {



        binding.backButton.setOnClickListener {
            onBackPressed()
        }
        binding.titleTv.text="hospitals"
        shimmerFrameLayout =findViewById(R.id.shimmer)
        adapter = HospitalAdapter(this)
        binding.recycleHospital!!.setHasFixedSize(true)
        binding.recycleHospital!!.setLayoutManager(LinearLayoutManager(this))
        binding.recycleHospital!!.setAdapter(adapter)
        displayCountries()

    }

    private fun displayCountries() {

        val responseLiveData = hospitalViewModel.getHopsitals()
        responseLiveData.observe(this, Observer {
            if(it!=null){
                adapter.setList(it)
                adapter.notifyDataSetChanged()
            }else{
                Toast.makeText(applicationContext,"No data available", Toast.LENGTH_LONG).show()
            }
        })
    }
    override fun onResume() {
        super.onResume()
        binding.shimmer!!.startShimmerAnimation()
    }

    override fun onPause() {
        super.onPause()
        binding.shimmer!!.stopShimmerAnimation()
    }
}