package com.lidong.mvp_framework.base;

import android.os.Bundle;

import com.lidong.mvp_framework.presenter.BasePresenter;

/**
 * @className:MvpBaseActivity
 * @desc:
 * @author:lidong
 * @createtime : 2016/9/12 14:26
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public abstract class MvpBaseActivity<P extends BasePresenter> extends BaseActivity{

    protected P mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mvpPresenter = createPresenter();
        super.onCreate(savedInstanceState);
    }

    public abstract P createPresenter() ;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }
}
