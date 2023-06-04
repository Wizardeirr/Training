package com.example.training.data

import androidx.lifecycle.LiveData

class Repository(private val registirationDao: RegistirationDao) {

    val allInformations: LiveData<List<RegistrationData>> = registirationDao.getAllUserInformation()

      fun insert(register:RegistrationData){
        registirationDao.insertAll(register)
    }
    suspend fun delete(register:RegistrationData){
        registirationDao.deleteAll(register)
    }
    suspend fun update(register:RegistrationData){
        registirationDao.update(register)
    }
}