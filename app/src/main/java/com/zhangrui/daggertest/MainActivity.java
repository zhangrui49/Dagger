package com.zhangrui.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DaggerApp.get(this).getAppComponent().rxBle();
        //DaggerActivityComponent.builder().build().inject(this);
        DaggerApp.get(this).getRxBle();
    }


    //  建议写在基类Activity里
    private  ActivityComponent getActivityComponent(){
        return  DaggerActivityComponent.builder()
                .appComponent(DaggerApp.get(this).getAppComponent())
                .activityModule(getActivityModule())
                .build();
    }

    //  建议写在基类Activity里
    private ActivityModule getActivityModule(){
        return new ActivityModule(this);
    }
}
