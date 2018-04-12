package com.xxxxxxyk.vlayouttest

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.vlayout.DelegateAdapter
import com.alibaba.android.vlayout.LayoutHelper
import com.youth.banner.Banner
import com.youth.banner.BannerConfig

class MainBannerAdapter(var context: Context, var layoutHelper: LayoutHelper, var count: Int) : DelegateAdapter.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return BannerViewHolder(LayoutInflater.from(context).inflate(R.layout.item_main_banner, parent, false))
    }

    override fun getItemCount(): Int {
        return count
    }

    override fun onCreateLayoutHelper(): LayoutHelper {
        return layoutHelper
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {

        val banner = (holder as BannerViewHolder).banner
        Log.e("XYK", "NIJINLAILEME ")
        var list = ArrayList<String>()
        list.add("http://or3us8e0j.bkt.clouddn.com/apple_2017_8_25.png")
        list.add("http://or3us8e0j.bkt.clouddn.com/cha_10_06.png")
        list.add("http://or3us8e0j.bkt.clouddn.com/cha_2017_10_10.png")
        list.add("http://or3us8e0j.bkt.clouddn.com/guo_2017_09_01.jpg")
        list.add("http://or3us8e0j.bkt.clouddn.com/ku_gua.png")
        banner.setImages(list).setBannerStyle(BannerConfig.NUM_INDICATOR).setImageLoader(GlideImageLoader()).isAutoPlay(true).start()
    }


    class BannerViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var banner = itemView!!.findViewById<Banner>(R.id.banner)
    }
}