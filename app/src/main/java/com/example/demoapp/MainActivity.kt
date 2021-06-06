package com.example.demoapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import java.util.*

class MainActivity : AppCompatActivity() , InteractionListener{
    lateinit var timer : Timer

    var interactionListener: InteractionListener? = null

        get() {
            TODO()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timerMethod()

    }

    fun timerMethod(){
       timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                finish()
            }
        }, 5000)
    }

    override fun onInteract() {
        interactionListener?.onInteract()
    }
}