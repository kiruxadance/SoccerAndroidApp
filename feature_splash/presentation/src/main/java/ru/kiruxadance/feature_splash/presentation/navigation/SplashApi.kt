package ru.kiruxadance.feature_splash.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import ru.kiruxadance.core.feature_api.FeatureApi

interface SplashApi : FeatureApi

class SplashApiImpl : SplashApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalSplashFeatureApi.registerGraph(navController, navGraphBuilder)
    }
}