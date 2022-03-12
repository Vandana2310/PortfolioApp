package com.example.portfolioapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SkillsAdapter(val list_of_skills: ArrayList<MySkillClass>, val context: MoveToSkillsActivityOnBttonClick) : RecyclerView.Adapter<SkillsAdapter.viewholder>() {
    class viewholder(view : View): RecyclerView.ViewHolder(view) {

         val skill_img : ImageView
         val skill_name : TextView

         init {
             skill_img = view.findViewById(R.id.skill_image)
             skill_name = view.findViewById(R.id.skill_name)
         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.my_skills, parent, false)
        return  viewholder(inflater)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.skill_name.text = list_of_skills[position].skill_name
        holder.skill_img.setImageResource(list_of_skills[position].skill_img)



    }

    override fun getItemCount(): Int {
        return list_of_skills.size
    }

}