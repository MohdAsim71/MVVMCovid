package com.mexcelle.Country

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlincovid19.pojoClass.CountriesDetails
import com.mexcelle.mvvmcovid.R

class AdapterCountry(
   /* var context: Context,
    list: ArrayList<CountriesDetails>,
    countryName: ArrayList<String>
*/
) :
    RecyclerView.Adapter<AdapterCountry.ViewHolder>() {

    private val counrtries = ArrayList<CountriesDetails>()

    fun setList(movies:List<CountriesDetails>){
        counrtries.clear()
        counrtries.addAll(movies)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.countrylayout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val countriesDetails: CountriesDetails = counrtries[position]
        holder.cases.setText(countriesDetails.cases)
        holder.country.setText(countriesDetails.country)
        holder.todayCases.setText(countriesDetails.todayCases)
        holder.deaths.setText(countriesDetails.deaths)
        holder.todayDeaths.setText(countriesDetails.todayDeaths)
        holder.recovered.setText(countriesDetails.recovered)
        holder.active.setText(countriesDetails.active)
        holder.critical.setText(countriesDetails.critical)
        holder.Country.add(countriesDetails.country)
        var a:Int=  counrtries.indexOf(countriesDetails.country)

        holder.position.text=((a+1).toString())+" Rank"

        Log.e("data","cases "+countriesDetails.cases+" tCases "+countriesDetails.todayCases
                + " death "+countriesDetails.deaths+" tdeath "+countriesDetails.todayDeaths+" recoverd "+countriesDetails.recovered
                +" active "+countriesDetails.active+" criticle "+countriesDetails.critical)

        Log.e("position",((a+1).toString())+"th Position"+countriesDetails.country)
    }

    override fun getItemCount(): Int {
        return counrtries.size
    }

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var cases: TextView
        var todayCases: TextView
        var country: TextView
        var deaths: TextView
        var todayDeaths: TextView
        var recovered: TextView
        var active: TextView
        var critical: TextView
        var position: TextView
        var Country=ArrayList<String>()



        init {
            cases = itemView.findViewById(R.id.cases)
            todayCases = itemView.findViewById(R.id.todaycase)
            country = itemView.findViewById(R.id.country)
            deaths = itemView.findViewById(R.id.deaths)
            todayDeaths = itemView.findViewById(R.id.todaydeath)
            recovered = itemView.findViewById(R.id.recovereds)
            active = itemView.findViewById(R.id.actives)
            critical = itemView.findViewById(R.id.critical)
            position = itemView.findViewById(R.id.position)
        }
    }

/*
    init {
        this.list = list
        this.mlist=countryName
    }
*/
}