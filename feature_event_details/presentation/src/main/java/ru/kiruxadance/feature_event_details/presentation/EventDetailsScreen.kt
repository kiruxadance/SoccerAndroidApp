package ru.kiruxadance.feature_event_details.presentation

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController

@Composable
fun EventDetailsScreen(
    viewModel: EventDetailsViewModel,
    navController: NavController
) {
    val scaffoldState = rememberScaffoldState()

    Scaffold ( scaffoldState = scaffoldState ) {contentPadding ->
        Box(modifier = Modifier.fillMaxSize().padding(contentPadding)) {
            Column(modifier = Modifier.fillMaxSize()) {
                viewModel.initNotification(LocalContext.current)
                Content()
            }
        }
    }
}

@Composable
fun Content(){
    val mUrl = "https://spb.hh.ru/"

    AndroidView(factory = {
        WebView(it).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            webViewClient = WebViewClient()
            loadUrl(mUrl)
        }
    }, update = {
        it.loadUrl(mUrl)
    })
}
