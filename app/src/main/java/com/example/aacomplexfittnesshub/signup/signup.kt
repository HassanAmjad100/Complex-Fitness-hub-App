package com.example.aacomplexfittnesshub.signup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aacomplexfittnesshub.R
import com.example.aacomplexfittnesshub.codeAppear.CodeAppear


class signup : AppCompatActivity() {

    lateinit var FirstName: EditText
    lateinit var LastName: EditText
    lateinit var Number: EditText

    lateinit var subBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        connector()

    }

    private fun connector() {
        try {
            FirstName = findViewById(R.id.first_name)
            LastName = findViewById(R.id.last_name)
            Number = findViewById(R.id.email)

            subBtn = findViewById(R.id.btn2)


            subBtn.setOnClickListener {
                moveToCodeAppear()
            }
        } catch (ex: Exception) {
            Toast.makeText(signup@ this, "Exception is ${ex.message}", Toast.LENGTH_LONG)
                .show()
        }
    }

    private fun moveToCodeAppear() {
        try {
            var objIntent = Intent(signup@ this, CodeAppear::class.java)
            startActivity(objIntent)
        } catch (ex: Exception) {
            Toast.makeText(signup@ this, "moveToCodeAppear: ${ex.message}", Toast.LENGTH_SHORT)
                .show();
        }
    }
}