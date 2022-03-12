package com.example.portfolioapp

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import com.shockwave.pdfium.PdfDocument
import kotlinx.android.synthetic.main.activity_my_resume.*


class MyResume : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_resume)

        setTitle("My Resume")

        seeresume.setOnClickListener{
         val intent = Intent(this@MyResume, ResumeSeeActivity::class.java)
         startActivity(intent)
        }
    }

}