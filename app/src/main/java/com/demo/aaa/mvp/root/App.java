package com.demo.aaa.mvp.root;

import android.app.Application;

import com.demo.aaa.mvp.login.LoginModule;

/**
 * Created by aaa on 3/12/18.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
