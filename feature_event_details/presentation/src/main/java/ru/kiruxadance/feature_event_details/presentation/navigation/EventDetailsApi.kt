package ru.kiruxadance.feature_event_details.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import ru.kiruxadance.core.feature_api.FeatureApi

interface EventDetailsApi : FeatureApi

class EventDetailsApiImpl : EventDetailsApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalEventDetailsFeatureApi.registerGraph(navController, navGraphBuilder)
    }
}