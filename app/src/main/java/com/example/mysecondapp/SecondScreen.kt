package com.example.mysecondapp

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.mysecondapp.databinding.ActivitySecondScreenBinding


class SecondScreen : AppCompatActivity() {

   private  lateinit var userEmail: TextView

   // userEmail.text = userInput.text

   private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySecondScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

//        userEmail = findViewById(R.id.tv_hello)
//
//
//        val Email = intent.getStringExtra("et_email")
//
//
//        userEmail.text = "Email :" + Email

     binding = ActivitySecondScreenBinding.inflate(layoutInflater)
     setContentView(binding.root)

        userEmail = findViewById(R.id.tv_hello)

        val Email = intent.getStringExtra("email")

        userEmail.text = "Hello" + Email

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_second_screen)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAnchorView(R.id.fab)
                .setAction("Action", null).show()


//           userEmail = findViewById(R.id.tv_hello)
//
//
//           val Email = intent.getStringExtra("Email")
//
//
//            userEmail.text = "Email :" + Email
        }
    }

    override fun onSupportNavigateUp(): Boolean {
    val navController = findNavController(R.id.nav_host_fragment_content_second_screen)
    return navController.navigateUp(appBarConfiguration)
            || super.onSupportNavigateUp()
    }
}