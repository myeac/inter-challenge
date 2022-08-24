package com.example.inter_challenge.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.inter_challenge.R
import com.example.inter_challenge.data.mappers.toPresentation
import com.example.inter_challenge.data.mappers.toUI
import com.example.inter_challenge.data.remote.models.RepositorySearchResponseModel
import com.example.inter_challenge.utilities.base.BaseFragment
import com.example.inter_challenge.databinding.FragmentSearchListBinding
import com.example.inter_challenge.ui.adapters.SearchAdapter

class SearchListFragment : BaseFragment() {

    lateinit var binding: FragmentSearchListBinding

    private lateinit var searchAdapter: SearchAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun setUpView() {
        searchAdapter = SearchAdapter {
            findNavController().navigate(R.id.action_searchListFragment_to_pullRequestListFragment)
        }
        searchAdapter.items = RepositorySearchResponseModel.dummyList.toPresentation().toUI()
        binding.recyclerViewSearcList.adapter = searchAdapter
        binding.recyclerViewSearcList.layoutManager = LinearLayoutManager(requireContext())
    }


}