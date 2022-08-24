package com.example.inter_challenge.viewmodel.models

data class SearchPresentationModel(
    val name: String,
    val fullName: String,
    val description: String,
    var owner: OwnerPresentationModel?,
    val stargazersCount: Int,
    val forksCount: Int
)