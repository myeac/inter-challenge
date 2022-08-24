package com.example.inter_challenge.ui.model

data class SearchUIModel(
    val repositoryName: String,
    val repositoryDescription: String,
    val authorName: String,
    val authorFullName:String,
    val authorPhoto: String,
    val repositoryStars: Int,
    val repositoryFork: Int
)