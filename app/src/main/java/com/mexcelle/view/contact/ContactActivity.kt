package com.mexcelle.view.contact

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
import com.mexcelle.data.databinding.ActivityContactBinding
import com.mexcelle.presentation.di.Injector
import com.mexcelle.view.Advice.AdviceViewModel
import com.mexcelle.view.Advice.Advisoies
import com.mexcelle.view.Advice.AdvisorieAdapter
import com.mexcelle.view.country.AdapterCountry
import com.mexcelle.view.hospital.HospitalViewModel
import com.mexcelle.view.hospital.HospitalViewModelFactory
import kotlinx.android.synthetic.main.mainscreen.*
import javax.inject.Inject

class ContactActivity : AppCompatActivity() {
    @Inject
    lateinit var contactFactory: ContactViewModelFactory
    private lateinit var contactViewModel: ContactViewModel
    private lateinit var binding: ActivityContactBinding

    var recyclerView: RecyclerView? = null
    private lateinit var adapter: ContactAdaper

    companion object
    {
        var shimmerFrameLayout: ShimmerFrameLayout? = null

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_contact)

        (application as Injector).createContactSubComponent().inject(this)
        contactViewModel= ViewModelProvider(this,contactFactory).get(ContactViewModel::class.java)
        initRecyclerView()
    }

    private fun initRecyclerView() {

        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)
        shimmerFrameLayout =findViewById(R.id.shimmer1)


        binding.backButton.setOnClickListener {
            onBackPressed()
        }
        binding.titleTv.text="Contact"
        adapter = ContactAdaper(this)
        binding.recyclecontact.setHasFixedSize(true)
        binding.recyclecontact!!.setLayoutManager(LinearLayoutManager(this))
        binding.recyclecontact!!.setAdapter(adapter)
        displayCountries()


    }

    private fun displayCountries() {

        val responseLiveData = contactViewModel.getContact()
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
        binding.shimmer1!!.startShimmerAnimation()
    }

    override fun onPause() {
        super.onPause()
        binding.shimmer1!!.stopShimmerAnimation()
    }
}