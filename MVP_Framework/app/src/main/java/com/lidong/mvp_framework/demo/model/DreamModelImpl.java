package com.lidong.mvp_framework.demo.model;


import com.lidong.mvp_framework.callback.ResponseCallBack;
import com.lidong.mvp_framework.demo.api.ApiManager;
import com.lidong.mvp_framework.demo.bean.DreamData;

import java.util.List;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/4/21.
 */
public class DreamModelImpl implements DreamModel {

    @Override
    public Subscription getDreamData(String key, final ResponseCallBack callBack) {
        callBack.onStart();
        Observable<DreamData> request =  ApiManager.getDreamData(key).cache();
        Subscription sub = request.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<DreamData>() {
                    @Override
                    public void call(DreamData dreamData) {
                            callBack.onSuccess(dreamData);
                            callBack.complete();
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        callBack.onFailure(throwable);
                        callBack.complete();
                    }
                });

           return  sub;
    }

}
