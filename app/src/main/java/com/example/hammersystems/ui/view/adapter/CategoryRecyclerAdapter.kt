package com.example.hammersystems.ui.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hammersystems.R

class CategoryRecyclerAdapter() : RecyclerView.Adapter<CategoryRecyclerAdapter.MyViewHolder>() {

    var data: List<String> = arrayListOf("Пицца", "Комбо", "Десерты", "Напитки", "Другое")

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        init {
            textView =view.findViewById(R.id.category_text)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_item, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text =data[position]
    }

    override fun getItemCount() = data.size


}