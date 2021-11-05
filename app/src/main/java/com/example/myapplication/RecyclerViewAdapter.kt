package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val list = mutableListOf("Here's the situation", "Tell me more", "What do you think?", " What can I do to help?", "Please/thank you", "getCoffee()")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val txt = list[position]

        holder.itemView.apply {
            text.text = txt
        }
    }

    override fun getItemCount(): Int = list.size


    fun delete(idx: Int){
        list.removeAt(idx)
        notifyDataSetChanged()
    }
}