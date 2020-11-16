package com.example.player.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.player.widget.HomeItemView
import com.itheima.player.model.bean.HomeItemBean

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeHolder>() {
    private val list = ArrayList<HomeItemBean>()

    /*
    * 更新数据
    * */
    fun updateList(list: List<HomeItemBean>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class HomeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        return HomeHolder(HomeItemView(parent.context))
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return list.size
    }
}