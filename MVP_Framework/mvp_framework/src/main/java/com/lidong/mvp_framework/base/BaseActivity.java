package com.lidong.mvp_framework.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/9/12.
 */
public class BaseActivity extends AppCompatActivity {

   public final static String TAG =BaseActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
