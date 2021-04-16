package com.anand.kotlinmvvmtask.utility

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

object Utility {

    fun ImageView.loadImage(url: String) {
        Glide.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true).into(this)
    }
}