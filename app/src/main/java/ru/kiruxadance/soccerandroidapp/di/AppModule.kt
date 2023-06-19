package ru.kiruxadance.soccerandroidapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kiruxadance.feature_event_details.presentation.navigation.EventDetailsApi
import ru.kiruxadance.feature_event_list.presentation.navigation.EventsApi
import ru.kiruxadance.feature_splash.presentation.navigation.SplashApi
import ru.kiruxadance.soccerandroidapp.navigation.NavigationProvider

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideNavigationProvider(eventsApi: EventsApi, eventDetailsApi: EventDetailsApi, splashApi: SplashApi): NavigationProvider {
        return NavigationProvider(eventsApi, eventDetailsApi, splashApi)
    }
}