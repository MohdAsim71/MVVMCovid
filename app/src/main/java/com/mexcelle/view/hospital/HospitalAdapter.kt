package com.mexcelle.view.hospital

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mexcelle.data.R
import com.mexcelle.data.model.hospitalsPojo.MedicalCollege
import kotlin.collections.ArrayList

class HospitalAdapter(
    var context: Context,
  /*  var list: ArrayList<HospitalDetail>*/
) : RecyclerView.Adapter<HospitalAdapter.ViewHolder>() {


    private val hospitals = ArrayList<MedicalCollege>()
    fun setList(hospitalsData: List<MedicalCollege>){
        hospitals.clear()
        hospitals.addAll((hospitalsData))
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val v =
            LayoutInflater.from(context).inflate(R.layout.hospitallayout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val hospitalDetail = hospitals[position]
        holder.state_name.setText(hospitalDetail.state)
        holder.ownership.setText(hospitalDetail.ownership)
        holder.city.setText(hospitalDetail.city)
        holder.capacity.setText(hospitalDetail.admissionCapacity.toString())
        holder.beds.setText(hospitalDetail.hospitalBeds.toString())
        holder.name.setText(hospitalDetail.name)
        val isExpanded: Boolean = hospitals[position].isExpanded
        holder.constraintLayout.visibility = if (isExpanded) View.VISIBLE else View.GONE


       /* var regulartypeFace = Typeface.createFromAsset(context.assets, "fonts/Raleway_Regular.ttf")
        var lighttypeFace = Typeface.createFromAsset(context.assets, "fonts/Raleway-Light.ttf")
        var semiboldtypeFace = Typeface.createFromAsset(context.assets, "fonts/Raleway_SemiBold.ttf")
*/
/*
        holder.name.setTypeface(regulartypeFace)
        holder.ownership.setTypeface(regulartypeFace)
        holder.city.setTypeface(regulartypeFace)
        holder.capacity.setTypeface(regulartypeFace)
        holder.beds.setTypeface(regulartypeFace)
        holder.state_name.setTypeface(regulartypeFace)
        holder.addmission_name_tv.setTypeface(regulartypeFace)
        holder.bad_name_tv.setTypeface(regulartypeFace)
*/
    }

    override fun getItemCount(): Int {
        return hospitals.size
    }

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var state_name: TextView
        var bad_name_tv: TextView
        var addmission_name_tv: TextView
        var name: TextView
        var city: TextView
        var ownership: TextView
        var capacity: TextView
        var beds: TextView
        var constraintLayout: RelativeLayout

        init {
            state_name = itemView.findViewById(R.id.statenamehos)
            bad_name_tv = itemView.findViewById(R.id.textView6)
            addmission_name_tv = itemView.findViewById(R.id.textView5)
            name = itemView.findViewById(R.id.name)
            city = itemView.findViewById(R.id.city)
            capacity = itemView.findViewById(R.id.capacity)
            ownership = itemView.findViewById(R.id.ownership)
            beds = itemView.findViewById(R.id.beds)
            constraintLayout = itemView.findViewById(R.id.expandale)
            name.setOnClickListener {
                val hospitalDetail = hospitals[adapterPosition]
                hospitalDetail.isExpanded=(!hospitalDetail.isExpanded)
                notifyItemChanged(adapterPosition)
            }
        }
    }

}
