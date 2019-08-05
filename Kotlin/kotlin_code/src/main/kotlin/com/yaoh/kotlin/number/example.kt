package com.yaoh.kotlin.number

/**
 * @author yaoh
 * @date 2019-08-04
 * @Describe
 */

fun main(args: Array<String>) {
    println("=================start=====================")
    println(sum(1, 2))

    var a: Byte = 127
    var b = 255

    println("a=" + String.format("%02x", a) + " b = " + b)
    println("com.yaoh.kotlin.number.sum2: " + sum2("s", 1))

    testStep()

    test
}


val sum = { x: Int, y: Int -> x + y }

val sum2 = { a: String, b: Int -> a + b }


fun testFlod() {
    val items = listOf(1, 2, 3, 4)
    items.fold(0, { acc: Int, i: Int ->
        print("acc = $acc,i= $i,")
        val result = acc + i
        result
    })
}

fun testStep() {
    println("com.yaoh.kotlin.number.testStep--->")
//    for (i in 1..100 step 20) {
//        println("$i")
//    }

    for (i in 1.rangeTo(100) step 20) {
        print("$i ")
    }

    // 自执行闭包
    { x: Int, y: Int -> print("${x + y}") }(1, 3)

}

// 闭包
val test = if (5 > 3) {
    print("YES")
} else {
    print("NO")
}


//