package com.example.inter_challenge.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.inter_challenge.R
import com.example.inter_challenge.databinding.ItemPullRequestBinding
import com.example.inter_challenge.ui.model.PullRequestUIModel
import com.example.inter_challenge.utilities.BaseAdapter
import com.example.inter_challenge.utilities.BaseViewHolder

class PullRequestAdapter(
    val pullRequestClickListener: (item: PullRequestUIModel) -> Unit
) : BaseAdapter<PullRequestUIModel, PullRequestAdapter.PullRequestViewHolder>() {

    override val layoutId: Int
        get() = R.layout.item_pull_request

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PullRequestViewHolder {
        val itemBinding = ItemPullRequestBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return PullRequestViewHolder(itemBinding)
    }

    inner class PullRequestViewHolder(
        private val view: ItemPullRequestBinding
    ) : BaseViewHolder<PullRequestUIModel>(view) {
        override fun bind(item: PullRequestUIModel) {
            view.tvPullRequestTitle.text = item.prTitle
            view.tvPullRequestDescription.text = item.prBody
            view.tvPullRequestUserName.text = item.authorName
            view.tvPullRequestData.text = item.prData
            Glide.with(itemView)
                .load(item.authorPhoto)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(view.ivPullRequestUser)
            itemView.setOnClickListener { pullRequestClickListener(item) }
        }
    }

}

