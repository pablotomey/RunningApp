package com.konadev.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.konadev.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(mainRepository: MainRepository): ViewModel() {
}