package com.example.demoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demoapp.databinding.FragmentMainActivity2Binding
import kotlinx.android.synthetic.main.fragment_main_activity1.*
import kotlinx.android.synthetic.main.fragment_main_activity2.*

class MainActivity2 : Fragment() , InteractionListener{

    private lateinit var binding: FragmentMainActivity2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main_activity2, container, false)

        // Inflate the layout for this fragment
       binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_mainActivity2_to_mainActivity1)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        (activity as MainActivity?)?.timerMethod()
        (activity as MainActivity?)?.interactionListener = null
    }

    override fun onInteract() {
        TODO("Not yet implemented")
    }
}