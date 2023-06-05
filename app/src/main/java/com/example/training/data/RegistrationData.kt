package com.example.training.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "userInformation")
data class RegistrationData(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=null,
    val userName:String,
    val userSurname:String,
    val userAge:Int,
    val password:String,
    val userPhone:Int,
    val userEmail:String,

)