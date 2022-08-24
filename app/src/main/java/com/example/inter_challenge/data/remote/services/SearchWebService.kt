package com.example.inter_challenge.data.remote.services

import com.example.inter_challenge.data.remote.services.SearchObject.GITHUB_SEARCH
import com.example.inter_challenge.data.remote.services.SearchObject.GITHUB_SEARCH_JAVA
import com.example.inter_challenge.data.remote.services.SearchObject.GITHUB_SEARCH_PAGE
import com.example.inter_challenge.data.remote.services.SearchObject.GITHUB_SEARCH_STARS
import com.example.inter_challenge.data.remote.models.SearchResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchWebService {

    @GET(GITHUB_SEARCH)
    suspend fun getSearchStarredJavaRepositories(
        @Query(GITHUB_SEARCH_JAVA) language: String,
        @Query(GITHUB_SEARCH_STARS) sort: String,
        @Query(GITHUB_SEARCH_PAGE) page: String
    ): Response<SearchResponseModel>

}

object SearchObject {
    const val GITHUB_SEARCH_JAVA = "Java"
    const val GITHUB_SEARCH_STARS = "stars"
    const val GITHUB_SEARCH_PAGE = "page"
    const val GITHUB_SEARCH = "search/repositories?q=language:${GITHUB_SEARCH_JAVA}&sort=${GITHUB_SEARCH_STARS}&page=${GITHUB_SEARCH_PAGE}"
}