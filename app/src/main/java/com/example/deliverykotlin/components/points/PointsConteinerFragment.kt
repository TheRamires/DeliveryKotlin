package com.example.deliverykotlin.components.points

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.deliverykotlin.databinding.FragmentPointsConteinerBinding

class PointsConteinerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding =FragmentPointsConteinerBinding.inflate(inflater)
        binding.setFragment(this)
        val view =binding.root


        return view
    }
}