package com.example.segundaprovafinal30.ui.detalhe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.segundaprovafinal30.databinding.FragmentDetalheBinding

class DetalheFragment : Fragment() {

    private lateinit var binding: FragmentDetalheBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetalheBinding.inflate(inflater, container, false)
        val root : View = binding.root
        return root
    }

}