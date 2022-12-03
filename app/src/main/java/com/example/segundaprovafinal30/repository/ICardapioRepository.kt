package com.example.segundaprovafinal30.repository

import com.example.segundaprovafinal30.model.Cardapio
import kotlinx.coroutines.flow.Flow

interface ICardapioRepository {
    fun listAll(): Flow<List<Cardapio>>
    fun create(c: Cardapio)
}