package com.zhangrui.daggertest;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * DESC:
 * Created by zhangrui on 2016/12/28.
 */
@Module
public class AppModule {
    private final DaggerApp mApp;

    public AppModule(DaggerApp app) {
        mApp = app;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApp;
    }

    @Provides
    @Singleton
    RxBle provideRxBle() {
        return RxBle.getInstance(mApp);
    }

    @Provides
    @Singleton
    SharedPreferences provideSp() {
        return PreferenceManager.getDefaultSharedPreferences(mApp);
    }

}
