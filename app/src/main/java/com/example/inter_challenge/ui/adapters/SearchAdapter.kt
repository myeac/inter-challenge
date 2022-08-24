package com.example.inter_challenge.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.inter_challenge.R
import com.example.inter_challenge.databinding.ItemSearchBinding
import com.example.inter_challenge.ui.model.SearchUIModel
import com.example.inter_challenge.utilities.base.BaseAdapter
import com.example.inter_challenge.utilities.base.BaseViewHolder

class SearchAdapter(
    val searchClickListener: (item: SearchUIModel) -> Unit
) : BaseAdapter<SearchUIModel, SearchAdapter.SearchViewHolder>() {

    override val layoutId: Int
        get() = R.layout.item_search

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SearchViewHolder {
        val itemBinding = ItemSearchBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return SearchViewHolder(itemBinding)
    }

    inner class SearchViewHolder(
        private val view: ItemSearchBinding
    ) : BaseViewHolder<SearchUIModel>(view) {
        override fun bind(item: SearchUIModel) {
            view.tvSearchTitle.text = item.repositoryName
            view.tvSearchDescription.text = item.repositoryDescription
            view.tvSearchFork.text = item.repositoryFork.toString()
            view.tvSearchStar.text = item.repositoryStars.toString()
            view.tvSearchUserName.text = item.authorName
            view.tvSearchFullName.text = item.authorFullName
            Glide.with(itemView)
                .load(item.authorPhoto)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(view.ivSearchUserImage)
            itemView.setOnClickListener { searchClickListener(item) }
        }
    }

}