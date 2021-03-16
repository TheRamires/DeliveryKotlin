package com.example.deliverykotlin.components.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.deliverykotlin.R
import com.example.deliverykotlin.databinding.FragmentMenuConteinerBinding
import com.google.android.material.tabs.TabLayoutMediator

class MenuConteinerFragment : Fragment() {

    private lateinit var titleList: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=FragmentMenuConteinerBinding.inflate(inflater)
        binding.setFragment(this)
        val view =binding.root

        titleList=resources.getStringArray(R.array.title)

        val tabLayout=binding.tabs
        val viewPager=binding.pager
        val adapter: FragmentStateAdapter = PagerAdapterMenu(requireActivity())
        viewPager.adapter = adapter
        TabLayoutMediator(
            tabLayout, viewPager
        ) { tab, position -> tab.setText(titleList.get(position)) }.attach()

        return view
    }
}