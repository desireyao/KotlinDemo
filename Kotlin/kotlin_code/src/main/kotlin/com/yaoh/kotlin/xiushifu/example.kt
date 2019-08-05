package com.yaoh.kotlin.xiushifu

/**
 * @author yaoh
 * @date Create in 2019-08-05 17:25
 * @description
 */

private fun foo() {

} // 在 example.kt 内可见


internal val baz = 6    // 相同模块内可见

/**
 * 在Kotlin中，所有的类默认都是final的。如果你需要允许它可以被继承，那么你需要使用open声明
 */
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4 // 默认 public

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {

    override val b = 5
}

class Unrelated(o: Outer) {


}
