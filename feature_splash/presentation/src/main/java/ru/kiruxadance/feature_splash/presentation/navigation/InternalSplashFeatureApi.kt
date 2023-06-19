package ru.kiruxadance.feature_splash.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import ru.kiruxadance.core.common.navigation_constants.EventListFeature
import ru.kiruxadance.core.common.navigation_constants.SplashFeature
import ru.kiruxadance.core.feature_api.FeatureApi
import ru.kiruxadance.feature_splash.presentation.SplashScreen
import ru.kiruxadance.feature_splash.presentation.SplashViewModel

internal object InternalSplashFeatureApi : FeatureApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(startDestination = SplashFeature.SplashScreenRoute, route = SplashFeature.nestedRoute) {
            composable(SplashFeature.SplashScreenRoute) {
                val viewModel = hiltViewModel<SplashViewModel>()
                SplashScreen(viewModel = viewModel, navController = navController)
            }
        }
    }
}