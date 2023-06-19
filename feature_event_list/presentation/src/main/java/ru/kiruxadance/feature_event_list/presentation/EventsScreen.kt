package ru.kiruxadance.feature_event_list.presentation

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import ru.kiruxadance.feature_event_list.domain.model.Match

@Composable
fun EventsScreen(
    viewModel: EventsViewModel,
    navController: NavController
) {
    val scaffoldState = rememberScaffoldState()
    val result = viewModel.matchList.value

    Scaffold(scaffoldState = scaffoldState) {contentPadding ->
        Box(modifier = Modifier
            .padding(contentPadding)
            .fillMaxSize()) {
            Column(modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .fillMaxSize()) {
                if (result.isLoading) {
                    Loading()
                }
                if (result.error.isNotBlank()) {
                   Error(message = result.error)
                }
                result.data?.let {
                    Content(items = result.data, navController = navController)
                }
            }
        }
    }
}

@Composable
fun Loading() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CircularProgressIndicator()
    }
}

@Composable
fun Error(message: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = message)
    }
}

@Composable
fun Content(navController: NavController, items: List<Match>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items) {
            MatchItem(modifier = Modifier
                .fillMaxSize()
                .clickable {
                    navController.navigate("event_details_screen_route")
                }, match = it
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun MatchItem(modifier: Modifier, match: Match) {
    Card(modifier = modifier, elevation = 3.dp, shape = RoundedCornerShape(4.dp)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth().padding(top = 16.dp), horizontalArrangement = Arrangement.Center) {
                Column(horizontalAlignment = Alignment.Start) {
                    Image(modifier = Modifier.height(64.dp), painter = rememberAsyncImagePainter(model = match.teams.away.img), contentDescription = null, contentScale = ContentScale.Crop)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = match.teams.away.name)
                }

                Column(modifier = Modifier.padding(horizontal = 32.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = match.league.name, color = Color.LightGray)
                    Text(text = "${match.scores.away_score} : ${match.scores.home_score}", fontSize = 32.sp)
                    Text(text = match.time.minute.toString())
                }

                Column(horizontalAlignment = Alignment.End) {
                    Image(modifier = Modifier.height(64.dp), painter = rememberAsyncImagePainter(model = match.teams.home.img), contentDescription = null, contentScale = ContentScale.Crop)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = match.teams.home.name)
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}