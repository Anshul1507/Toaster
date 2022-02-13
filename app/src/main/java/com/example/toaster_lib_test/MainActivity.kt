package com.example.toaster_lib_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toaster.Toaster

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toaster = Toaster()
        toaster.display(this, "Hello Android")
    }
}