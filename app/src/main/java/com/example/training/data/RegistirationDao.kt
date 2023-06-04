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

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertAll(register: RegistrationData)
    @Delete()
    suspend fun deleteAll(register: RegistrationData)
    @Update
    suspend fun update(register: RegistrationData)

    @Query("SELECT * FROM userInformation")
    fun getAllUserInformation():LiveData<List<RegistrationData>>
}