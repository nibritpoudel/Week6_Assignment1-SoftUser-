package com.nibriti.softuser_week6assignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.nibriti.softuser_week6assignment.R
import com.nibriti.softuser_week6assignment.Storage
import com.nibriti.softuser_week6assignment.model.Student

class AddStudent_Fragment : Fragment() {

    private lateinit var btnSave: Button
    private lateinit var etFullname: EditText
    private lateinit var etAge: EditText
    private lateinit var etImageURL: EditText
    private lateinit var etAddress: EditText
    private lateinit var rbMale: RadioButton
    private lateinit var rbFemale: RadioButton
    private lateinit var rbOthers: RadioButton
    private var gender = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_student_, container, false)
        etFullname = view.findViewById(R.id.etFullname)
        etAge = view.findViewById(R.id.etAge)
        etImageURL = view.findViewById(R.id.etImageURL)
        etAddress = view.findViewById(R.id.etAddress)
        rbMale = view.findViewById(R.id.rbMale)
        rbFemale = view.findViewById(R.id.rbFemale)
        rbOthers = view.findViewById(R.id.rbOthers)
        btnSave = view.findViewById(R.id.btnSave)

        rbMale.setOnClickListener {
            gender = "Male"
        }
        rbFemale.setOnClickListener {
            gender = "Female"
        }
        rbOthers.setOnClickListener {
            gender = "Others"
        }

        btnSave.setOnClickListener {
            var fullname = etFullname.text.toString()
            var userImageURL = etImageURL.text.toString()
            var age = etAddress.text.toString()
            var address = etAddress.text.toString()
            Storage().appendStudent(Student(fullname, userImageURL, age, address, gender))
            Toast.makeText(view?.context, "Student Added Sucessfully", Toast.LENGTH_LONG).show()
            etFullname.setText("")
            etImageURL.setText("")
            etAddress.setText("")
            etAge.setText("")

        }
        return view
    }
}