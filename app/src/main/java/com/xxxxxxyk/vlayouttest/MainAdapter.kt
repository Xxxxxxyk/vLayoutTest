package com.xxxxxxyk.vlayouttest

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.alibaba.android.vlayout.DelegateAdapter
import com.alibaba.android.vlayout.LayoutHelper
import com.alibaba.android.vlayout.VirtualLayoutManager

class MainAdapter(var context: Context, var layoutHelper: LayoutHelper, var count: Int,var layoutParams : ViewGroup.LayoutParams) : DelegateAdapter.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return MainViewHolder(LayoutInflater.from(context).inflate(android.R.layout.test_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return count
    }

    override fun onCreateLayoutHelper(): LayoutHelper {
        return layoutHelper
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        holder!!.itemView.layoutParams = VirtualLayoutManager.LayoutParams(layoutParams)
    }

    override fun onBindViewHolderWithOffset(holder: RecyclerView.ViewHolder?, position: Int, offsetTotal: Int) {
        (holder as MainViewHolder).text1.text = "块块$position"
    }

    class MainViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var text1 = itemView!!.findViewById<TextView>(android.R.id.text1)
    }
}