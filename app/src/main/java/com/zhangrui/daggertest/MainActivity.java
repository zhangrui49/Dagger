package com.zhangrui.daggertest;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    RxBle mRxBle;
    @Inject
    SharedPreferences mSharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApp.get(this).getAppComponent().rxBle();
        DaggerApp.get(this).getAppComponent().sharedPreferences();
        mSharedPreferences.edit().putString("aaa","dsadasdas").apply();
        Toast.makeText(this, mSharedPreferences.getString("aaa","123456789"), Toast.LENGTH_SHORT).show();
    }
}
