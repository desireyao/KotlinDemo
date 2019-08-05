package com.yaoh.kt.model

import android.util.Log

class Basic2 {

    companion object {
        const val TAG = "Basic2"
    }

    fun testVa() {
        var a = 10
        val b = 100

        a = 1000
//       b = 1 报错
    }


    // 扩展函数
    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }

    fun Person.walk(runSpeed: Int): Person {
        this.name = "yaoh" + runSpeed
        this.age = 27
        return this
    }

    fun testSwap() {
        val list = mutableListOf(1, 2, 3)
        list.swap(0, 2)
    }

    // 默认参数
    fun reformat(str: String, isUppercaseFirstLetter: Boolean = true) {

    }

    var sum = { x: Int, y: Int, z: Int -> x + y + z }

    fun testLambda2(a: Int, b: (num1: Int, num2: Int) -> Int): Int {
        return a + b.invoke(3, 5)
    }


    // 高阶函数
//    fun <T, R> Collection<T>.fold(initial: R, combine: (acc: R, nextElement: T) -> R): R {
//        var accumulator: R = initial
//        for (element: T in this) {
//            accumulator = combine(accumulator, element)
//        }
//        return accumulator
//    }

    // lambda表达式
    fun testLambda() {
        val items = listOf(1, 2, 3, 4, 5)
        // Lambdas 表达式是花括号括起来的代码块。
        items.fold(0,
            { acc: Int, i: Int ->
                Log.e(TAG, "acc = $acc, i = $i, ")
                val result = acc + i
                Log.e(TAG, "result = $result")
                // lambda 表达式中的最后一个表达式是返回值：
                result
            })

        // lambda 表达式的参数类型是可选的，如果能够推断出来的话：
//        val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

        // 函数引用也可以用于高阶函数调用：
//        val product = items.fold(1, Int::times)

//        Log.e(TAG, "joinedToString = $joinedToString")
//        Log.e(TAG, "product = $product")
    }


}