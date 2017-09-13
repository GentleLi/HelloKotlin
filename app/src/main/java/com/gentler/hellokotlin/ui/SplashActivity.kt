package com.gentler.hellokotlin.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by jiantao on 2017/9/13.
 */
class SplashActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        traversalList()
    }

    /**
     * 使用while loop遍历集合
     */
    private fun traversalList(){
        val items= listOf<String>("Java","OC","Python","CPP")
        var index=0;
        while (index<items.size){
            Log.d("SplashActivity",items.get(index))
            index++
        }
    }


}