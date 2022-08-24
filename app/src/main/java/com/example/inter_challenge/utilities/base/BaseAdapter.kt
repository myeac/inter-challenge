package com.example.inter_challenge.utilities.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseAdapter<T, V : BaseViewHolder<T>> : RecyclerView.Adapter<V>() {

    private var itemClickListener: OnAdapterItemClickListener<T> = { }

    var items: MutableList<T> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    abstract val layoutId: Int

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: V, position: Int) {
        val item = items[position]
        holder.itemView.setOnClickListener {
            itemClickListener(item)
        }
        holder.bind(item)
    }

}

abstract class BaseViewHolder<T>(v: ViewBinding) : RecyclerView.ViewHolder(v.root) {
    abstract fun bind(item: T)
}

typealias OnAdapterItemClickListener<T> = (T) -> Unit