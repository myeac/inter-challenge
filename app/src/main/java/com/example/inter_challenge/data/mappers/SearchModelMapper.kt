package com.example.inter_challenge.data.mappers

import com.example.inter_challenge.data.remote.models.RepositorySearchResponseModel
import com.example.inter_challenge.ui.model.SearchUIModel
import com.example.inter_challenge.viewmodel.models.SearchPresentationModel

fun RepositorySearchResponseModel.toPresentation() = SearchPresentationModel(
    name = this.name ?: "",
    fullName = this.fullName ?: "",
    description = this.description ?: "",
    owner = this.owner?.toPresentation(),
    stargazersCount = this.stargazersCount ?: 0,
    forksCount = this.forksCount ?: 0
)

fun MutableList<RepositorySearchResponseModel>.toPresentation() =
    map { it.toPresentation() }.toMutableList()

fun SearchPresentationModel.toUI() = SearchUIModel(
    repositoryName = this.name,
    repositoryDescription = this.description,
    authorName = this.owner?.login ?: "",
    authorFullName = this.fullName ?: "",
    authorPhoto = this.owner?.avatarUrl ?: "",
    repositoryStars = this.stargazersCount,
    repositoryFork = this.forksCount
)

fun MutableList<SearchPresentationModel>.toUI() =
    map { it.toUI() }.toMutableList()
