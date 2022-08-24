package com.example.inter_challenge.data.remote.models

import com.google.gson.annotations.SerializedName

data class SearchResponseModel(
    @SerializedName("total_count")
    var totalCount: Int? = null,
    @SerializedName("incomplete_results")
    var incompleteResults: Boolean? = null,
    @SerializedName("items")
    var items: List<RepositorySearchResponseModel> = listOf()
) {

    companion object {
        val dummy = SearchResponseModel(
            totalCount = 3,
            incompleteResults = true,
            items = RepositorySearchResponseModel.dummyList
        )
    }

}