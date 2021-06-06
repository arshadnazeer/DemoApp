package com.example.demoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.demoapp.databinding.FragmentMainActivity1Binding
import kotlinx.android.synthetic.main.fragment_main_activity1.*

class MainActivity1 : Fragment() {

    private lateinit var binding: FragmentMainActivity1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main_activity1, container, false)

        binding.bt1.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainActivity1_to_mainActivity2)
        }
        return binding.root
    }
}