package com.alesyastea.teaguide.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.alesyastea.teaguide.R
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_puerh_tea.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.puerhTeaFragment)
        }

        btn_oolong_tea.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.oolongTeaFragment)
        }

        btn_green_tea.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.greenTeaFragment)
        }

        btn_red_tea.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.redTeaFragment)
        }

        btn_yellow_tea.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.yellowTeaFragment)
        }

        btn_white_tea.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.whiteTeaFragment)
        }

    }
}