package com.seven.k_zxing.module.info

import client.yalantis.com.githubclient.mvp.BaseMvpPresenterImpl
import com.seven.k_zxing.utils.CreateQRCode
import com.seven.k_zxing.utils.ScreenManager

/**
 * @description
 * @author kuan
 * Created on 2018/3/16.
 */
class InfoPresenter:BaseMvpPresenterImpl<InfoContract.View>(),InfoContract.Presenter{
    override fun getInfoAndShowPicture(): String {

        val width = ScreenManager.getWidth(mView!!.getContext())
        val hight = ScreenManager.getHeight(mView!!.getContext())
        val info = mView!!.getInfo()
        val filePath = mView!!.getContext().externalCacheDir.absolutePath+"//info.png"
        CreateQRCode.createQRCode(info,"png",width,hight,filePath)
        return filePath
    }

}