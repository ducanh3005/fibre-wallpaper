package com.gplio.fibrewallpaper.lib.files

import android.content.Context
import com.gplio.fibrewallpaper.lib.logger.Logger
import java.io.IOException
import java.io.InputStreamReader

private const val TAG = "Files"

fun readStringFromAssets(context: Context, filename: String?, defaultText: String): String {
    if (filename == null) return defaultText

    try {
        val inputStream = context.assets.open(filename)
        return InputStreamReader(inputStream).readText()

    } catch (e: IOException) {
        Logger.d(TAG, "readStringFromAssets", "e=$e")
    }
    return defaultText
}