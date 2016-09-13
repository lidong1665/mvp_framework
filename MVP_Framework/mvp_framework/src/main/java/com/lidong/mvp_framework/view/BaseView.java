package com.lidong.mvp_framework.view;

import com.lidong.mvp_framework.presenter.BasePresenter;



public interface BaseView<T extends BasePresenter> {

    void showLoading();

    void hideLoading();



}
