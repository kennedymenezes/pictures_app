package com.kennedymenezes.catpictures.utils.di

import com.kennedymenezes.catpictures.dashboard.ui.viewmodel.DashboardViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { DashboardViewModel(get()) }
}