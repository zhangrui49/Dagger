package com.zhangrui.daggertest;

import android.app.Activity;

import dagger.Component;

/**
 * DESC:
 * Created by zhangrui on 2016/12/29.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();

    void inject(MainActivity activity);
}
