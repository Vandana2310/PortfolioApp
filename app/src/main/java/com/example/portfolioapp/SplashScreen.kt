package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    private var splashLoaded = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        if (!splashLoaded) {
            setContentView(R.layout.activity_splash_screen)
            val secondsDelayed = 1
            Handler().postDelayed({
                startActivity(Intent(this@SplashScreen, MainActivity::class.java))
                finish()
            }, (secondsDelayed * 700).toLong()) //1000 - 1
            splashLoaded = true
        } else {
            val goToMainActivity = Intent(this@SplashScreen, MainActivity::class.java)
            goToMainActivity.flags = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT
            startActivity(goToMainActivity)
            finish()
        }

    }
}