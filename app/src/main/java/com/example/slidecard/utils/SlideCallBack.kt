package com.example.slidecard.utils

import android.annotation.SuppressLint
import android.graphics.Canvas
import android.util.Log
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.slidecard.adapter.SlideCardAdapter
import com.example.slidecard.bean.CardConfig
import com.example.slidecard.bean.SlideCardBean
import kotlin.math.sqrt

class SlideCallBack(
    private val adapter:SlideCardAdapter,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                               private val mData:MutableList<SlideCardBean>
):ItemTouchHelper.SimpleCallback(0,15) {
    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        val remove = mData.removeAt(viewHolder.layoutPosition)
        mData.add(0,remove)
        adapter.notifyDataSetChanged()
    }

    override fun onChildDraw(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
        val maxDistance = recyclerView.width * 0.5f
        val distance = sqrt((dX*dX+dY*dY).toDouble())
        var fraction = distance/maxDistance
        if (fraction>1){
            fraction= 1.0
        }
        val itemCount = recyclerView.childCount
        Log.v("ppp","itemCount: $itemCount")
        for(i in 0 until itemCount){
            val view = recyclerView.getChildAt(i)
            val level = itemCount - i - 1
            Log.v("pc","level: $level")
            if (level>0){
                //重绘level=1，2 ->也就是i=5,6
                if (level<CardConfig.MAX_SHOW_COUNT-1){
                    view.translationY = (CardConfig.TRANS_Y_GAP * (level-fraction)).toFloat()
                    view.scaleX = (1-CardConfig.SCALE_GAP*level+fraction*CardConfig.SCALE_GAP).toFloat()
                    view.scaleY = (1-CardConfig.SCALE_GAP*level+fraction*CardConfig.SCALE_GAP).toFloat()
                }
            }
        }
    }

    override fun getAnimationDuration(
        recyclerView: RecyclerView,
        animationType: Int,
        animateDx: Float,
        animateDy: Float
    ): Long {
        return 500
    }
}