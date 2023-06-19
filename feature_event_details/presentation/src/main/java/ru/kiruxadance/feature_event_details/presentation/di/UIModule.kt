package ru.kiruxadance.feature_event_details.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kiruxadance.feature_event_details.presentation.navigation.EventDetailsApi
import ru.kiruxadance.feature_event_details.presentation.navigation.EventDetailsApiImpl

@Module
@InstallIn(SingletonComponent::class)
object UIModule {

    @Provides
    fun provideEventDetailsApi(): EventDetailsApi {
        return EventDetailsApiImpl()
    }
}