package com.example.inter_challenge.data.mappers

import com.example.inter_challenge.data.remote.models.OwnerSearchResponseModel
import com.example.inter_challenge.viewmodel.models.OwnerPresentationModel

fun OwnerSearchResponseModel.toPresentation() = OwnerPresentationModel(
    login = this.login ?: "",
    avatarUrl = this.avatarUrl ?: "",
    url = this.url ?: ""
)

