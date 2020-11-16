package com.example.player.ui.activity

import androidx.appcompat.widget.Toolbar
import com.example.player.R
import com.example.player.base.BaseActivity
import com.example.player.util.FragmentUtil
import com.example.player.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*

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

    override fun initListener() {
        //设置tab切换监听
        bottomBar.setOnTabSelectListener {
            val transaction = supportFragmentManager.beginTransaction()
            FragmentUtil.fragmentUtil.getFragment(it)?.let { it1 ->
                transaction.replace(
                    R.id.container,
                    it1,
                    it.toString()
                )
            }
            transaction.commit()
        }
    }

}