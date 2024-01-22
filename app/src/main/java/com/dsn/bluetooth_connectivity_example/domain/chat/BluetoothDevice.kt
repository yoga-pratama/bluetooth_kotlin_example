package com.dsn.bluetooth_connectivity_example.domain.chat

typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice(
    val name : String?,
    val address : String?
)
