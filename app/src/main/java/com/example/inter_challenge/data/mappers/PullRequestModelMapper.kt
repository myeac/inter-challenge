package com.example.inter_challenge.data.mappers

import com.example.inter_challenge.data.remote.models.PullRequestResponseModel
import com.example.inter_challenge.ui.model.PullRequestUIModel
import com.example.inter_challenge.utilities.Constants.DATE_HOUR
import com.example.inter_challenge.utilities.Constants.DATE_HOUR_BR
import com.example.inter_challenge.utilities.extensions.format
import com.example.inter_challenge.utilities.extensions.toDate
import com.example.inter_challenge.viewmodel.models.PullRequestPresentationModel

fun PullRequestResponseModel.toPresentation() = PullRequestPresentationModel(
    title = this.title ?: "",
    body = this.body ?: "",
    user = this.user?.toPresentation(),
    htmlUrl = this.htmlUrl ?: "",
    createdAt = this.createdAt?.toDate(DATE_HOUR)?.format(DATE_HOUR_BR) ?: ""
)

fun MutableList<PullRequestResponseModel>.toPresentation() =
    map { it.toPresentation() }.toMutableList()

fun PullRequestPresentationModel.toUI() = PullRequestUIModel(
    authorName = this.user?.login ?: "",
    authorPhoto = this.user?.avatarUrl ?: "",
    prTitle = this.title,
    prBody = this.body,
    prData = "Criado o día ${this.createdAt}",
    prURL = this.htmlUrl
)

fun MutableList<PullRequestPresentationModel>.toUI() =
    map { it.toUI() }.toMutableList()
