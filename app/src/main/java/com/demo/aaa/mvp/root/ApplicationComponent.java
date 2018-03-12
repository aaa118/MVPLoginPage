package com.demo.aaa.mvp.root;

import com.demo.aaa.mvp.login.LoginActivity;
import com.demo.aaa.mvp.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;

/**
 * Created by aaa on 3/12/18.
 */

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);
}
