package com.example.slidecard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import com.example.slidecard.adapter.SlideCardAdapter
import com.example.slidecard.bean.SlideCardBean
import com.example.slidecard.utils.SlideCallBack
import com.example.slidecard.utils.getSlideBeanArr
import com.example.slidecard.widget.SlideCardLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: SlideCardAdapter
    private lateinit var mDatas:MutableList<SlideCardBean>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        slide_card_recycler.layoutManager = SlideCardLayoutManager()
        mDatas = getSlideBeanArr()
        adapter = SlideCardAdapter(mDatas)
        slide_card_recycler.adapter = adapter
        ItemTouchHelper(SlideCallBack(adapter,mDatas)).attachToRecyclerView(slide_card_recycler)
    }
}