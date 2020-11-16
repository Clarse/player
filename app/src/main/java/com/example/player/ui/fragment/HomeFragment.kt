package com.example.player.ui.fragment

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.player.R
import com.example.player.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_home, null)
    }

    override fun initListener() {
        //初始化recycleview
        recycleView.layoutManager = LinearLayoutManager(context)
    }
}