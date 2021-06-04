package com.mexcelle.view.Advice

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mexcelle.data.R
import com.mexcelle.data.databinding.AdvisorielayoutBinding
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
       val layoutInflater = LayoutInflater.from(parent.context)
       val binding:AdvisorielayoutBinding = DataBindingUtil.inflate(layoutInflater, R.layout.advisorielayout, parent, false)
       return ViewHolder(binding)


    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val advisorieDetail: NotificationData = advices[position]
        holder.bind(advices[position])


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



    class ViewHolder(val binding: AdvisorielayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(notificationData: NotificationData){
            binding.adviceData=notificationData
            binding.executePendingBindings()
          //  binding.tittle.text = notificationData.title
            //binding.link.text = notificationData.link

        }
    }

   /* init {
        this.list = list
    }*/
}
