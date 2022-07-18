package com.example.slidecard.utils

import com.example.slidecard.application.AppConfig
import com.example.slidecard.bean.SlideCardBean

fun dp2px(dp: Int) = (AppConfig.getContext().resources.displayMetrics.density * dp + 0.5f).toInt()

fun getSlideBeanArr():MutableList<SlideCardBean> {
    val cardlist = mutableListOf<SlideCardBean>()
    var i = 1
    cardlist.add(
        SlideCardBean(
            i++,
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Ffile03.16sucai.com%2F2017%2F1100%2F16sucai_p565c192_9bb.JPG&refer=http%3A%2F%2Ffile03.16sucai.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639731811&t=953044e9a7a00caad41d838e03fae4d5",
            "风景1"
        )
    )
    cardlist.add(
        SlideCardBean(
            i++,
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Ffile03.16sucai.com%2F2016%2F10%2F1100%2F16sucai_p20161021096_1e4.JPG&refer=http%3A%2F%2Ffile03.16sucai.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639731811&t=cd69c0b935ba47c6c747f6c7fb66423b",
            "风景2"
        )
    )
    cardlist.add(
        SlideCardBean(
            i++,
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Ffile02.16sucai.com%2Fd%2Ffile%2F2014%2F0708%2Fcb141e9f4892b50576faa758e523c1dc.jpg&refer=http%3A%2F%2Ffile02.16sucai.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639731811&t=e36859ef7a4324a80a134558591e3fa1",
            "风景3"
        )
    )
    cardlist.add(
        SlideCardBean(
            i++,
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Ffile03.16sucai.com%2F2017%2F1100%2F16sucai_P59202G028.JPG&refer=http%3A%2F%2Ffile03.16sucai.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639731811&t=ad55e4e8e6454618c70d65740259a671",
            "风景4"
        )
    )
    cardlist.add(
        SlideCardBean(
            i++,
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Ffile03.16sucai.com%2F2017%2F1100%2F16sucai_P591F9G135.JPG&refer=http%3A%2F%2Ffile03.16sucai.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639731811&t=bcbab0262f8899eb77117b41536780ec",
            "风景5"
        )
    )
    cardlist.add(
        SlideCardBean(
            i++,
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg08.viwik.com%2Fimages%2F20180818%2Ftooopen_sy_105737573715611.jpg&refer=http%3A%2F%2Fimg08.viwik.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639731811&t=f9e88d3de951ae0ed59081b33ef2be0a",
            "风景6"
        )
    )
    cardlist.add(
        SlideCardBean(
            i++,
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic9.nipic.com%2F20100914%2F2531170_171928949919_2.jpg&refer=http%3A%2F%2Fpic9.nipic.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639731811&t=11dd0944a40df20c1aa3948092dc0332",
            "风景7"
        )
    )
    cardlist.add(
        SlideCardBean(
            i++,
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fup.enterdesk.com%2Fedpic%2F7c%2F63%2F4b%2F7c634b2d4b4a7a2dc1377ad02849e390.jpg&refer=http%3A%2F%2Fup.enterdesk.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1639731811&t=67ebaa8d51b5e1619ae7afd69f67c4f9",
            "风景8"
        )
    )
    return cardlist
}