package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.portfolioapp.c1
import com.example.portfolioapp.c2
import com.example.portfolioapp.c3
import com.example.portfolioapp.c4
import com.example.portfolioapp.c5
import com.example.portfolioapp.c6
import com.example.portfolioapp.c7
import kotlinx.android.synthetic.main.activity_my_resume.*
import kotlinx.android.synthetic.main.activity_resume_see.*
import kotlinx.android.synthetic.main.activity_see_my_certificates.*

class SeeMyCertificatesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_see_my_certificates)

        setTitle("My Certifications")
    }

    fun c7(view: View) {
        val intent = Intent(this@SeeMyCertificatesActivity, c7::class.java)
        startActivity(intent)
    }
    fun c6(view: View) {
        val intent = Intent(this@SeeMyCertificatesActivity, c6::class.java)
        startActivity(intent)
    }
    fun c5(view: View) {
        val intent = Intent(this@SeeMyCertificatesActivity, c5::class.java)
        startActivity(intent)
    }
    fun c4(view: View) {
        val intent = Intent(this@SeeMyCertificatesActivity, c4::class.java)
        startActivity(intent)
    }
    fun c3(view: View) {
        val intent = Intent(this@SeeMyCertificatesActivity, c3::class.java)
        startActivity(intent)
    }
    fun c2(view: View) {
        val intent = Intent(this@SeeMyCertificatesActivity, c2::class.java)
        startActivity(intent)
    }
    fun c1(view: View) {
        val intent = Intent(this@SeeMyCertificatesActivity, c1::class.java)
        startActivity(intent)
    }
}