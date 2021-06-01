package com.mexcelle.view.country

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.mexcelle.data.R
import com.mexcelle.data.model.CountriesDetailsItem
import java.util.ArrayList

class AdapterCountry(
var context: Context,
/*list: ArrayList<Livedetails>,
countryName: ArrayList<String>*/
) :
RecyclerView.Adapter<AdapterCountry.ViewHolder>() {
     var mlist: ArrayList<String> =ArrayList<String>()

    private val counrtries = ArrayList<CountriesDetailsItem>()
    fun setList(movies:List<CountriesDetailsItem>){
        counrtries.clear()
        counrtries.addAll(movies)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val v: View =
            LayoutInflater.from(context).inflate(R.layout.countrylayout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(
            holder: ViewHolder,
            position: Int
    )
    {
        val countriesDetails: CountriesDetailsItem = counrtries[position]
        holder.cases.setText(countriesDetails.cases)
        // holder.country.setText(countriesDetails.country)
        holder.todayCases.setText(countriesDetails.todayCases)
        holder.deaths.setText(countriesDetails.deaths)
        holder.todayDeaths.setText(countriesDetails.todayDeaths)
        holder.recovered.setText(countriesDetails.recovered)
        holder.active.setText(countriesDetails.active)
        holder.critical.setText(countriesDetails.critical)




      /*  var regulartypeFace =
            Typeface.createFromAsset(context.assets, "fonts/Raleway_Regular.ttf")

        holder.name.setTypeface(regulartypeFace)
        holder.cases.setTypeface(regulartypeFace)
        holder.cases_tv.setTypeface(regulartypeFace)
        holder.todayCases.setTypeface(regulartypeFace)
        holder.todayCases_tv.setTypeface(regulartypeFace)
        holder.todayDeaths.setTypeface(regulartypeFace)
        holder.todayDeaths_tv.setTypeface(regulartypeFace)
        holder.deaths.setTypeface(regulartypeFace)
        holder.deaths_tv.setTypeface(regulartypeFace)
        holder.recovered.setTypeface(regulartypeFace)
        holder.recovered_tv.setTypeface(regulartypeFace)
        holder.active.setTypeface(regulartypeFace)
        holder.active_tv.setTypeface(regulartypeFace)
        holder.critical.setTypeface(regulartypeFace)
        holder.critical_tv.setTypeface(regulartypeFace)
        holder.position.setTypeface(regulartypeFace)

*/
          mlist.add(countriesDetails.country)

        val hospitalDetail = counrtries[position]

        holder.name.setText(hospitalDetail.country)

         var a:Int=  mlist.indexOf(countriesDetails.country)

        if (a==0)
        {
            holder.position.text= ""

        }
        else
        {
            holder.position.text=((a).toString())+" Rank"

        }



        val isExpanded: Boolean = counrtries[position].isExpanded
        holder.constraintLayout.visibility = if (isExpanded) View.VISIBLE else View.GONE

        Log.e("data","cases "+countriesDetails.cases+" tCases "+countriesDetails.todayCases
                + " death "+countriesDetails.deaths+" tdeath "+countriesDetails.todayDeaths+" recoverd "+countriesDetails.recovered
                +" active "+countriesDetails.active+" criticle "+countriesDetails.critical)
    }

    override fun getItemCount(): Int {
        return counrtries.size
    }

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        // var state_name: TextView
        var cases_tv: TextView
        var todayCases_tv: TextView
        var deaths_tv: TextView
        var todayDeaths_tv: TextView
        var recovered_tv: TextView
        var active_tv: TextView
        var critical_tv: TextView
        var name: TextView
        var position: TextView
        var cases: TextView
        var todayCases: TextView
        // var country: TextView
        var deaths: TextView
        var todayDeaths: TextView
        var recovered: TextView
        var active: TextView
        var critical: TextView
        var Country= ArrayList<String>()
        var constraintLayout: ConstraintLayout

        init {
            cases_tv = itemView.findViewById(R.id.cases_tv)
            todayCases_tv = itemView.findViewById(R.id.todaycases_tv)
            recovered_tv = itemView.findViewById(R.id.recoverd_tv)
            active_tv = itemView.findViewById(R.id.active_tv)
            deaths_tv = itemView.findViewById(R.id.death_tv)
            todayDeaths_tv = itemView.findViewById(R.id.today_tv)
            critical_tv = itemView.findViewById(R.id.critical_tv)
            name = itemView.findViewById(R.id.name)
            position = itemView.findViewById(R.id.position_rank)
            cases = itemView.findViewById(R.id.cases)
            todayCases = itemView.findViewById(R.id.todaycase)
            // country = itemView.findViewById(R.id.country)
            deaths = itemView.findViewById(R.id.deaths)
            todayDeaths = itemView.findViewById(R.id.todaydeath)
            recovered = itemView.findViewById(R.id.recovereds)
            active = itemView.findViewById(R.id.actives)
            critical = itemView.findViewById(R.id.critical)

            constraintLayout = itemView.findViewById(R.id.expandale)
            name.setOnClickListener {
                val singleCounrty = counrtries[adapterPosition]
                singleCounrty.isExpanded=(!singleCounrty.isExpanded)
                notifyItemChanged(adapterPosition)
            }
        }
    }

   /* init {
        this.list = list
        this.mlist=countryName
    }*/
}