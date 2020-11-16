package com.example.player.util

import com.example.player.R
import com.example.player.base.BaseFragment
import com.example.player.ui.fragment.HomeFragment
import com.example.player.ui.fragment.MvFragment
import com.example.player.ui.fragment.VBangFragment
import com.example.player.ui.fragment.YueDanFragment

/*
* 管理fragment的util类
* */
class FragmentUtil private constructor() {
    val homeFragment by lazy { HomeFragment() }
    val mvFragment by lazy { MvFragment() }
    val vBangFragment by lazy { VBangFragment() }
    val yueDanFragment by lazy { YueDanFragment() }

    //私有化构造方法
    companion object {
        val fragmentUtil by lazy { FragmentUtil() }
    }

    /*
    * 根据tabId获取对应的fragment
    * */
    fun getFragment(tabId: Int): BaseFragment? {
        when (tabId) {
            R.id.tab_home -> return homeFragment
            R.id.tab_mv -> return mvFragment
            R.id.tab_vbang -> return vBangFragment
            R.id.tab_yuedan -> return yueDanFragment
        }
        return null
    }
}