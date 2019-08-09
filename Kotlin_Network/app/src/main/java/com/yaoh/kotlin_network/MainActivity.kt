package com.yaoh.kotlin_network

import android.os.Bundle
import android.view.View
import android.widget.Button
import com.beacool.appnetwork.network.ApiClient
import com.beacool.appnetwork.network.ApiResponse
import com.beacool.appnetwork.network.NetworkScheduler
import com.beacool.appnetwork.network.bean.Repo
import com.beacool.baselib.log.LogTool
import com.trello.rxlifecycle2.android.ActivityEvent
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity
import com.trello.rxlifecycle2.kotlin.bindUntilEvent
import io.reactivex.Observable

class MainActivity : RxAppCompatActivity(), View.OnClickListener {

    companion object {
        const val TAG: String = "MainActivity"
    }


    private var btn1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        doGet()
    }

    fun doGet() {
        var map: HashMap<String, String> = hashMapOf()
        map.put("header_key1", "header_value1")
        map.put("header_key2", "header_value2")

        ApiClient.get().service.listRepos(map, "desireyao")
            .compose(NetworkScheduler.compose())
            .bindUntilEvent(this, ActivityEvent.DESTROY)
            .subscribe(object : ApiResponse<List<Repo>>(this) {
                override fun onSuccess(data: List<Repo>) {
                    LogTool.LogD(TAG, "onSuccess---> data: " + data)
                }

                override fun onFailed(code: Int, errorMsg: String) {
                    LogTool.LogD(TAG, "onFailed---> code: " + code + " errorMsg: " + errorMsg)
                }

            })
    }

    fun testRxJava(){


    }


}
