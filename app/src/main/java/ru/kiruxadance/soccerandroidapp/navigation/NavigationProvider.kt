package ru.kiruxadance.soccerandroidapp.navigation

import ru.kiruxadance.feature_event_details.presentation.navigation.EventDetailsApi
import ru.kiruxadance.feature_event_list.presentation.navigation.EventsApi
import ru.kiruxadance.feature_splash.presentation.navigation.SplashApi

data class NavigationProvider(
    val EventsApi: EventsApi,
    val EventDetailsApi: EventDetailsApi,
    val SplashApi: SplashApi
)
