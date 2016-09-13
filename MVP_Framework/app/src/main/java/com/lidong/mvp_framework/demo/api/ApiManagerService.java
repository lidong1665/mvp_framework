package com.lidong.mvp_framework.demo.api;
import com.lidong.mvp_framework.demo.bean.DreamData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @className:ApiManagerService
 * @desc:
 * @author:Administrator
 * @createtime : 2016/9/12 15:12
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public interface ApiManagerService  {

    /**
     * getDreamData
     * @param key
     * @return
     */
    @GET("/dream/category")
    Observable<DreamData> getDreamData(@Query("key") String key);

}
