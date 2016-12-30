package com.zhangrui.daggertest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * DESC:
 * Created by zhangrui on 2016/12/28.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(DaggerApp app);

    RxBle RxBle();
}
