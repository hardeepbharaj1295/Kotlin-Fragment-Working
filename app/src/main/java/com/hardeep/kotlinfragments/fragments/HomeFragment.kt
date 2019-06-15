package com.hardeep.kotlinfragments.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import com.hardeep.kotlinfragments.R

class HomeFragment : Fragment() {

    lateinit var first : EditText
    lateinit var second : EditText
    lateinit var result : TextView
    lateinit var button: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        //TODO : 1 Change return type with variable name
        val v = inflater.inflate(R.layout.fragment_home, container, false)

        first = v.findViewById(R.id.first)
        second = v.findViewById(R.id.second)
        result = v.findViewById(R.id.textView)
        button = v.findViewById(R.id.button)

        button.setOnClickListener(View.OnClickListener {
            calculation()
        })

        return v
    }

    fun calculation()
    {
        val a = first.text.toString().toInt()
        val b = second.text.toString().toInt()
        val c = a + b
        result.text = c.toString()
    }
}
