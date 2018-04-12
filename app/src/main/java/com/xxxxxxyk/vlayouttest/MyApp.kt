package com.xxxxxxyk.vlayouttest

import android.app.Application
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

class MyApp : Application(){
}

@GlideModule
class MyAppGlideModule : AppGlideModule() {}