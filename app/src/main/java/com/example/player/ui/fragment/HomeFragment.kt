package com.example.player.ui.fragment

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.player.R
import com.example.player.adapter.HomeAdapter
import com.example.player.base.BaseFragment
import com.example.player.util.URLProviderUtils
import kotlinx.android.synthetic.main.fragment_home.*
import okhttp3.*
import java.io.IOException

class HomeFragment : BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_home, null)
    }

    override fun initListener() {
        //初始化recycleview
        recycleView.layoutManager = LinearLayoutManager(context)
        //适配
        val adapter = HomeAdapter()
        recycleView.adapter = adapter
    }

    override fun initData() {
        //初始化数据
        loadDatas()
    }

    private fun loadDatas() {
        val path = URLProviderUtils.getHomeUrl(0, 20)
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(path)
            .get()
            .build()
        client.newCall(request).enqueue(object : Callback {
            /*
            * 子线程调用
            * */
            override fun onFailure(call: Call, e: IOException) {
                myToast("获取数据失败")
            }

            /*
            * 子线程调用
            * */
            override fun onResponse(call: Call, response: Response) {
                val result = response.body.toString()
                println("获取数据成功：" + Thread.currentThread().name)
            }
        })
    }

}