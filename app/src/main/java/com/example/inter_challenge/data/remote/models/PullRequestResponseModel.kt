package com.example.inter_challenge.data.remote.models

import com.google.gson.annotations.SerializedName

data class PullRequestResponseModel(
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("body")
    var body: String? = null,
    @SerializedName("user")
    var user: UserPullRequestResponseModel? = null,
    @SerializedName("html_url")
    var htmlUrl: String? = null,
    @SerializedName("created_at")
    var createdAt: String? = null
) {

    companion object {
        val dummy = PullRequestResponseModel(
            title = "pr-title",
            body = "pr-body-description",
            user = UserPullRequestResponseModel.dummy,
            htmlUrl = "https://github.com/iluwatar/java-design-patterns/pull/2017",
            createdAt = "2022-07-17T07:15:02Z"
        )
        val dummyList = mutableListOf(dummy, dummy, dummy, dummy, dummy, dummy)
    }

}