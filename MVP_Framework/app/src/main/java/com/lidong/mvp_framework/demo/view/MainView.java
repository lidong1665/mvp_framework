package com.lidong.mvp_framework.demo.view;

import com.lidong.mvp_framework.demo.bean.DreamData;
import com.lidong.mvp_framework.demo.presenter.MainPresenter;
import com.lidong.mvp_framework.view.BaseView;

import java.util.List;

/**
 * Created by Administrator on 2016/9/12.
 */
public interface MainView  extends BaseView<MainPresenter>{

    void loadDreamBean(List<DreamData.ResultBean> s);

    void loadError();
}
