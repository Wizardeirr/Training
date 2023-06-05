package com.example.training.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Ignore
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.google.android.material.circularreveal.CircularRevealHelper.Strategy

@Dao
interface RegistirationDao {

    @Insert
     suspend fun insertAll(register: RegistrationData)

    @Query("DELETE FROM userInformation")
    suspend fun deleteAllUsers()

    @Query("SELECT * FROM userInformation")
    suspend fun getUsers(): List<RegistrationData>
}