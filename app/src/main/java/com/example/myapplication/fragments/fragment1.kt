package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class fragment1 : Fragment(R.layout.fragment1) {

    lateinit var editText: EditText
    lateinit var editText2 : EditText
    lateinit var editText3: EditText
    lateinit var button: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editText)
        editText2 = view.findViewById(R.id.edittext2)
        editText3 = view.findViewById(R.id.edittext3)
        button = view.findViewById(R.id.button)

        val navController = Navigation.findNavController(view)

        button.setOnClickListener {

            val text1 = editText.text.toString()
            val text2 = editText2.text.toString()
            val text3 = editText3.text.toString()

            val action1 = fragment1Directions.actionFragment1ToFragment2(text1)
            val action2 = fragment1Directions.actionFragment1ToFragment2(text2)
            val action3 = fragment1Directions.actionFragment1ToFragment2(text3)

            navController.navigate(action1)
            navController.navigate(action2)
            navController.navigate(action3)

        }
    }

}