package com.seven.k_zxing.module.info

import client.yalantis.com.githubclient.mvp.BaseMvpPresenter
import client.yalantis.com.githubclient.mvp.BaseMvpView

/**
 * @description 协议
 * @author kuan
 * Created on 2018/3/16.
 */
class InfoContract{
    interface View:BaseMvpView{
        fun getInfo():String
    }

    interface Presenter:BaseMvpPresenter<View>{
        fun getInfoAndShowPicture(): String
    }
}