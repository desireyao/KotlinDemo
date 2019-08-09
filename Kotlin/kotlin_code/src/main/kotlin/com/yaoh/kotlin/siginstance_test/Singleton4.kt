package com.yaoh.kotlin.siginstance_test

/**
 * @author yaoh
 * @date Create in 2019-08-08 13:27
 * @description 双重校验锁式
 */
class Singleton4 private constructor() {

    companion object {
        val instance: Singleton4 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            Singleton4()
        }

    }

}