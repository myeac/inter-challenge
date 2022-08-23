package com.example.inter_challenge.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.inter_challenge.R
import com.example.inter_challenge.adapters.BaseFragment
import com.example.inter_challenge.databinding.FragmentPullRequestListBinding

class PullRequestListFragment : BaseFragment() {

    lateinit var binding: FragmentPullRequestListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentPullRequestListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun setUpView() {
    }

}