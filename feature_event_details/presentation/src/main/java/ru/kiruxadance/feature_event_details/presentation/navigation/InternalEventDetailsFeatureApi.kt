package ru.kiruxadance.feature_event_details.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import ru.kiruxadance.core.common.navigation_constants.EventDetailsFeature
import ru.kiruxadance.core.feature_api.FeatureApi
import ru.kiruxadance.feature_event_details.presentation.EventDetailsScreen
import ru.kiruxadance.feature_event_details.presentation.EventDetailsViewModel

internal object InternalEventDetailsFeatureApi : FeatureApi{
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(startDestination = EventDetailsFeature.EventsDetailsScreenRoute, route = EventDetailsFeature.nestedRoute) {
            composable(EventDetailsFeature.EventsDetailsScreenRoute) {
                val viewModel = hiltViewModel<EventDetailsViewModel>()
                EventDetailsScreen(viewModel = viewModel, navController)
            }
        }
    }
}