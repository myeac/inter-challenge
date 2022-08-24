package com.example.inter_challenge.di

import com.example.inter_challenge.viewmodel.PullRequestViewModel
import com.example.inter_challenge.viewmodel.SearchListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { SearchListViewModel(get()) }

    viewModel { PullRequestViewModel(get()) }

}