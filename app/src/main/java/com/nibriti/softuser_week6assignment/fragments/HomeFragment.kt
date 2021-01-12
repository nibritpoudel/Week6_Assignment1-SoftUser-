package com.nibriti.softuser_week6assignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nibriti.softuser_week6assignment.R

class HomeFragment : Fragment() {
//    private lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }
}
//homeViewModel =
//ViewModelProvider(this).get(HomeViewModel::class.java)
//val root = inflater.inflate(R.layout.fragment_home, container, false)
//val textView: TextView = root.findViewById(R.id.text_home)
//homeViewModel.text.observe(viewLifecycleOwner, Observer {
//    textView.text = it
//})
//return root