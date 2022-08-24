package com.example.inter_challenge.data.remote.services

import com.example.inter_challenge.data.remote.models.PullRequestResponseModel
import com.example.inter_challenge.data.remote.services.PullRequestObject.GITHUB_PR
import com.example.inter_challenge.data.remote.services.PullRequestObject.GITHUB_PR_NAME
import com.example.inter_challenge.data.remote.services.PullRequestObject.GITHUB_PR_OWNER
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PullRequestWebService {

    @GET(GITHUB_PR)
    suspend fun getPullRequestFromRepository(
        @Path(GITHUB_PR_OWNER) owner: String,
        @Path(GITHUB_PR_NAME) name: String,
    ): Response<PullRequestResponseModel>

}

object PullRequestObject {
    const val GITHUB_PR_OWNER = "owner"
    const val GITHUB_PR_NAME = "name"
    const val GITHUB_PR = "repos/{$GITHUB_PR_OWNER}/{$GITHUB_PR_NAME}/pulls?page=1"
}