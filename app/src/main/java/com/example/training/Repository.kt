package com.example.training

import androidx.lifecycle.LiveData
import com.example.training.data.RegistirationDao
import com.example.training.data.RegistrationData

class Repository(private val registirationDao: RegistirationDao) {



      suspend fun insert(register: RegistrationData){
        registirationDao.insertAll(register)
    }
    suspend fun getUsers(): List<RegistrationData> {
        return registirationDao.getUsers()
    }
    suspend fun deleteAllUsers() {
        registirationDao.deleteAllUsers()
    }
}