package com.lidong.mvp_framework.view;

import com.lidong.mvp_framework.presenter.BasePresenter;

/**
 * @className:BaseView
 * @desc:lidong
 * @author:Administrator
 * @createtime : 2016/9/12 10:36
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public interface BaseView<T extends BasePresenter> {

    void showLoading();

    void hideLoading();



}
