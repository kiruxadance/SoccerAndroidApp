package ru.kiruxadance.feature_event_list.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kiruxadance.feature_event_list.presentation.navigation.EventsApi
import ru.kiruxadance.feature_event_list.presentation.navigation.EventsApiImpl

@Module
@InstallIn(SingletonComponent::class)
object UIModule {
    @Provides
    fun provideEventsApi(): EventsApi {
        return EventsApiImpl()
    }
}