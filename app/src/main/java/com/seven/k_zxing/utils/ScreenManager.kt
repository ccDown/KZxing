package com.seven.k_zxing.utils

import android.content.Context
import android.view.WindowManager


/**
 * @description
 * @author kuan
 * Created on 2018/3/16.
 */
class ScreenManager(context: Context){
    object ScreenManager
    companion object {

        fun getContext(context: Context): WindowManager {
            return context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        }

        fun getWidth(context: Context): Int {
            return getContext(context).defaultDisplay.width
        }

        fun getHeight(context: Context): Int {
            return getContext(context).defaultDisplay.height
        }
    }
}