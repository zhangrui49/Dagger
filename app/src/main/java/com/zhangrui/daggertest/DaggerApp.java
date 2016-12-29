package com.zhangrui.daggertest;

import android.app.Application;
import android.content.Context;

/**
 * DESC:
 * Created by zhangrui on 2016/12/28.
 */

public class DaggerApp extends Application {

    private AppComponent appComponent;

//    @Inject
//    RxBle mRxBle;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static DaggerApp get(Context context) {
        return (DaggerApp) context.getApplicationContext();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
