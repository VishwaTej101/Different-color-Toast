package com.vishwa.coloredtoast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast= Toast.makeText(this@MainActivity,"This is a Toast",Toast.LENGTH_SHORT)
        val view=toast.view
        view.setBackgroundResource(R.drawable.toast_drawable)
        val toastText=toast.view.findViewById<TextView>(android.R.id.message)
        toastText.setTextColor(Color.parseColor("#FFFFFF"))
        toast.show()
    }
}