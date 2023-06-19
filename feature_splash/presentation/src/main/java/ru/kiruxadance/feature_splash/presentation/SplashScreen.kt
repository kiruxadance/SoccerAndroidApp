package ru.kiruxadance.feature_splash.presentation

import android.os.CountDownTimer
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import ru.kiruxadance.core.common.navigation_constants.EventListFeature
import ru.kiruxadance.core.common.navigation_constants.SplashFeature
import kotlin.time.Duration.Companion.seconds

@Composable
fun SplashScreen(
    viewModel: SplashViewModel,
    navController: NavController
) {
    val scaffoldState = rememberScaffoldState()
    var ticks by remember { mutableStateOf(0) }
    LaunchedEffect(Unit) {
        while(true) {
            delay(1.seconds)
            ticks++
            if (ticks == 5) {
                navController.navigate(EventListFeature.EventsScreenRoute) {
                    popUpTo(SplashFeature.SplashScreenRoute) {
                        inclusive = true
                    }
                }
            }
        }
    }

    Scaffold(scaffoldState = scaffoldState) {contentPadding ->
        Box(modifier = Modifier.padding(contentPadding)) {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Image(modifier = Modifier.height(64.dp), imageVector = Icons.Default.Favorite, contentDescription = null)
            }
        }
    }
}