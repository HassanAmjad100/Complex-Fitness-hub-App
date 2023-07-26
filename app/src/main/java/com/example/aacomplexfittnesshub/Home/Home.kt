package com.example.aacomplexfittnesshub.Home

import android.content.Intent
import android.location.Location
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aacomplexfittnesshub.R
import com.example.aacomplexfittnesshub.list.ExcerciseList
import com.example.aacomplexfittnesshub.loc.Locat

class Home : AppCompatActivity() {

    lateinit var getLoc: Button
    lateinit var showExcer: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        connector()

    }

    private fun connector() {
        try {

            getLoc = findViewById(R.id.get_locationbtn)
            getLoc.setOnClickListener {
                moveToLocation()
            }
            showExcer = findViewById(R.id.btn_exercisebtn)
            showExcer.setOnClickListener {
                moveToExcerciseList()
            }


        } catch (ex: Exception) {
            Toast.makeText(home@ this, "Exception is ${ex.message}", Toast.LENGTH_LONG)
                .show()
        }
    }

    private fun moveToLocation() {
        try {
            var objIntent = Intent(home@ this, Locat::class.java)
            startActivity(objIntent)
        } catch (ex: Exception) {
            Toast.makeText(home@ this, "moveToLocation: ${ex.message}", Toast.LENGTH_SHORT).show();
        }
    }
    private fun moveToExcerciseList() {
        try {
            var objIntent = Intent(home@ this, ExcerciseList::class.java)
            startActivity(objIntent)
        } catch (ex: Exception) {
            Toast.makeText(home@ this, "moveToExcerciseList: ${ex.message}", Toast.LENGTH_SHORT).show();
        }
    }
}
