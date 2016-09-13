package com.lidong.mvp_framework.demo.api;

import com.lidong.mvp_framework.util.RetrofitUtil;
import com.lidong.mvp_framework.demo.bean.DreamData;

import rx.Observable;

/**
 * Created by Administrator on 2016/9/12.
 */
public class ApiManager {

    private static final ApiManagerService apiManagerService = RetrofitUtil.provideRetrofit().create(ApiManagerService.class);

    /**
     * 获取周公解梦类型
     * @param key
     * @return
     */
     public static Observable<DreamData> getDreamData(String key) {
        Observable<DreamData> ss = apiManagerService.getDreamData(key);
        return  ss;
    }
}
