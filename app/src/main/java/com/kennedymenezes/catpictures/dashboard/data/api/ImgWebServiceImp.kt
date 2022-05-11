package com.kennedymenezes.catpictures.dashboard.data.api

import com.kennedymenezes.catpictures.dashboard.data.response.ImageResponse
import com.kennedymenezes.catpictures.utils.Constraints
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ImgWebServiceImp : ImgWebService {

    private val webService = Retrofit
        .Builder()
        .baseUrl(Constraints.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ImgWebService::class.java)

    override suspend fun getCatsImages(key: String): Response<ImageResponse> {
        val teste = webService.getCatsImages(key)
        print(teste)
        return teste
    }
}