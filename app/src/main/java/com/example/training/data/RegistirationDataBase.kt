package com.example.training.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.Transaction

@Database(entities = [RegistrationData::class], version = 1)
abstract class RegistirationDataBase: RoomDatabase() {

    abstract fun registirationDao():RegistirationDao

    companion object{
      private var INSTANCE:RegistirationDataBase?=null
        fun getInfos(context: Context):RegistirationDataBase{
            val tempInstance= INSTANCE
            if (tempInstance!=null){
                return tempInstance
            }
            synchronized(this){
                val instance=Room.databaseBuilder(
                    context.applicationContext,
                    RegistirationDataBase::class.java,
                    "app").build()
                INSTANCE=instance
                return instance
            }
        }
    }

}