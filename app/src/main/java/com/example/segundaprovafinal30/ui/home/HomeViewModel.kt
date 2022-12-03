package com.example.segundaprovafinal30.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.segundaprovafinal30.repository.CardapioRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(private var repository: CardapioRepository) : ViewModel() {
    var cardapios = repository.listAll().asLiveData()
}