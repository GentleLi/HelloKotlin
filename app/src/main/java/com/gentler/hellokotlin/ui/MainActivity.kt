package com.gentler.hellokotlin.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.gentler.hellokotlin.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printList()

    }

    public fun printList(){
        val items= listOf<String>("Java","kotlin","swift");
        for (item in items){
            Log.d("MainActivity",item)
        }
    }

}
