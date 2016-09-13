package com.lidong.mvp_framework.util;

import com.lidong.mvp_framework.base.GlobalConsts;

import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @className:RetrofitUtil
 * @desc:
 * @author:lidong
 * @createtime : 2016/9/12 14:50
 * @email :lidong@chni.com.cn
 * @qq:1561281670
 * @company:chni
 */
public class RetrofitUtil {

    public static final HttpUrl PRODUCTION_API_URL = HttpUrl.parse(GlobalConsts.URL);

    /**
     *
     * @return
     */
    public static OkHttpClient provideOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.newBuilder().
                connectTimeout(60 * 1000, TimeUnit.MILLISECONDS).
                readTimeout(60 * 1000, TimeUnit.MILLISECONDS);
        return okHttpClient;
    }

    public static HttpUrl provideBaseUrl() {
        return PRODUCTION_API_URL;
    }

    public static Retrofit provideRetrofit() {
        return new Retrofit.Builder().client(provideOkHttpClient()) //
                .baseUrl(provideBaseUrl()) //
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) //
                .build();
    }

}
