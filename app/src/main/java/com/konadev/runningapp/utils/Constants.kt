package com.konadev.runningapp.utils

object Constants {

    const val RUNNING_DATABASE_NAME = "running_db"
    const val REQUEST_CODE_LOCATION_PERMISSION = 0
    const val ACTION_START_OR_RESUME_SERVICE = "actionStartOrResumeService"
    const val ACTION_PAUSE_SERVICE = "actionPauseService"
    const val ACTION_STOP_SERVICE = "actionStopService"
    const val ACTION_SHOW_TRACKING_FRAGMENT = "actionShowTrackingFragment"
    const val NOTIFICATION_CHANNEL_ID = "tracking_channel"
    const val NOTIFICATION_CHANNEL_NAME = "Tracking"
    const val NOTIFICATION_ID = 1

    const val LOCATION_UPDATE_INTERVAL = 5000L
    const val FASTEST_LOCATION_INTERVAL = 2000L
}