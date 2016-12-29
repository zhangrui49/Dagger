package com.zhangrui.daggertest;

import android.content.Context;
import android.util.Log;

import javax.inject.Singleton;

/**
 * DESC:
 * Created by zhangrui on 2016/12/28.
 */
@Singleton
public class RxBle {
    private Context mContext;

    public static RxBle getInstance(Context context){
        Log.e("aa","rxble");
        return new RxBle();
    }
}
