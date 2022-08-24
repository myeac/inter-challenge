package com.example.inter_challenge.data.remote.models

import com.google.gson.annotations.SerializedName

data class UserPullRequestResponseModel(
    @SerializedName("login")
    var login: String? = null,
    @SerializedName("avatar_url")
    var avatarUrl: String? = null,
    @SerializedName("url")
    var url: String? = null
) {

    companion object {
        val dummy = UserPullRequestResponseModel(
            login = "miguelyeac",
            avatarUrl = "https://avatars.githubusercontent.com/u/582346?v=4",
            url = "https://api.github.com/users/YichuanSun"
        )
    }

}
