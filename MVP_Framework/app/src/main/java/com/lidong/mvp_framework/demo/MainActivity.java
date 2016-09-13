package com.lidong.mvp_framework.demo;

import android.os.Bundle;
import android.util.Log;

import com.lidong.mvp_framework.base.MvpBaseActivity;
import com.lidong.mvp_framework.demo.bean.DreamData;
import com.lidong.mvp_framework.demo.presenter.MainPresenter;
import com.lidong.mvp_framework.demo.view.MainView;

import java.util.List;

/**
 * @className:MainActivity
 * @desc:
 * @author:Administrator
 * @createtime : 2016/9/12 14:58
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public class MainActivity extends MvpBaseActivity<MainPresenter> implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mvpPresenter.getDreamData("c73b082b0c150b3bcba2cea1b96a8922");;
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void loadDreamBean(List<DreamData.ResultBean> s) {
        Log.d(TAG, "loadDreamBean() called with: " + "s = [" + s + "]");
    }

    @Override
    public void loadError() {

    }
}
