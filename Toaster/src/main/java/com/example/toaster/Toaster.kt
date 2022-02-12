package com.example.toaster

import android.content.Context
import android.widget.Toast

class Toaster {
    fun display(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}