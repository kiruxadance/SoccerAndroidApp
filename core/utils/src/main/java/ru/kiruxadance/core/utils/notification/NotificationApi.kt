package ru.kiruxadance.core.utils.notification

import android.content.Context
import com.onesignal.OneSignal

class NotificationApi {
    private val ONESIGNAL_APP_ID = "19bcfff7-bfa3-4b6e-9b3f-0693e209f05c"

    fun init(context: Context) {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(context)
        OneSignal.setAppId(ONESIGNAL_APP_ID)

        OneSignal.promptForPushNotifications();
    }
}