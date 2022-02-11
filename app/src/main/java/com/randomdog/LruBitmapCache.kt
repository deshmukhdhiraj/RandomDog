package com.randomdog

import android.graphics.Bitmap
import android.util.LruCache

class LruBitmapCache : LruCache<String, Bitmap>(20) {


    fun getAllImage(): MutableMap<String, Bitmap>? {
        return snapshot()
    }

    fun removeAll() {
        evictAll()
    }

    fun putBitmap(url: String, bitmap: Bitmap) {
        if (get("url") == null) {
            put(url, bitmap)
        }
    }


}