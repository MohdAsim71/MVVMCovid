package com.mexcelle.view.Advice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mexcelle.data.R
import com.mexcelle.data.model.advice.NotificationData
import java.util.*

class AdvisorieAdapter(
    var context: Context,
/*
    list: ArrayList<AdvisorieDetail>
*/
) :
    RecyclerView.Adapter<AdvisorieAdapter.ViewHolder>() {
    private val advices = ArrayList<NotificationData>()
    fun setList(hospitals:List<NotificationData>){
        this.advices.clear()
        this.advices.addAll(hospitals)
    }
   // var list: ArrayList<AdvisorieDetail>
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val v: View =
            LayoutInflater.from(context).inflate(R.layout.advisorielayout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val advisorieDetail: NotificationData = advices[position]
        holder.tittle.text=(advisorieDetail.title)
        holder.link.text=(advisorieDetail.link)
        val mlink: String = advisorieDetail.link


       /* var regulartypeFace = Typeface.createFromAsset(context.assets, "fonts/Raleway_Regular.ttf")
        holder.tittle.setTypeface(regulartypeFace)
        holder.link.setTypeface(regulartypeFace)*/

        holder.itemView.setOnClickListener {
           /* val intent = Intent(context, WebViewActivity::class.java)
            intent.putExtra("link", mlink)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        */}
    }

    override fun getItemCount(): Int {
        return advices.size
    }



    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {


        var tittle: TextView
        var link: TextView

        init {
            tittle = itemView.findViewById(R.id.tittle)
            link = itemView.findViewById(R.id.link)
        }
    }

   /* init {
        this.list = list
    }*/
}
