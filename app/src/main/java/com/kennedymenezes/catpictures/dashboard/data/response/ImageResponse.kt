package com.kennedymenezes.catpictures.dashboard.data.response

import com.google.gson.annotations.SerializedName

data class ImageResponse(
    @SerializedName("data")
    val data: Data
)

data class Data(
    @SerializedName("images")
    val imagesList: List<Image>
)

data class Image(
    @SerializedName("id")
    val id: String,
    @SerializedName("link")
    val imgUrl: String
)
