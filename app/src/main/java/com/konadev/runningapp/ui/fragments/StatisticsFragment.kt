package com.konadev.runningapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.konadev.runningapp.R
import com.konadev.runningapp.ui.viewmodels.StatisticsViewModel
import com.konadev.runningapp.utils.TrackingUtility
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_statistics.*
import kotlin.math.round

@AndroidEntryPoint
class StatisticsFragment: Fragment(R.layout.fragment_statistics) {

    private val statisticsViewModel: StatisticsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeToObservers()
    }

    private fun subscribeToObservers() {
        statisticsViewModel.totalTimeRun.observe(viewLifecycleOwner, {
           it?.let {
               val totalTimeRun = TrackingUtility.getFormattedStopWatchTime(it)
               tvTotalTime.text = totalTimeRun
           }
        })
        statisticsViewModel.totalDistance.observe(viewLifecycleOwner, {
            it?.let {
               val km = it / 1000F
                val totalDistance = round(km * 10F) / 10f
                val totalDistanceString = "${totalDistance}Km"
                tvTotalDistance.text = totalDistanceString
            }
        })
        statisticsViewModel.totalAvgSpeed.observe(viewLifecycleOwner, {
            it?.let {
                val avgSpeed = round(it * 10f) / 10f
                val avgSpeedString = "${avgSpeed}Km/h"
                tvAverageSpeed.text = avgSpeedString
            }
        })
        statisticsViewModel.totalCaloriesBurned.observe(viewLifecycleOwner, {
            it?.let {
                val totalCalories = "${it}Kcal"
                tvTotalCalories.text = totalCalories
            }
        })
    }
}