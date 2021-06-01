package com.mexcelle.data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import com.mexcelle.view.Advice.Advisoies
import com.mexcelle.view.contact.ContactActivity
import com.mexcelle.view.hospital.Hospitals

class MainActivity : AppCompatActivity() {
    var countries:android.widget.RelativeLayout? = null
    var hospitalsRl:android.widget.RelativeLayout? = null
    var adviceRl:android.widget.RelativeLayout? = null
    var contactRl:android.widget.RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        countries!!.setOnClickListener(View.OnClickListener {
            /*val intent = Intent(this@MainActivity, CountryActivity::class.java)
            startActivity(intent)*/
            val myToast = Toast.makeText(applicationContext,"Working.....",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.LEFT,200,200)
            myToast.show()
        })

        hospitalsRl!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, Hospitals::class.java)
            startActivity(intent)
        })

        adviceRl!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, Advisoies::class.java)
            startActivity(intent)
        })
        contactRl!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, ContactActivity::class.java)
            startActivity(intent)
        })
    }

    private fun init() {

        countries = findViewById(R.id.countries)
        hospitalsRl = findViewById(R.id.hospitals)
        adviceRl = findViewById(R.id.advisorie)
        contactRl = findViewById(R.id.helpline)

    }
}