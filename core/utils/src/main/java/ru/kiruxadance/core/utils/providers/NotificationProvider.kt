package ru.kiruxadance.core.utils.providers

import android.content.Context
import ru.kiruxadance.core.utils.notification.NotificationApi
import javax.inject.Inject

class NotificationProvider @Inject constructor(
    private val notificationApi: NotificationApi
){
    fun init(context: Context) = notificationApi.init(context)
}