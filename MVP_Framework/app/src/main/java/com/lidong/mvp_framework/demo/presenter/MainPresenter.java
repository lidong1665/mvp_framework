package com.lidong.mvp_framework.demo.presenter;

import com.lidong.mvp_framework.callback.ResponseCallBack;
import com.lidong.mvp_framework.demo.bean.DreamData;
import com.lidong.mvp_framework.demo.model.DreamModel;
import com.lidong.mvp_framework.demo.model.DreamModelImpl;
import com.lidong.mvp_framework.demo.view.MainView;
import com.lidong.mvp_framework.presenter.BasePresenter;

/**
 * @className:MainPresenter
 * @desc:
 * @author:Administrator
 * @createtime : 2016/9/12 15:48
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public class MainPresenter  extends BasePresenter<MainView> {

    private DreamModel mDreamModel;

    public MainPresenter(MainView view) {
        attachView(view);
        mDreamModel  = new DreamModelImpl();
    }


   public void getDreamData(String key){
       addSubscription(mDreamModel.getDreamData(key, new ResponseCallBack<DreamData>() {
           @Override
           public void onStart() {
               mvpView.showLoading();
           }

           @Override
           public void onSuccess(DreamData dreamData) {
               if (dreamData != null && "successed".equals(dreamData.getReason())) {
                   mvpView.loadDreamBean(dreamData.getResult());
               }
           }
           @Override
           public void onFailure(Throwable e) {
               mvpView.loadError();
           }

           @Override
           public void complete() {
               mvpView.hideLoading();
           }
       }));
   }


}
