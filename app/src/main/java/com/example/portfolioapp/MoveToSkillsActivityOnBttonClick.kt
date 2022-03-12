package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MoveToSkillsActivityOnBttonClick : AppCompatActivity() {

    private  lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_to_skills_on_btton_click)

        setTitle("My Skills")

        recyclerView = findViewById(R.id.recycler_view)
        val item = ArrayList<MySkillClass>()
        item.add(MySkillClass(R.drawable.java,"Java"))
        item.add(MySkillClass(R.drawable.cpp,"C++"))
        item.add(MySkillClass(R.drawable.pl,"Kotlin"))
        item.add(MySkillClass(R.drawable.css,"CSS"))
        item.add(MySkillClass(R.drawable.js,"Java Script"))
        item.add(MySkillClass(R.drawable.firebase,"Firebase"))
        item.add(MySkillClass(R.drawable.php,"PHP"))
        item.add(MySkillClass(R.drawable.mysql,"MySql"))

        val adapter = SkillsAdapter(item,this)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.adapter= adapter

    }
}