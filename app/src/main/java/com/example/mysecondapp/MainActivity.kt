package com.example.mysecondapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        val userInput: EditText = findViewById(R.id.etUserFtInput)
//
       // val userEmail: TextView = findViewById(R.id.tvName)


        button.setOnClickListener{
            startActivity(
                Intent(this@MainActivity,SecondScreen::class.java)
                    .putExtra("email",userInput.text.toString())
            )
        }
    }
//        override fun onStart(){
//            super.onStart()
//        }
//    override fun onResume(){
//        super.onResume()
//    }
//    override fun onPause(){
//        super.onPause()
//    }
//    override fun onStop(){
//        super.onStop()
//    }
//    override fun onDestroy(){
//        super.onDestroy()
//    }



}