package com.lidong.mvp_framework.presenter;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * @className:BasePresenter
 * @desc:
 * @author:lidong
 * @createtime : 2016/9/12 10:36
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public  class BasePresenter<V> implements Presenter<V> {

    public V mvpView;

    private CompositeSubscription mCompositeSubscription;
    @Override
    public void attachView(V mvpView) {
        this.mvpView = mvpView;
    }


    @Override
    public void detachView() {
        this.mvpView = null;
        onUnsubscribe();
    }


    //RXjava取消注册，以避免内存泄露
    public void onUnsubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    //RXjava注册
    public void addSubscription(Subscription subscriber) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscriber);
    }
}
