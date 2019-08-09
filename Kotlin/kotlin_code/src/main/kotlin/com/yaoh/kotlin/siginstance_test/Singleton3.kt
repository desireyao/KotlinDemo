package com.yaoh.kotlin.siginstance_test

/**
 * @author yaoh
 * @date Create in 2019-08-08 13:23
 * @description 线程安全的懒汉式
 */
class Singleton3 private constructor() {

    companion object {
        private var instance: Singleton3? = null
            get() {
                if (field == null) {
                    field = Singleton3()
                }
                return field
            }

        @Synchronized
        fun get(): Singleton3 {
            return instance!!
        }
    }


}