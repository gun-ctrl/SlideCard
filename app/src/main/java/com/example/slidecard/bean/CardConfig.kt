package com.example.slidecard.bean

import android.util.DisplayMetrics
import android.util.TypedValue
import com.example.slidecard.application.AppConfig

class CardConfig {
    companion object{
        const val MAX_SHOW_COUNT = 4
        const val SCALE_GAP = 0.05f
        //把非标准尺寸转换为标准尺寸
        val TRANS_Y_GAP = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
            15F,
            AppConfig.getContext().resources.displayMetrics
        )
    }
}