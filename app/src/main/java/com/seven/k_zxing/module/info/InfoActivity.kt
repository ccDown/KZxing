package com.seven.k_zxing.module.info

import android.content.Context
import android.os.Bundle
import client.yalantis.com.githubclient.mvp.BaseMvpActivity
import client.yalantis.com.githubclient.mvp.BaseMvpPresenterImpl
import kotlinx.android.synthetic.main.activity_info.*

/**
 * @description
 * @author kuan
 * Created on 2018/3/16.
 */
class InforepositoryActivity : BaseMvpActivity<InfoContract.View,
        InfoPresenter>(),
        InfoContract.View {

    override fun getInfo(): String {
        return et_info.text.toString()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getContext(): Context {
        return
    }

    override fun showError(error: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(stringResId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showMessage(srtResId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showMessage(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}