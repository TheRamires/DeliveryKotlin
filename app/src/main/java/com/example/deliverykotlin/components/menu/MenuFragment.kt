package com.example.deliverykotlin.components.menu

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.deliverykotlin.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MenuFragment : Fragment() {
    private lateinit var actionBar:ActionBar

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_menu, container, false)
        val customView=inflater.inflate(R.layout.custom_button_menu, null).also {
            it.findViewById<TextView>(R.id.btn_menu).text="Sections"
            it.setOnClickListener {
                    v->
               Navigation.findNavController(view).navigate(R.id.action_navigation_menu_to_menuConteinerFragment2)
            }
        }

        actionBar= (activity as AppCompatActivity)!!.supportActionBar!!
        actionBar?.setCustomView(customView)
        actionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        actionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_TITLE);
    }
}