package com.adgad.kboard

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(
    itemView: View,
    private val clickListener: ItemClickListener
) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    @JvmField
    val textView: TextView = itemView as TextView

    init {
        textView.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        clickListener.onItemClick(adapterPosition)
    }

    interface ItemClickListener {
        fun onItemClick(position: Int)
    }
}
