package com.zhangrui.daggertest;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * DESC:
 * Created by zhangrui on 2016/12/28.
 */

public class DaggerApp extends Application {

    private AppComponent appComponent;

    @Inject
    RxBle mRxBle;
    @Inject
    SharedPreferences mSharedPreferences;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
    }

    public static DaggerApp get(Context context) {
        return (DaggerApp) context.getApplicationContext();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public RxBle getRxBle() {
        return mRxBle;
    }

}
