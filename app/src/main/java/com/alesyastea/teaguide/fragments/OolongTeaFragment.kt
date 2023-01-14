package com.alesyastea.teaguide.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.alesyastea.teaguide.R
import kotlinx.android.synthetic.main.fragment_oolong_tea.*
import kotlinx.android.synthetic.main.fragment_puerh_tea.*

class OolongTeaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_oolong_tea, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ot_plant.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.mainFragment)
        }
    }

}