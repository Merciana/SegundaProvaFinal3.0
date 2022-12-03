package com.example.segundaprovafinal30.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.segundaprovafinal30.databinding.FragmentHomeBinding
import com.example.segundaprovafinal30.ui.home.adapter.CardapioAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private lateinit var _viewmodel:HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root : View = _binding.root

        _binding.viewmodel = _viewmodel
        _binding.lifecycleOwner = this

        val adapter = CardapioAdapter()

        _viewmodel.cardapios.observe(viewLifecycleOwner){
            adapter.submitList(it)
        }

        _binding.recyclerview.adapter = adapter

        return _binding.root
    }

}