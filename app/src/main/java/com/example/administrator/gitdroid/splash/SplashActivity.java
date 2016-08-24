package com.example.administrator.gitdroid.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.gitdroid.MainActivity;
import com.example.administrator.gitdroid.R;
import com.example.administrator.gitdroid.conmmons.ActivityUtils;
import com.example.administrator.gitdroid.login.LoginActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by Administrator on 2016/8/23.
 */
public class SplashActivity extends AppCompatActivity {
    private ActivityUtils activityUtils;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        activityUtils = new ActivityUtils(this);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btnLogin) void  login(){
        activityUtils.startActivity(LoginActivity.class);
        finish();
    }
    @OnClick(R.id.btnEnter) void  enter(){
        activityUtils.startActivity(MainActivity.class);
    }
}
