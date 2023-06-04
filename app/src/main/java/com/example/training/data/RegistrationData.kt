package com.example.training.data

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.UUID


@Entity(tableName = "userInformation")
data class RegistrationData(
    @PrimaryKey(autoGenerate = true)
    val id:Int=0,
    val userName:String,
    val userSurname:String,
    val userAge:Int,
    val password:String,
    val userPhone:Int,
    val userEmail:String,

)