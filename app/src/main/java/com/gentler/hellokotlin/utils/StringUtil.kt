package com.gentler.hellokotlin.utils

/**
 * Created by jiantao on 2017/9/13.
 */

/**
 * 获取字符串的长度
 */
fun getStringLength(obj:Any):Int?{

    if (obj is String && obj.length>0){
        return obj.length
    }
    return null
}




