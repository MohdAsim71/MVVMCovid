package com.mexcelle.data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mexcelle.countryActivity.CountryActivity

class MainActivity : AppCompatActivity() {
    var countries:android.widget.RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        countries!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, CountryActivity::class.java)
            startActivity(intent)
        })
    }

    private fun init() {

        countries = findViewById(R.id.countries)

    }
}