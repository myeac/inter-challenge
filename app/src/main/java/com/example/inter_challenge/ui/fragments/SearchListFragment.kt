package com.example.inter_challenge.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.inter_challenge.adapters.BaseFragment
import com.example.inter_challenge.databinding.FragmentSearchListBinding

class SearchListFragment : BaseFragment() {

    lateinit var binding: FragmentSearchListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun setUpView() {

    }


}