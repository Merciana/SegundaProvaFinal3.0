package com.example.segundaprovafinal30.repository

import com.example.segundaprovafinal30.dao.CardapioDao
import com.example.segundaprovafinal30.model.Cardapio
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CardapioRepository @Inject constructor(private var dao: CardapioDao) : ICardapioRepository {

    override fun listAll(): Flow<List<Cardapio>> {
        return dao.listAll()
    }

    override fun create(c: Cardapio) {
        dao.create(c)
    }
}