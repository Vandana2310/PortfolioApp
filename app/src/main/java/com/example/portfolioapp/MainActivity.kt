package com.example.portfolioapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSkills.setOnClickListener {
            val intent = Intent(this@MainActivity, MoveToSkillsActivityOnBttonClick::class.java)
            startActivity(intent)
        }

        btnCerti.setOnClickListener {
            val intent = Intent(this@MainActivity, SeeMyCertificatesActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            R.id.share-> {
                try {
                    val i = Intent(Intent.ACTION_SEND)
                    i.type = "text/plain"
                    i.putExtra(Intent.EXTRA_SUBJECT, "My Portfolio")
                    var sAux = "\nDownload the app to know more about me\n\n"
                    sAux = """
                         ${sAux}https://play.google.com/store/apps/details?id=com.demo.app 
                         
                         
                         """.trimIndent() // here define package name of you app
                    i.putExtra(Intent.EXTRA_TEXT, sAux)
                    startActivity(Intent.createChooser(i, "choose one"))
                } catch (e: Exception) {
                    Log.e(">>>", "Error: $e")
                }
                return true
            }

            R.id.MyResume -> {
                val intent = Intent(
                    this@MainActivity,
                    MyResume::class.java
                )
                startActivity(intent)
                return true
            }
            R.id.Exit -> {
                this.finishAffinity()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }


    fun send(view: View) {
        val intent = Intent(this@MainActivity, ProfilePhotoActivity::class.java)
        intent.putExtra("resId",R.drawable.van)
        startActivity(intent)
    }


    fun email(view: View) {
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://mail.google.com/mail/u/0/"))
        startActivity(intent)
    }

    fun github(view: View) {
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/Vandana2310"))
        startActivity(intent)
    }

    fun leetcode(view: View) {
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://leetcode.com/vandana_kumari/"))
        startActivity(intent)
    }

    fun linkedin(view: View) {
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/vandana-kumari-518b24214/"))
        startActivity(intent)
    }

    fun twitter(view: View) {
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/Vandana45316042"))
        startActivity(intent)
    }

    fun discord(view: View) {
        val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/Vandana2310"))
        startActivity(intent)
    }
}