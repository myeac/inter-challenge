package com.example.inter_challenge.repository

import com.example.inter_challenge.data.remote.services.PullRequestWebService
import com.example.inter_challenge.viewmodel.models.PullRequestPresentationModel

class PullRequestRepositoryImpl(
    private val api: PullRequestWebService
) : PullRequestRepository {

    override suspend fun getUserPullRequest(
        owner: String,
        name: String
    ): PullRequestPresentationModel {
        TODO("Not yet implemented")
    }
}