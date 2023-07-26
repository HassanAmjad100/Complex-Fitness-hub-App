package com.example.aacomplexfittnesshub.codeAppear

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aacomplexfittnesshub.Home.Home
import com.example.aacomplexfittnesshub.R

class CodeAppear : AppCompatActivity() {

    lateinit var Code: EditText
    lateinit var Password: EditText
    lateinit var PasswordAgain: EditText

    lateinit var subCode: Button
    lateinit var subPass: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.code_appear)

        connector()

    }

    private fun connector() {
        try {
            Code = findViewById(R.id.message)
            Password = findViewById(R.id.password)
            PasswordAgain = findViewById(R.id.confirm_password)

            subCode = findViewById(R.id.code_btn)
            subPass = findViewById(R.id.sub_new_password)


            subCode.setOnClickListener {
                moveToHome()

            }
            subPass.setOnClickListener {
                moveToHome()
            }
        } catch (ex: Exception) {
            Toast.makeText(code_appear@ this, "moveToHome: ${ex.message}", Toast.LENGTH_SHORT)
                .show();
        }
    }

    private fun moveToHome() {
        try {
            var objIntent = Intent(code_appear@ this, Home::class.java)
            startActivity(objIntent)
        } catch (ex: Exception) {
            Toast.makeText(code_appear@ this, "moveToHome: ${ex.message}", Toast.LENGTH_SHORT)
                .show();
        }
    }
}