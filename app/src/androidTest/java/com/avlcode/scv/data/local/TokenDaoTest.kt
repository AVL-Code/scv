package com.avlcode.scv.data.local

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.avlcode.scv.data.local.dao.TokenDao
import com.avlcode.scv.data.local.entity.TokenEntity
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class TokenDaoTest {
    private lateinit var tokenDao: TokenDao
    private lateinit var db: AppDatabase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<android.content.Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, AppDatabase::class.java).build()
        tokenDao = db.tokenDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun insertAndGetToken() = runBlocking {
        val token = TokenEntity(
            deviceId = "device123",
            tokenHash = "hashxyz123",
            status = "VALID",
            validatedAt = System.currentTimeMillis()
        )
        tokenDao.insertToken(token)
        val loaded = tokenDao.getToken("device123")
        assertNotNull(loaded)
        assertEquals("hashxyz123", loaded?.tokenHash)
        assertEquals("VALID", loaded?.status)
    }
}
