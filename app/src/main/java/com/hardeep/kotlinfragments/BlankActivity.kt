package com.hardeep.kotlinfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BlankActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blank)
    }

    fun demo(v:String , i:Int):String?
    {
        val a = "sfd"
        return a
    }

}
