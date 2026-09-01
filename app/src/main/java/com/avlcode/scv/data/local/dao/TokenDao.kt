package com.avlcode.scv.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.avlcode.scv.data.local.entity.TokenEntity

@Dao
interface TokenDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToken(token: TokenEntity): Long

    @Update
    suspend fun updateToken(token: TokenEntity): Int

    @Query("SELECT * FROM token WHERE deviceId = :deviceId LIMIT 1")
    suspend fun getToken(deviceId: String): TokenEntity?
}
