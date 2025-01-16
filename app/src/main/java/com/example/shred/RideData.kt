package com.example.shred

data class RideData(
    val id: String? = null,
    val userId: String,
    val dateTime: String,
    val location: String,
    val difficulty: String,
    val sport: String
)