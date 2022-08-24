package com.example.inter_challenge.utilities.extensions

import com.example.inter_challenge.utilities.Constants.DATE_BR
import java.text.SimpleDateFormat
import java.util.*


fun String.toDate(format: String = DATE_BR): Date {
    val sdf = SimpleDateFormat(format, Locale("pt", "BR"))
    return sdf.parse(this) ?: Date()
}

fun Date.format(format: String): String =
    SimpleDateFormat(format, Locale("pt", "BR"))
        .format(this)
