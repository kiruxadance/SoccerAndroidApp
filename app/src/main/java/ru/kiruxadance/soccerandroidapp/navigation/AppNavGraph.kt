package ru.kiruxadance.soccerandroidapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import ru.kiruxadance.core.common.navigation_constants.EventListFeature
import ru.kiruxadance.core.common.navigation_constants.SplashFeature

@Composable
fun AppNavGraph(
    navController: NavHostController,
    navigationProvider: NavigationProvider
) {
    NavHost(navController = navController, startDestination = SplashFeature.nestedRoute) {
        navigationProvider.EventsApi.registerGraph(navController, this)
        navigationProvider.EventDetailsApi.registerGraph(navController, this)
        navigationProvider.SplashApi.registerGraph(navController, this)
    }
}