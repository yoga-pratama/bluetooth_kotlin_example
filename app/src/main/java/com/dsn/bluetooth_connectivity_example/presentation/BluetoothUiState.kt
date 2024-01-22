package com.dsn.bluetooth_connectivity_example.presentation

import com.dsn.bluetooth_connectivity_example.domain.chat.BluetoothDevice


data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage : String? = null
)
