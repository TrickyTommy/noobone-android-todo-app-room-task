package com.example.todoappwithroom.data

import androidx.lifecycle.LiveData
import androidx.room.*

interface userDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun  addFavorite(user: User)

    @Update
    suspend fun updateFavorite(user: User)

    @Delete
    suspend fun deleteFavorite(user: User)

    @Query("SELECT * FROM favorite ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

    @Query("DELETE FROM favorite")
    suspend fun deleteAllData()
}