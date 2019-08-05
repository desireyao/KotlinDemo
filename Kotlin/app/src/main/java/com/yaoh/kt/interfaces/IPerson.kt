package com.yaoh.kt.interfaces

import android.util.Log

/**
 * @author yaoh
 * @date 2019-08-02
 * @Describe
 */
interface IPerson {

    fun eat()

    fun speak() {
        Log.e("IPerson", "speak--->")
    }


}