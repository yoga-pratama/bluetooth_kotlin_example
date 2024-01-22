package com.dsn.bluetooth_connectivity_example.presentation

import com.dsn.bluetooth_connectivity_example.domain.chat.BluetoothDevice


data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)
