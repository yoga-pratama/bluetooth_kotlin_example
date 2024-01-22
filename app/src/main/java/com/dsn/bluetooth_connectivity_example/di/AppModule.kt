package com.dsn.bluetooth_connectivity_example.di

import android.content.Context
import com.dsn.bluetooth_connectivity_example.data.chat.AndroidBluetoohController
import com.dsn.bluetooth_connectivity_example.domain.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context: Context): BluetoothController {
        return AndroidBluetoohController(context)
    }
}