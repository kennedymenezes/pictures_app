package com.kennedymenezes.catpictures.dashboard.data.api

import com.kennedymenezes.catpictures.dashboard.data.response.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface ImgWebService {

    @GET("3/gallery/search/?q=cats")
    suspend fun getCatsImages(@Header("Authorization") key: String) : Response<ImageResponse>
}