package com.example.inter_challenge.data.remote.core

import com.example.inter_challenge.data.remote.services.PullRequestWebService
import com.example.inter_challenge.data.remote.services.SearchWebService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class WebServiceFactory {

    companion object {

        const val removeURL = "https://api.github.com/search/repositories?q=language:Java&sort=stars&page=1"
        const val baseURL = "https://api.github.com/"


        inline fun <reified T> createWebService(): T {
            val retrofit = Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create()
        }

        fun gitHubSearchWebServiceInstance(): SearchWebService {
            return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(SearchWebService::class.java)
        }

        fun pullRequestWebServiceInstance(): PullRequestWebService {
            return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PullRequestWebService::class.java)
        }
    }
}