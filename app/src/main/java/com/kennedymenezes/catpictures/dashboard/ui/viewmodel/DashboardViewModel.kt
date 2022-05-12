package com.kennedymenezes.catpictures.dashboard.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kennedymenezes.catpictures.dashboard.data.response.ImageResponse
import com.kennedymenezes.catpictures.dashboard.domain.repository.ImageRepository
import kotlinx.coroutines.launch

class DashboardViewModel(
    private val imageRepository: ImageRepository
) : ViewModel() {

    private val _catsList = MutableLiveData<ImageResponse>()
    val catsList: LiveData<ImageResponse> = _catsList

    fun getCatsImg(){
        viewModelScope.launch {
            _catsList.value = imageRepository.getCatsImages()
        }
    }
}