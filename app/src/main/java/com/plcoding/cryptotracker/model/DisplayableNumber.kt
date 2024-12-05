package com.plcoding.cryptotracker.model

import android.icu.text.NumberFormat
import java.util.Locale

data class DisplayableNumber(
    val value: Double,
    val formatted: String,
)

fun Double.toDisplayableNumber(): DisplayableNumber =
    DisplayableNumber(
        value = this,
        formatted =
            NumberFormat
                .getNumberInstance(Locale.getDefault())
                .apply {
                    maximumFractionDigits = 2
                    minimumFractionDigits = 2
                }.format(this),
    )
