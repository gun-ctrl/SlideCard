package com.example.slidecard.widget

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.slidecard.bean.CardConfig

class SlideCardLayoutManager:RecyclerView.LayoutManager() {
    override fun generateDefaultLayoutParams(): RecyclerView.LayoutParams {
        return RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onLayoutChildren(recycler: RecyclerView.Recycler?, state: RecyclerView.State?) {
        super.onLayoutChildren(recycler, state)
        detachAndScrapAttachedViews(recycler!!)
        val itemCount = itemCount
        var bottomPosition = 0
        if (itemCount<CardConfig.MAX_SHOW_COUNT){
            bottomPosition = 0
        }else{
            bottomPosition = itemCount - CardConfig.MAX_SHOW_COUNT
        }
        for (i in bottomPosition until  itemCount){
            val view = recycler.getViewForPosition(i)
            addView(view)
            //测量
            measureChildWithMargins(view,0,0)
            val widthSpace = width - getDecoratedMeasuredHeight(view)
            val heightSpace = height - getDecoratedMeasuredHeight(view)
            //布局
            layoutDecoratedWithMargins(view,
            widthSpace/2,
            heightSpace/2,
            widthSpace/2+getDecoratedMeasuredWidth(view),
            heightSpace/2+getDecoratedMeasuredHeight(view))
            var level = itemCount -i -1
            if (level>0){
                if (level<CardConfig.MAX_SHOW_COUNT-1){
                    view.translationY = CardConfig.TRANS_Y_GAP * level
                    view.scaleX = 1-CardConfig.SCALE_GAP*level
                    view.scaleY = 1-CardConfig.SCALE_GAP*level
                }else{
                    view.translationY = CardConfig.TRANS_Y_GAP * (level-1)
                    view.scaleX = 1-CardConfig.SCALE_GAP*(level-1)
                    view.scaleY = 1-CardConfig.SCALE_GAP*(level-1)
                }
            }
        }
    }
}