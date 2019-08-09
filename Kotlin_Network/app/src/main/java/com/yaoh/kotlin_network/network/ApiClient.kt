package com.beacool.appnetwork.network

import com.yaoh.kotlin_network.BuildConfig
import me.jessyan.retrofiturlmanager.RetrofitUrlManager
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author yaoh
 * @date Create in 2019-08-08 15:37
 * @description TODO
 */
class ApiClient {

    lateinit var service: ApiService

    private constructor() {
        init()
    }


    companion object {
        private var instance: ApiClient? = null
            get() {
                if (field == null) {
                    field = ApiClient()
                }
                return field
            }

        @Synchronized
        fun get(): ApiClient {
            return instance!!
        }
    }


    fun init() {
        var logger_interceptor = HttpLoggingInterceptor().setLevel(
            if (BuildConfig.DEBUG)
                HttpLoggingInterceptor.Level.HEADERS
            else
                HttpLoggingInterceptor.Level.HEADERS
        )

//        val okHttpClient = OkHttpClient.Builder()
//            .connectTimeout(15, TimeUnit.SECONDS)
//            .writeTimeout(15, TimeUnit.SECONDS)
//            .readTimeout(15, TimeUnit.SECONDS)
//            .addInterceptor(logger_interceptor)
//            .build()

        // 可以动态改变 url
        val okHttpClient = RetrofitUrlManager.getInstance()
            .with(OkHttpClient.Builder())
            .connectTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .addInterceptor(logger_interceptor)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()

        service = retrofit.create(ApiService::class.java)
    }


}