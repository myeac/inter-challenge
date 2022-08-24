package com.example.inter_challenge.di

import com.example.inter_challenge.data.remote.core.WebServiceFactory
import com.example.inter_challenge.data.remote.services.PullRequestWebService
import com.example.inter_challenge.data.remote.services.SearchWebService
import org.koin.dsl.module
import retrofit2.create

val remoteModule = module {

    single {
        WebServiceFactory.createWebService() as SearchWebService
    }

    single {
        WebServiceFactory.createWebService() as PullRequestWebService
    }

}