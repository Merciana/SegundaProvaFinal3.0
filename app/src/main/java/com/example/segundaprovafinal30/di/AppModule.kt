package com.example.segundaprovafinal30.di

import android.app.Application
import com.example.segundaprovafinal30.dao.CardapioDao
import com.example.segundaprovafinal30.database.CardapioDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun getDatabase(applicationContext: Application):CardapioDatabase{
        return CardapioDatabase.invoke(applicationContext)
    }

    @Singleton
    @Provides
    fun getDao(database: CardapioDatabase): CardapioDao {
        return database.cardapioDao()
    }
}