package com.mexcelle.view.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import com.mexcelle.data.R
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

    var recyclerView: RecyclerView? = null
    private lateinit var adapter: ContactAdaper

    companion object
    {
        var shimmerFrameLayout: ShimmerFrameLayout? = null

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        (application as Injector).createContactSubComponent().inject(this)
        contactViewModel= ViewModelProvider(this,contactFactory).get(ContactViewModel::class.java)
        initRecyclerView()
    }

    private fun initRecyclerView() {

        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        back_button.setOnClickListener {
            onBackPressed()
        }
        title_tv.text="Contact"

        shimmerFrameLayout =findViewById(R.id.shimmer)
        recyclerView=findViewById(R.id.recyclecontact)
        adapter = ContactAdaper(this)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.setLayoutManager(LinearLayoutManager(this))
        recyclerView!!.setAdapter(adapter)
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
        shimmerFrameLayout!!.startShimmerAnimation()
    }

    override fun onPause() {
        super.onPause()
        shimmerFrameLayout!!.stopShimmerAnimation()
    }
}