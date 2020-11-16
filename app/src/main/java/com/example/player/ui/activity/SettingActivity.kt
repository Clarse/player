package com.example.player.ui.activity

import android.preference.PreferenceManager
import androidx.appcompat.widget.Toolbar
import com.example.player.R
import com.example.player.base.BaseActivity
import com.example.player.util.ToolBarManager

class SettingActivity : BaseActivity(), ToolBarManager {

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override val toolbar: Toolbar by lazy {
        findViewById(R.id.toolbar)
    }

    override fun initData() {
        initSettingToolbar()
        //获取推送通知有没有选中
        val sp = PreferenceManager.getDefaultSharedPreferences(this)
        val push = sp.getBoolean("push", false)
    }
}