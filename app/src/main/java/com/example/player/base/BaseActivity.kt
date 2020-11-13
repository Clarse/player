package com.example.player.base

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/*
* 所有activity的基类
* */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }

    /*
    * 初始化数据
    * */
    protected open fun initData() {

    }

    /*
    * adapter 和 listener 相关操作
    * */
    protected open fun initListener() {

    }

    /*
    * 获取布局id
    * */
    abstract fun getLayoutId(): Int

    protected fun toast(msg: String) {
        runOnUiThread { Toast.makeText(this, msg, Toast.LENGTH_SHORT).show() }
    }

    /*
    * 开启一个activity并且finish当前界面
    * */
    inline fun <reified T : BaseActivity> startActivityAndFinish() {
        startActivity(Intent(this, T::class.java))
        finish()
    }

}