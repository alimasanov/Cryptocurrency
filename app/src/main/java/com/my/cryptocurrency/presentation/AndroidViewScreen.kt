package com.my.cryptocurrency.presentation

import android.graphics.Color
import android.widget.LinearLayout
import android.widget.TextView
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun AndroidViewScreen() {
    AndroidView(
        modifier = Modifier.fillMaxWidth(),
        factory = { context ->
            LinearLayout(context).apply {
                val text = TextView(context)
                text.text = "hello im android view"
                text.setTextColor(Color.parseColor("#ffffff"))
                addView(text)
            }
        }
    )
}