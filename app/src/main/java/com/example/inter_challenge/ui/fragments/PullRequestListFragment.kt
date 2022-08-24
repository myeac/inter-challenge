package com.example.inter_challenge.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.inter_challenge.data.mappers.toPresentation
import com.example.inter_challenge.data.mappers.toUI
import com.example.inter_challenge.data.remote.models.PullRequestResponseModel
import com.example.inter_challenge.utilities.base.BaseFragment
import com.example.inter_challenge.databinding.FragmentPullRequestListBinding
import com.example.inter_challenge.ui.adapters.PullRequestAdapter
import com.example.inter_challenge.utilities.openUrl

class PullRequestListFragment : BaseFragment() {

    lateinit var binding: FragmentPullRequestListBinding

    private lateinit var pullRequestAdapter: PullRequestAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPullRequestListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun setUpView() {
        pullRequestAdapter = PullRequestAdapter {
            openUrl(it.prURL)
        }
        pullRequestAdapter.items = PullRequestResponseModel.dummyList.toPresentation().toUI()
        binding.recyclerViewPullRequestList.adapter = pullRequestAdapter
        binding.recyclerViewPullRequestList.layoutManager = LinearLayoutManager(requireContext())
    }

}