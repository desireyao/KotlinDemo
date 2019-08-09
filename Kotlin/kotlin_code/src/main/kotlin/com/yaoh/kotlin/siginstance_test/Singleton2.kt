package com.yaoh.kotlin.siginstance_test

/**
 * @author yaoh
 * @date Create in 2019-08-08 11:42
 * @description TODO
 */
class Singleton2 private constructor() {

    companion object {
        private var instance: Singleton2? = null
            get() {
                if (field == null) {
                    field = Singleton2()
                }
                return field
            }

        @Synchronized
        fun get(): Singleton2 {
            return instance!!
        }
    }

}