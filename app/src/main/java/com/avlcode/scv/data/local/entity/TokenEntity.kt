package com.avlcode.scv.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "token")
data class TokenEntity(
    @PrimaryKey
    val deviceId: String,
    val tokenHash: String,
    val status: String,
    val validatedAt: Long
)
