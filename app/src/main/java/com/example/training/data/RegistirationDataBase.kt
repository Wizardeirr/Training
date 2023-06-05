package com.example.training.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.Transaction

@Database(entities = [RegistrationData::class], version = 2)
abstract class RegistirationDataBase: RoomDatabase() {

    abstract fun registirationDao():RegistirationDao

    companion object {
        @Volatile
        private var instance: RegistirationDataBase? = null

        fun getInstance(context: Context): RegistirationDataBase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): RegistirationDataBase {
            return Room.databaseBuilder(
                context.applicationContext,
                RegistirationDataBase::class.java,
                "my-database"
            ).build()
        }
    }

}