package com.kennedymenezes.catpictures.dashboard.domain.repository

import com.kennedymenezes.catpictures.dashboard.data.api.ImgWebService
import com.kennedymenezes.catpictures.dashboard.data.api.ImgWebServiceImp
import com.kennedymenezes.catpictures.dashboard.data.response.ImageResponse
import com.kennedymenezes.catpictures.utils.Constraints
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class ImageRepository(private val webService: ImgWebService) {

    suspend fun getCatsImages(): ImageResponse? {
        return withContext(Dispatchers.Default){
            val response = webService.getCatsImages(Constraints.APY_KEY)
            threatResponse(response)
        }
    }

    private fun <T> threatResponse(response: Response<T>): T? {
        return if (response.isSuccessful) {
            response.body()
        } else null
    }
}