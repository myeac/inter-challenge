package com.example.inter_challenge.di

import com.example.inter_challenge.repository.PullRequestRepository
import com.example.inter_challenge.repository.PullRequestRepositoryImpl
import com.example.inter_challenge.repository.SearchRepository
import com.example.inter_challenge.repository.SearchRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<SearchRepository> {
        SearchRepositoryImpl(get())
    }

    single<PullRequestRepository> {
        PullRequestRepositoryImpl(get())
    }

}