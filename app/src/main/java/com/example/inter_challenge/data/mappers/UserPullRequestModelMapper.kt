package com.example.inter_challenge.data.mappers

import com.example.inter_challenge.data.remote.models.UserPullRequestResponseModel
import com.example.inter_challenge.viewmodel.models.UserPullRequestPresentationModel

fun UserPullRequestResponseModel.toPresentation() = UserPullRequestPresentationModel(
    login = this.login ?: "",
    avatarUrl = this.avatarUrl ?: "",
    url = this.url ?: ""
)