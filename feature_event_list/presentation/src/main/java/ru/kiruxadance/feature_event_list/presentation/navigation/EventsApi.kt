package ru.kiruxadance.feature_event_list.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import ru.kiruxadance.core.feature_api.FeatureApi

interface EventsApi : FeatureApi

class EventsApiImpl: EventsApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalEventsFeatureApi.registerGraph(navController, navGraphBuilder)
    }
}