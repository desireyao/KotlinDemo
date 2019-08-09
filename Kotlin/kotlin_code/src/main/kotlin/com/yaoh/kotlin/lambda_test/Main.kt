package com.yaoh.kotlin.lambda_test

/**
 * @author yaoh
 * @date Create in 2019-08-08 21:50
 * @description lambda 表达式
 */

val sum = { arg1: Int, arg2: Int ->
    arg1 + arg2
}

val int2long = fun(x: Int): Long {
    return x.toLong()
}


fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sum.invoke(1, 2))
    println(int2long(2))

    args.forEach(::println)
    args.forEach { println(it) }

    args.forEach {
        if (it == "q")
            return

        // 不执行
        println("The End")
    }


}
