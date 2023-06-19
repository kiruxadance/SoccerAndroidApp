package ru.kiruxadance.feature_event_list.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import ru.kiruxadance.core.common.navigation_constants.EventListFeature
import ru.kiruxadance.core.common.navigation_constants.SplashFeature
import ru.kiruxadance.core.feature_api.FeatureApi
import ru.kiruxadance.feature_event_list.presentation.EventsScreen
import ru.kiruxadance.feature_event_list.presentation.EventsViewModel

internal object InternalEventsFeatureApi : FeatureApi{
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(startDestination = EventListFeature.EventsScreenRoute, route = EventListFeature.nestedRoute) {
            composable(EventListFeature.EventsScreenRoute) {
                val viewModel = hiltViewModel<EventsViewModel>()
                EventsScreen(viewModel = viewModel, navController = navController)
            }
        }
    }
}