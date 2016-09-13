package com.lidong.mvp_framework.presenter;


public  interface Presenter<V> {

    void attachView(V view);

    void detachView();

}