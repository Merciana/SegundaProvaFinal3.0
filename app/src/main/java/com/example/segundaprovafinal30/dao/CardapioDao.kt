package com.example.segundaprovafinal30.dao

import androidx.room.*
import com.example.segundaprovafinal30.model.Cardapio
import kotlinx.coroutines.flow.Flow

@Dao
interface CardapioDao {
    @Query("SELECT * FROM cardapio")
    fun listAll(): Flow<List<Cardapio>>
    @Query("SELECT * FROM cardapio where id=:id")
    fun findById(id:Long):Cardapio?
    @Delete
    fun delete(c:Cardapio)
    @Update
    fun update(c:Cardapio)
    @Insert
    fun create(c: Cardapio)
}