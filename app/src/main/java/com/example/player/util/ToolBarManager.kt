package com.example.player.util

import android.content.Intent
import androidx.appcompat.widget.Toolbar
import com.example.player.R
import com.example.player.ui.activity.SettingActivity

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
        toolbar.setOnMenuItemClickListener {
            toolbar.context.startActivity(
                Intent(
                    toolbar.context,
                    SettingActivity::class.java
                )
            )
            true
        }
    }

    /*
    * 处理设置页面的toolbar
    * */
    fun initSettingToolbar() {
        toolbar.title = "设置页面"
    }
}