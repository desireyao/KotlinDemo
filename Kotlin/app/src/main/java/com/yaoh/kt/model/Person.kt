package com.yaoh.kt.model

import com.yaoh.kt.interfaces.IPerson

/**
 * @author yaoh
 * @date 2019-08-02
 * @Describe
 */
open class Person : IPerson {

    override fun eat() {

    }

    var name: String = ""

    var age: Int = 0

//    val firstProperty = "First property: $name".also(::println)

//    }


    //    init {
//        println("First initializer block that prints")

    constructor()

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }


}