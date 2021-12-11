package com.konadev.runningapp.di

import android.content.Context
import androidx.room.Room
import com.konadev.runningapp.db.RunningDataBase
import com.konadev.runningapp.utils.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDataBase(@ApplicationContext app: Context) {
        Room.databaseBuilder(
            app, RunningDataBase::class.java, RUNNING_DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideRunDao(db: RunningDataBase) = db.runDao()
}