package com.dsn.bluetooth_connectivity_example.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.dsn.bluetooth_connectivity_example.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain() : BluetoothDeviceDomain{
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}
