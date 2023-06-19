package ru.kiruxadance.feature_event_details.presentation

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.kiruxadance.core.utils.notification.NotificationApi
import ru.kiruxadance.core.utils.providers.NotificationProvider
import javax.inject.Inject

@HiltViewModel
class EventDetailsViewModel @Inject constructor(
    private val notificationProvider: NotificationProvider
) : ViewModel(){

  fun initNotification(context: Context) {
      notificationProvider.init(context)
  }
}