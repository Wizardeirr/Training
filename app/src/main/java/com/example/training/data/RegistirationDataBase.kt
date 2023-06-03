package com.example.training.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RegistrationData::class], version = 1)
abstract class RegistirationDataBase: RoomDatabase() {

    abstract fun registirationDao():RegistirationDao

    companion object{
        @Volatile
        private var instance:RegistirationDataBase?=null
        fun getRegistirationDataBase(context:Context):RegistirationDataBase?{
            if (instance==null){
                instance=Room.databaseBuilder(context,RegistirationDataBase::class.java,"reg")
                    .build()
            }
            return instance
        }
    }
}