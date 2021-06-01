package com.mexcelle.view.contact

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mexcelle.data.R
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
        val v: View =
            LayoutInflater.from(context).inflate(R.layout.contactlayout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val contactDetails: Regional = contact[position]
        holder.state.setText(contactDetails.loc)
        holder.phone.setText(contactDetails.number)



       /* var regulartypeFace =
            Typeface.createFromAsset(context.assets, "fonts/Raleway_Regular.ttf")
        holder.state.setTypeface(regulartypeFace)
        holder.phone.setTypeface(regulartypeFace)
*/
        holder.calllayout.setOnClickListener {


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

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var state: TextView
        var phone: TextView
        var calllayout:LinearLayout

        init {
            state = itemView.findViewById(R.id.stateconname)
            calllayout = itemView.findViewById(R.id.call_lyout)
            phone = itemView.findViewById(R.id.phone)
        }
    }

    /*init {
        this.list = list
    }*/
}
