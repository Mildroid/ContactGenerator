package com.mildroid.contactgenerator.core

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import kotlin.math.log10

fun Any?.log(msg: Any? = "", type: Int = Log.DEBUG) {
    when (type) {
        Log.DEBUG -> Log.d(TAG, "$msg -> $this")
        Log.ERROR -> Log.e(TAG, "$msg -> $this")
    }
}

inline fun <reified T : ViewBinding> AppCompatActivity.viewBinding() =
    ActivityViewBindingDelegate(T::class.java)

fun Int.length(): Int {
    return (log10(this.toDouble()) + 1).toInt()
}