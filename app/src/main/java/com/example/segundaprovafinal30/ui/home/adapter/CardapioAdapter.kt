package com.example.segundaprovafinal30.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.segundaprovafinal30.databinding.CardapioListItemBinding
import com.example.segundaprovafinal30.model.Cardapio

class CardapioAdapter : ListAdapter<Cardapio, CardapioAdapter.CardapioViewHolder>(CardapioDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardapioViewHolder {
        return CardapioViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: CardapioViewHolder, position: Int) {
        val cardapio = getItem(position)
        holder.bind(cardapio)
    }

    class CardapioViewHolder private constructor(var binding: CardapioListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(cardapio: Cardapio) {
            binding.textViewNome.text = cardapio.nome
            binding.textViewValor.text = cardapio.valor.toString()

            binding.textViewNome.setOnClickListener {
                Toast.makeText(binding.root.context, "CLicou", Toast.LENGTH_SHORT).show()
            }
        }

        companion object {
            fun from(parent: ViewGroup): CardapioViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = CardapioListItemBinding.inflate(inflater, parent, false)
                return CardapioViewHolder(binding)
            }
        }
    }


    class CardapioDiffCallback : DiffUtil.ItemCallback<Cardapio>() {
        override fun areItemsTheSame(oldItem: Cardapio, newItem: Cardapio): Boolean {
            return oldItem.equals(newItem.id)
        }

        override fun areContentsTheSame(oldItem: Cardapio, newItem: Cardapio): Boolean {
            return oldItem.equals(newItem)
        }
    }
}