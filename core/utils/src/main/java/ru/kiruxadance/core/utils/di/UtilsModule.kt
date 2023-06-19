package ru.kiruxadance.core.utils.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.kiruxadance.core.utils.notification.NotificationApi
import ru.kiruxadance.core.utils.providers.NotificationProvider

@Module
@InstallIn(SingletonComponent::class)
object UtilsModule {

    @Provides
    fun provideNotificationApi(): NotificationApi {
        return NotificationApi()
    }

    @Provides
    fun provideNotificationProvider(notificationApi: NotificationApi): NotificationProvider {
        return NotificationProvider(notificationApi)
    }
}