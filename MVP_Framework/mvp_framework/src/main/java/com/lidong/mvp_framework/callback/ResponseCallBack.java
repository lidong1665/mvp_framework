package com.lidong.mvp_framework.callback;

import com.lidong.mvp_framework.base.BaseBean;

/**
 * @className:ResponseCallBack
 * @desc:
 * @author:Administrator
 * @createtime : 2016/9/12 14:58
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public interface ResponseCallBack<T> {

    void onStart();

    /**
     * onSuccess
     * @param s
     */

    void onSuccess(T s);

    /**
     * onFailure
     * @param e
     */
    void onFailure(Throwable e);


    void complete();

}
