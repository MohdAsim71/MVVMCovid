package com.mexcelle.view.country

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mexcelle.data.R
import com.mexcelle.presentation.di.Injector
import javax.inject.Inject

class CountryActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: CountryViewModelFactory
    private lateinit var countryViewModel: CountryViewModel

    var recyclerView: RecyclerView? = null
    private lateinit var adapter: AdapterCountry
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)
        (application as Injector).createCountrySubComponent().inject(this)
        countryViewModel= ViewModelProvider(this,factory).get(CountryViewModel::class.java)
        initRecyclerView()

    }

    private fun initRecyclerView() {
    recyclerView=findViewById(R.id.recycleCountry)
        adapter = AdapterCountry(this)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.setLayoutManager(LinearLayoutManager(this))
        recyclerView!!.setAdapter(adapter)
        displayCountries()

    }

    private fun displayCountries() {


        val responseLiveData = countryViewModel.getCountryies()
        responseLiveData.observe(this, Observer {
            if(it!=null){
                adapter.setList(it)
                adapter.notifyDataSetChanged()
            }else{
                Toast.makeText(applicationContext,"No data available", Toast.LENGTH_LONG).show()
            }
        })
    }
}