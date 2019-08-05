package com.yaoh.kt.model

import android.util.Log
import java.lang.Exception
import java.lang.Integer.parseInt
import kotlin.math.log

/**
 * @author yaoh
 * @create 2019-08-02
 * @Describe
 */
class Basic {

    companion object {
        const val TAG = "Basic"
    }

    fun inc(num: Int) {
        val num = 2
        if (num > 0) {
            var num = 3
        }
        Log.e(TAG, "num:" + num)
    }

    fun printSum(a: Int, b: Int) {
        Log.e(TAG, "sum of $a and $b is ${a + b}")
    }


    fun sum(a: Int, b: Int): Int {
        Log.e(TAG, "sum ---> a is $a and b is $b")
        return a + b
    }

    fun test1() {
        val a: Int = 1 // 立即赋值
        var b = 2

        var c: Int
        c = 3
        var d: String
    }

    fun test2() {
        var a = 1
        var s1 = "a is $a"

        a = 2
        var s2 = "${s1.replace("is", "was")},but now is $a"
        Log.e(TAG, "s2---> " + s2)
    }

    fun testIf(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun printProduct(arg1: String, arg2: String?) {

        var x = parseInt(arg1)
        var y = parseInt(arg2)

        if (x != null && y != null) {
            Log.e(TAG, (x * y).toString())
        } else {
            Log.e(TAG, "either '$arg1' or '$arg2' is not a number")
        }
    }

    fun parseInt(str: String): Int {
        return str.toInt()
    }

    fun testFor() {
        var items = listOf("apple", "banana", "sss")
        for (item in items) {
            Log.e(TAG, item)
        }
    }

    fun testWhen(obj: Any): String {
        return when (obj) {
            1 -> "one"
            "hello" -> "hello"
            else -> "unknown"
        }
    }

    fun testRange() {
        val x = 10
        var y = 9
        if (x in 1..y + 1) {
            Log.e(TAG, "fits in range")
        }

        val list = listOf("a", "b", "c")
        if (-1 !in 0..list.lastIndex) {
            Log.e(TAG, "-1 is out of range" + " lastIndex: " + list.lastIndex)
        }

        if (list.size !in list.indices) {
            Log.e(TAG, "list size is out of valid list indices range, too list.indices:" + list.indices)
        }

        Log.e(TAG, "list[0]: " + list[0] + " | " + list.get(0))
    }

    fun testForEach() {
        var fruits = listOf("banana", "avo", "apple", "doll", "fruit", "cola", "ele", "gaga")
        fruits
            .filter { !it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach() {
                Log.e(TAG, it)
            }
    }




}