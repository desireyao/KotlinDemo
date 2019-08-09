package com.yaoh.kotlin.array_test

/**
 * @author yaoh
 * @date Create in 2019-08-07 21:21
 * @description TODO
 */

val arrayOfInt: IntArray = intArrayOf(1, 2, 3, 4, 5)

val arrayOfPeople: Array<Person> = arrayOf(Person("yaoh"), Person("haha"), Person("nihao"))

class Person(var name: String) {
    override fun toString(): String {
        return "${name}"
    }
}

fun main(args: Array<String>) {

    arrayOfPeople[1] = Person("newName")

    println(arrayOfPeople[1])

    println(arrayOfPeople.joinToString())

    println(arrayOfPeople.slice(1..2))

}
