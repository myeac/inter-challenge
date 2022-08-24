package com.example.inter_challenge.repository

import com.example.inter_challenge.viewmodel.models.SearchPresentationModel

interface SearchRepository {

    suspend fun getJavaStarredRepositories(): SearchPresentationModel

}