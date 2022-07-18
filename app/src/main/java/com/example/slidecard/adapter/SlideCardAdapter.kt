package com.example.slidecard.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.slidecard.R
import com.example.slidecard.bean.SlideCardBean

class SlideCardAdapter(val datas:MutableList<SlideCardBean>):RecyclerView.Adapter<SlideCardAdapter.MyViewHolder>(){
    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val ivImage:ImageView = itemView.findViewById(R.id.iv)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvTitle:TextView = itemView.findViewById(R.id.tvPrecent)
        companion object{
            fun from(parent:ViewGroup):MyViewHolder{
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_swipe_card,
                    parent,false)
                return MyViewHolder(view)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = datas[position]
        Glide.with(holder.itemView.context)
            .load(data.url)
            .into(holder.ivImage)
        holder.tvName.text = data.name
        holder.tvTitle.text = "${data.position}/${datas.size}"
    }

    override fun getItemCount(): Int {
        return datas.size
    }
}