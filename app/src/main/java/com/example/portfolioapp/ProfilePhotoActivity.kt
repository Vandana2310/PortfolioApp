package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile_photo.*

class ProfilePhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_photo)

        setTitle("Profile Image")

        val bundle = intent.extras
        if( bundle !=null){
            val resId = bundle.getInt("resId")
            myimg.setImageResource(resId)
        }
    }
}