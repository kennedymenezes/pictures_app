package com.kennedymenezes.catpictures.dashboard.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kennedymenezes.catpictures.dashboard.domain.repository.ImageRepository
import kotlinx.coroutines.launch

class DashboardViewModel(
    private val imageRepository: ImageRepository
) : ViewModel() {

    fun getCatsImg(){
        viewModelScope.launch {
            val aux = imageRepository.getCatsImages()
            println(aux)
        }
    }
}