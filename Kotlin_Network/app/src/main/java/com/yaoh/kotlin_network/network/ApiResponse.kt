/*******************************************************************************
 * Copyright 2017 Yuran Zhang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.beacool.appnetwork.network

import android.content.Context
import com.google.gson.Gson
import com.yaoh.kotlin_network.network.ApiErrorModel
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

abstract class ApiResponse<T>(private val context: Context) : Observer<T> {

    abstract fun onSuccess(data: T)
    abstract fun onFailed(code: Int, errorMsg: String)

    override fun onSubscribe(d: Disposable) {

    }

    override fun onNext(t: T) {
        onSuccess(t)
    }

    override fun onComplete() {

    }

    override fun onError(e: Throwable) {

        if (e is HttpException) {
            onFailed(e.code(), e.message())
            return
        }

        when (e) {
            is UnknownHostException -> onFailed(-1, "UnknownHostException")
            is ConnectException -> onFailed(-1, "ConnectException")
            is SocketTimeoutException -> onFailed(-1, "SocketTimeoutException")
            else -> onFailed(-1, "UNEXPECTED ERROR")
        }

    }

    private fun otherError(e: HttpException) =
        Gson().fromJson(e.response().errorBody()?.charStream(), ApiErrorModel::class.java)
}
