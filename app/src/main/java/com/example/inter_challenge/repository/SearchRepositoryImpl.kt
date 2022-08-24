package com.example.inter_challenge.repository

import com.example.inter_challenge.data.remote.services.SearchWebService
import com.example.inter_challenge.viewmodel.models.SearchPresentationModel

class SearchRepositoryImpl(
    private val api: SearchWebService
) : SearchRepository {

    override suspend fun getJavaStarredRepositories(): SearchPresentationModel {
        TODO("Not yet implemented")
    }

}