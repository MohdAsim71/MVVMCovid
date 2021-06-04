package com.mexcelle.view.Advice

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
import com.mexcelle.presentation.di.Injector
import com.mexcelle.view.country.AdapterCountry
import com.mexcelle.view.country.CountryViewModel
import com.mexcelle.view.country.CountryViewModelFactory
import kotlinx.android.synthetic.main.activity_advisoies.*
import kotlinx.android.synthetic.main.mainscreen.*
import kotlinx.android.synthetic.main.mainscreen.back_button
import kotlinx.android.synthetic.main.mainscreen.title_tv
import javax.inject.Inject

class Advisoies : AppCompatActivity() {
    @Inject
    lateinit var adviceFactory: AdviceViewModelFactory
    private lateinit var adviceViewModel: AdviceViewModel
    private lateinit var binding: ActivityAdvisoiesBinding
    var recyclerView: RecyclerView? = null
    private lateinit var adapter: AdvisorieAdapter

    companion object
    {
        var shimmerFrameLayout: ShimmerFrameLayout? = null

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_advisoies)
       // setContentView(R.layout.activity_advisoies)
        (application as Injector).createAdviceSubComponent().inject(this)
        adviceViewModel= ViewModelProvider(this,adviceFactory).get(AdviceViewModel::class.java)
        initRecyclerView()
    }

    private fun initRecyclerView() {

        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)


        binding.backButton.setOnClickListener {
            onBackPressed()
        }
        binding.titleTv.text="Advice"
        shimmerFrameLayout=findViewById(R.id.shimmer)
        adapter = AdvisorieAdapter(this)
        binding.recycleradvi!!.setHasFixedSize(true)
        binding.recycleradvi!!.setLayoutManager(LinearLayoutManager(this))
        binding.recycleradvi!!.setAdapter(adapter)
        displayCountries()

    }

    private fun displayCountries() {

        val responseLiveData = adviceViewModel.getAdvice()
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
        binding.shimmer!!.startShimmerAnimation()
    }
}
