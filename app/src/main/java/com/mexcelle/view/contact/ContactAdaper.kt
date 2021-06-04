package com.mexcelle.view.contact

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mexcelle.data.R
import com.mexcelle.data.databinding.AdvisorielayoutBinding
import com.mexcelle.data.databinding.ContactlayoutBinding
import com.mexcelle.data.model.advice.NotificationData
import com.mexcelle.data.model.contact.Regional
import java.util.*

class ContactAdaper(
    var context: Context,
    /*list: ArrayList<ContactDetails>*/
) :
    RecyclerView.Adapter<ContactAdaper.ViewHolder>() {
   // var list: ArrayList<ContactDetails>

    private val contact = ArrayList<Regional>()
    fun setList(contactData:List<Regional>){
        contact.clear()
        contact.addAll(contactData)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ContactlayoutBinding = DataBindingUtil.inflate(layoutInflater, R.layout.contactlayout, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val contactDetails: Regional = contact[position]
        holder.bind(contact[position])

        holder.binding.callLyout.setOnClickListener {


            ////Log.e("HelpNumberCustomAdapter", "Calling " + emergencyContactsArrayList.get(position).getName() + " " + emergencyContactsArrayList.get(position).getContactNo());
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse(
                "tel:" + contact[position].number
            )
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(intent)



        }
    }

    override fun getItemCount(): Int {
        return contact.size
    }

    class ViewHolder(val binding:ContactlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(regional: Regional){
            binding.contactData=regional
            binding.executePendingBindings()

            //  binding.tittle.text = notificationData.title
            //binding.link.text = notificationData.link

        }

    }

    /*init {
        this.list = list
    }*/
}
