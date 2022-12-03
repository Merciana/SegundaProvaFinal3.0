package com.example.segundaprovafinal30.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Cardapio(var nome:String, var valor:Float, var ingredientes:String, var tipoComida:String, var localidade:String, var calorias:Float){

    @PrimaryKey(autoGenerate = true)
    var id:Long = 0
}