package com.lidong.mvp_framework.base;

import android.os.Bundle;
import android.view.View;

import com.lidong.mvp_framework.presenter.BasePresenter;

/**
 * @className:MvpFragment
 * @desc:
 * @author:Administrator
 * @createtime : 2016/9/12 14:50
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment{

    protected P mvpPresenter;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mvpPresenter = createPresenter();
    }

    protected abstract P createPresenter();


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }

}
