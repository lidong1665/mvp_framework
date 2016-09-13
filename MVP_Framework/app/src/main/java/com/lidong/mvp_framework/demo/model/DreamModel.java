package com.lidong.mvp_framework.demo.model;

import com.lidong.mvp_framework.callback.ResponseCallBack;
import com.lidong.mvp_framework.demo.bean.DreamData;

import rx.Subscription;

/**
 * Created by Administrator on 2016/4/21.
 */
public interface DreamModel {

    Subscription getDreamData(String key, ResponseCallBack<DreamData>callBack);

}
