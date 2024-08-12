package com.example.nawigtionapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_scoent_nawigiton,container, false)
        val fragment1Btn=view.findViewById<Button>(R.id.fiers)
        fragment1Btn.setOnClickListener {
            findNavController().navigate(R.id.action_scoentNawigiton_to_fiersFragment)
        }
        return view
    }
}
