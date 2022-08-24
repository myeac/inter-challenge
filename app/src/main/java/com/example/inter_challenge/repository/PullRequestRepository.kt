package com.example.inter_challenge.repository

import com.example.inter_challenge.viewmodel.models.PullRequestPresentationModel

interface PullRequestRepository {

    suspend fun getUserPullRequest(owner: String, name: String): PullRequestPresentationModel

}