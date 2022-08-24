package com.example.inter_challenge.utilities

import android.content.Intent
import android.net.Uri
import androidx.fragment.app.Fragment

fun Fragment.openUrl(url: String) {
    startActivity(
        Intent(
            Intent.ACTION_VIEW,
            Uri.parse(url)
        )
    )
}
