package com.zhangrui.daggertest;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * DESC:
 * Created by zhangrui on 2016/12/29.
 */
@Module
public class ActivityModule {

    private Activity mActivity;

     ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityScope
    Activity activity(){
        return mActivity;
    }


}
