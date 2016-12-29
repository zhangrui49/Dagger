package com.zhangrui.daggertest;

import android.app.Application;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;

/**
 * DESC:
 * Created by zhangrui on 2016/12/28.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    Application getApplication();

    RxBle rxBle();

    SharedPreferences sharedPreferences();

    void inject(DaggerApp app);
}
