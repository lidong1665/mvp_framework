package com.lidong.mvp_framework.callback;

import com.lidong.mvp_framework.base.BaseBean;


public interface ResponseCallBack<T> {

    void onStart();

    /**
     * onSuccess
     * @param s  success
     */

    void onSuccess(T s);

    /**
     * onFailure
     * @param e error
     */
    void onFailure(Throwable e);


    void complete();

}
