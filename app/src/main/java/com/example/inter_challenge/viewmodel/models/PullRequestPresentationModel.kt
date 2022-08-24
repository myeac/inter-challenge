package com.example.inter_challenge.viewmodel.models

data class PullRequestPresentationModel(
    val title: String,
    val body: String,
    val user: UserPullRequestPresentationModel?,
    val htmlUrl: String,
    val createdAt: String
)