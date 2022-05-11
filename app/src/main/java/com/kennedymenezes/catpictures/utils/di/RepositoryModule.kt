package com.kennedymenezes.catpictures.utils.di

import com.kennedymenezes.catpictures.dashboard.domain.repository.ImageRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory { ImageRepository(get()) }
}