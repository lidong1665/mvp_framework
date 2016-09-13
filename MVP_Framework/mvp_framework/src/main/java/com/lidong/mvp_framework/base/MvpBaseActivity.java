package com.lidong.mvp_framework.base;

import android.os.Bundle;

import com.lidong.mvp_framework.presenter.BasePresenter;


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
