package com.nibriti.softuser_week6assignment.adapter

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nibriti.softuser_week6assignment.R
import com.nibriti.softuser_week6assignment.model.Student

class StudentDisplay_Adapter (
        val lstStudent: ArrayList<Student>,
        val context: Context
) : RecyclerView.Adapter<StudentDisplay_Adapter.StudentViewHolder>() {

    //Chair banaune
    class StudentViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgStudent: ImageView
        val tvName: TextView
        val tvAddress: TextView

        init {
            imgStudent = view.findViewById(R.id.imgStudent)
            tvName = view.findViewById(R.id.tvName)
            tvAddress = view.findViewById(R.id.tvAddress)
        }
    }
        )
