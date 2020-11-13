package com.example.player.ui.activity

import androidx.appcompat.widget.Toolbar
import com.example.player.R
import com.example.player.base.BaseActivity
import com.example.player.util.ToolBarManager

class MainActivity : BaseActivity(), ToolBarManager {

    override val toolbar: Toolbar by lazy {
        findViewById(R.id.toolbar)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }

}