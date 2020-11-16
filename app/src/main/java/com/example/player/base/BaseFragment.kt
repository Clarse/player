package com.example.player.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    /*
    * fragment初始化
    * */
    protected open fun init() {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initView()
    }

    /*
    * 获取布局view
    * */
    abstract fun initView(): View?

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    /*
    * 数据初始化
    * */
    protected open fun initData() {

    }

    /*
    * adapter 和 listener相关操作
    * */
    protected open fun initListener() {

    }

    fun myToast(msg: String) {
        activity?.runOnUiThread { Toast.makeText(context, msg, Toast.LENGTH_SHORT).show() }
    }

}