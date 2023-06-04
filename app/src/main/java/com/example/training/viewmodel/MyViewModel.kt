package com.example.training.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.training.data.RegistirationDataBase
import com.example.training.data.RegistrationData
import com.example.training.data.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MyViewModel(application: Application):ViewModel() {


    val repository:Repository
    val allInformation:LiveData<List<RegistrationData>>
    init {
        val dao= RegistirationDataBase.getInfos(application).registirationDao()
        repository= Repository(dao)
        allInformation=repository.allInformations
    }

    fun deleteInfo(regi: RegistrationData)=viewModelScope.launch(Dispatchers.IO){
        repository.delete(regi)
    }
    fun updateInfo(regi:RegistrationData)=viewModelScope.launch(Dispatchers.IO){
        repository.update(regi)
    }
    fun addUser(regi: RegistrationData)=viewModelScope.launch(Dispatchers.IO) {
        repository.insert(regi)
    }
}