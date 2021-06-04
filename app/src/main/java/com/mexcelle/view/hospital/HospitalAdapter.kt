package com.mexcelle.view.hospital

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mexcelle.data.R
import com.mexcelle.data.databinding.HospitallayoutBinding
import com.mexcelle.data.model.advice.NotificationData
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
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: HospitallayoutBinding = DataBindingUtil.inflate(layoutInflater, R.layout.hospitallayout, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val hospitalDetail = hospitals[position]
        holder.bind(hospitals[position])

        /* holder.state_name.setText(hospitalDetail.state)
         holder.ownership.setText(hospitalDetail.ownership)
         holder.city.setText(hospitalDetail.city)
         holder.capacity.setText(hospitalDetail.admissionCapacity.toString())
         holder.beds.setText(hospitalDetail.hospitalBeds.toString())
         holder.name.setText(hospitalDetail.name)*/
        val isExpanded: Boolean = hospitals[position].isExpanded
        holder.binding.expandale.visibility = if (isExpanded) View.VISIBLE else View.GONE

        holder.binding.name.setOnClickListener {
            val hospitalDetail = hospitals[position]
            hospitalDetail.isExpanded=(!hospitalDetail.isExpanded)
            notifyItemChanged(position)
        }
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

    inner class ViewHolder(val binding: HospitallayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(medicalCollege: MedicalCollege){
            binding.hospitalsData=medicalCollege
            binding.executePendingBindings()
            //  binding.tittle.text = notificationData.title
            //binding.link.text = notificationData.link

        }

    }

}
