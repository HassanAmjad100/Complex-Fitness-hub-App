package com.example.aacomplexfittnesshub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.aacomplexfittnesshub.Home.Home
import com.example.aacomplexfittnesshub.signup.signup

class MainActivity : AppCompatActivity() {

    lateinit var UserName: EditText
    lateinit var Password: EditText

    lateinit var subBtn: Button
    lateinit var signBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun connector()
    {
        try{
            UserName   = findViewById(R.id.user_name)
            Password = findViewById(R.id.password)
            subBtn = findViewById(R.id.btn_submit)
            subBtn.setOnClickListener {
                moveToHome()
            }
            signBtn = findViewById(R.id.btn_submit)
            signBtn.setOnClickListener {
                moveToSignup()
            }



        }
        catch (ex:Exception){
            Toast.makeText(MainActivity@this,"Exception is ${ex.message}", Toast.LENGTH_LONG)
                .show()
        }
    }

    private fun moveToHome() {
        try
        {
            var objIntent = Intent(MainActivity@this, Home::class.java)
            startActivity(objIntent)
        }catch (ex:Exception)
        {
            Toast.makeText(MainActivity@this, "moveToHome: ${ex.message}", Toast.LENGTH_SHORT).show();
        }
    }

    private fun moveToSignup() {
        try
        {
            var objIntent = Intent(MainActivity@this, signup::class.java)
            startActivity(objIntent)
        }catch (ex:Exception)
        {
            Toast.makeText(MainActivity@this, "moveToSignup: ${ex.message}", Toast.LENGTH_SHORT).show();
        }
    }
}