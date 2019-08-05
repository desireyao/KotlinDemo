package com.yaoh.kt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.yaoh.kt.model.*

class MainKotlinActivity : AppCompatActivity() {

    companion object {
        const val TAG = "MainKotlinActivity"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // kotlin 调java
//        var bj = BasicJava()
//        bj.printSum(1, 2)

        var basic = Basic()
        basic.inc(1)

        basic.test2()
        basic.printSum(1, 2)
        basic.printProduct("1", "2")

        basic.testFor()
        basic.testRange()

        Log.e(TAG, basic.testWhen(1))
        basic.testForEach()

        var person = Person("yaoh", 28)
        person.age = 10
        Log.e(TAG, "person---> " + person.toString())

        var basic2 = Basic2()
//        basic2.testLambda()
       Log.e(TAG,"sum---> " + basic2.sum(1, 2, 3).toString())

        basic2.testLambda2(10, { num1: Int, num2: Int -> num1 + num2 })

    }


}
