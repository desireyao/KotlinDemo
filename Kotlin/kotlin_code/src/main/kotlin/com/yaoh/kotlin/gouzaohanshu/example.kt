package com.yaoh.kotlin.gouzaohanshu

/**
 * @author yaoh
 * @date Create in 2019-08-05 17:41
 * @description 构造函数
 */

class Person(name: String) {

    init {
        // 初始化代码块
        println("person int name ---> " + name)
    }

    // 第二构造函数
    constructor(name: String, age: Int) : this(name) {
        println("constructor ---> name: " + name + " age: " + age)
    }
}

class Person2() {

    constructor(name: String) : this() {
        print("name: " + name)
    }

    constructor(name: String, age: Int) : this() {
        println("name: " + name + " age: " + age)
    }
}

class Customer(name: String) {
    init {
        print("customer initialized with value ${name}")
    }
}

/**
 * 派生类
 */
open class Base(val name: String) {
    init {
        println("Initializing Base")
    }

    open val size: Int =
        name.length.also { println("Initializing size in Base:$it") }
}

class Derived(
    name: String,
    val lastName: String
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {
    init {
        println("Initializing Derived")
    }

}


fun main(args: Array<String>) {
//    val customer = Customer("yaoh")
    val person = Person("yaoh", 12)
//    val person2 = Person2("yaoh", 12)
}
