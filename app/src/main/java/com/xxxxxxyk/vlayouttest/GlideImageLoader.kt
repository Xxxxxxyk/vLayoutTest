package com.xxxxxxyk.vlayouttest

import android.content.Context
import android.widget.ImageView
import com.youth.banner.loader.ImageLoader

/**
 * Created by 惜梦哥哥 on 2018/1/26.
 */
class GlideImageLoader : ImageLoader() {
    override fun displayImage(context: Context?, path: Any?, imageView: ImageView?) {
        GlideApp.with(context)
                .load(path)
                .placeholder(R.mipmap.ic_launcher)
                .fitCenter()
                .into(imageView);
    }
}