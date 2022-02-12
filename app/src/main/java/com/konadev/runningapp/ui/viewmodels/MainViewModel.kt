package com.konadev.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.konadev.runningapp.db.Run
import com.konadev.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val mainRepository: MainRepository): ViewModel() {

    fun insertRun(run: Run) {
        viewModelScope.launch {
            mainRepository.insertRun(run)
        }
    }
}