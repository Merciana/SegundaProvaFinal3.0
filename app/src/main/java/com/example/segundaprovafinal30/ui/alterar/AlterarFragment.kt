package com.example.segundaprovafinal30.ui.alterar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.segundaprovafinal30.databinding.FragmentAlterarBinding
import java.util.zip.Inflater


class AlterarFragment : Fragment() {

    private lateinit var binding : FragmentAlterarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlterarBinding.inflate(inflater, container, false)
        val root : View = binding.root
        return root
    }

}