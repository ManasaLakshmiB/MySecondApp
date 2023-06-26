package com.example.mysecondapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        val userInput: EditText = findViewById(R.id.etUserFtInput)

        val password : EditText = findViewById(R.id.etUserSdInput)
//
       // val userEmail: TextView = findViewById(R.id.tvName)


        button.setOnClickListener{
           if(userInput.text.isEmpty() ){
               Toast.makeText( this, "Please enter your email ", Toast.LENGTH_LONG).show()
           }
            if(password.text.isEmpty()) {
            Toast.makeText(this, "please enter password", Toast.LENGTH_LONG).show()
        }
            if (userInput.text.isNotEmpty() && password.text.isNotEmpty())
         {


               startActivity(
                   //Intent is the message that is passed between components
                   Intent(this@MainActivity, SecondScreen::class.java)
                       //putExtra method is used to send data between activity
                       //toString used to convert a string object into string
                       .putExtra("email", userInput.text.toString())
               )
           }
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