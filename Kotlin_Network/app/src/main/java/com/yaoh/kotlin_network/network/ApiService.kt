package com.beacool.appnetwork.network

import com.beacool.appnetwork.network.bean.Repo
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.Headers
import retrofit2.http.Path

/**
 * @author yaoh
 * @date Create in 2019-08-08 16:42
 * @description TODO
 */
interface ApiService {

    @GET("users/{user}/repos")
    fun listRepos(@HeaderMap headers: Map<String, String>, @Path("user") user: String): Observable<List<Repo>> //每个方法的返回值即一个Observable

}