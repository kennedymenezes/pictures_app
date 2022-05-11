package com.kennedymenezes.catpictures.utils.di

import com.kennedymenezes.catpictures.dashboard.data.api.ImgWebService
import com.kennedymenezes.catpictures.dashboard.data.api.ImgWebServiceImp
import org.koin.dsl.module

val webServiceModule = module {
        single <ImgWebService>{ ImgWebServiceImp() }
}