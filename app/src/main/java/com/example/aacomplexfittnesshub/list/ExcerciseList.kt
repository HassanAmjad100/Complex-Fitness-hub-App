package com.example.aacomplexfittnesshub.list

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aacomplexfittnesshub.R

class ExcerciseList: AppCompatActivity() {

    private lateinit var listView: ListView
    private val dataList = listOf(
        "Chest",
        "Back",
        "Legs",
        "Tricep",
        "Forearm",
        "Bicep",
        "Shoulder",
        "Cardio",
        "Calf",
        "Traps"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercise_list)

        connectWithXML()
    }


    private fun connectWithXML() {
        try {
            listView = findViewById(R.id.exercise_listid)
            adapterWorking()

        } catch (ex: Exception) {
            Toast.makeText(
                exercise_list@ this,
                "connect With XML: ${ex.message}",
                Toast.LENGTH_SHORT
            ).show();
        }
    }




    private fun adapterWorking() {
        try {
            listView.adapter =
                ArrayAdapter(exercise_list@ this, android.R.layout.simple_list_item_1, dataList)
            listView.setOnItemClickListener { parent, view, position, id ->
                val valueFromList = parent.getItemAtPosition(position) as String

                startActivity(
                    Intent(
                        exercise_list@ this,
                        ExcerciseList::class.java
                    )
                        .putExtra("value", valueFromList)
                )
            }
        } catch (ex: Exception) {
            Toast.makeText(
                exercise_list@ this,
                "adapter working: ${ex.message}",
                Toast.LENGTH_SHORT
            ).show();
        }
    }
}