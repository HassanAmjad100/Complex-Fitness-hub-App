package com.example.aacomplexfittnesshub.list

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aacomplexfittnesshub.R

class ListReceiver : AppCompatActivity() {

    private lateinit var dataTV: TextView
    private lateinit var moveBackBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_receiver)

        connectXML()
    }

    private fun connectXML() {
        try {
            dataTV = findViewById(R.id.list_receivertxt)
            moveBackBtn = findViewById(R.id.list_receiverbtn)

            getIntentValues()
            moveBackBtn.setOnClickListener {
                startActivity(
                    Intent(
                        excercise_list@ this,
                        ExcerciseList::class.java
                    )
                )
                this.finish()
            }
        } catch (ex: Exception) {
            Toast.makeText(excercise_list@ this, "connect XML: ${ex.message}", Toast.LENGTH_SHORT)
                .show();
        }
    }

    private fun getIntentValues() {
        try {
            if (intent != null) {
                dataTV.text = intent.getStringExtra("value")
            }
        } catch (ex: Exception) {
            Toast.makeText(
                excercise_list@ this,
                "get intent values: ${ex.message}",
                Toast.LENGTH_SHORT
            ).show();
        }
    }





}