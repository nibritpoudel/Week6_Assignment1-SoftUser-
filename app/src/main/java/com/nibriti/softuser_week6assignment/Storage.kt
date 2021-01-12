package com.nibriti.softuser_week6assignment

import android.widget.Toast
import com.nibriti.softuser_week6assignment.model.Student

private var listStudent = arrayListOf<Student>()
class Storage {
    fun appendStudent(student: Student){
        listStudent.add(student)
        println(listStudent.size)
    }
    fun returnStudent():ArrayList<Student>{
        return listStudent
    }
    fun deleteStudent(student: Student){
        listStudent.remove(student)
    }
}