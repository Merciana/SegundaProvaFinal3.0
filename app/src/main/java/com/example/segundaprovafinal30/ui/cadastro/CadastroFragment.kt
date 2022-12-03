package com.example.segundaprovafinal30.ui.cadastro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.segundaprovafinal30.databinding.FragmentCadastroBinding

class CadastroFragment : Fragment() {

    private lateinit var binding: FragmentCadastroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCadastroBinding.inflate(inflater, container, false)
        val root : View = binding.root
        return root
    }

}