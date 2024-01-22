package com.dsn.bluetooth_connectivity_example.domain.chat

sealed interface ConnectionResult {
    data object ConnectionEstablished : ConnectionResult
    data class Error(val message : String) : ConnectionResult

}