package com.example.segundaprovafinal30.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.segundaprovafinal30.dao.CardapioDao
import com.example.segundaprovafinal30.model.Cardapio

@Database(entities = [Cardapio::class], version = 2, exportSchema = false)
abstract class CardapioDatabase : RoomDatabase()  {
    abstract fun cardapioDao(): CardapioDao

    companion object{
        @Volatile private var instance:CardapioDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also{ instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context,
                CardapioDatabase::class.java,
                "database.db")
                .fallbackToDestructiveMigration()
                .build()

    }
}