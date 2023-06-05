package com.example.training.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.training.Repository
import com.example.training.data.RegistrationData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel(private val repository: Repository,application: Application
) : AndroidViewModel(application) {

     fun insertUser(registerData: RegistrationData) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(registerData)
        }
    }

     suspend fun getUsers(): List<RegistrationData> {
        return repository.getUsers()
    }


    fun deleteAllUsers() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllUsers()
        }
    }



}