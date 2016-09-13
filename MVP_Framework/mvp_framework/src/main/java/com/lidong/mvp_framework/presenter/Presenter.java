package com.lidong.mvp_framework.presenter;
/**
 * @className:Presenter
 * @desc:
 * @author:Administrator
 * @createtime : 2016/9/12 15:01
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public  interface Presenter<V> {

    void attachView(V view);

    void detachView();

}