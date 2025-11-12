package com.vpnshare

import android.content.Context
import android.content.Intent
import android.webkit.JavascriptInterface
import android.widget.Toast

class WebAppInterface(private val context: Context) {

    @JavascriptInterface
    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    @JavascriptInterface
    fun shareText(text: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
        }
        context.startActivity(Intent.createChooser(intent, "Share via"))
    }

    @JavascriptInterface
    fun getDeviceInfo(): String {
        return """
            {
                "model": "${android.os.Build.MODEL}",
                "version": "${android.os.Build.VERSION.RELEASE}",
                "sdk": ${android.os.Build.VERSION.SDK_INT}
            }
        """.trimIndent()
    }
}
