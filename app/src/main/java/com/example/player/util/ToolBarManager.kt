package com.example.player.util

import androidx.appcompat.widget.Toolbar
import com.example.player.R

/*
* 所有界面toolbar的管理类
* */
interface ToolBarManager {
    val toolbar: Toolbar

    /*
    * 初始化主界面的toolbar
    * */
    fun initMainToolBar() {
        toolbar.title = "player"
        toolbar.inflateMenu(R.menu.main)
    }
}