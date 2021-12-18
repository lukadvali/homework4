package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class fragment2 : Fragment(R.layout.fragment2) {

    lateinit var textView1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView1 = view.findViewById(R.id.textview1)
        textView2 = view.findViewById(R.id.textview2)
        textView3 = view.findViewById(R.id.textview3)

        textView1.text = fragment2Args.fromBundle(requireArguments()).text
        textView2.text = fragment2Args.fromBundle(requireArguments()).text
        textView3.text = fragment2Args.fromBundle(requireArguments()).text
    }
}