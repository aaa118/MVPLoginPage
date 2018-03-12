package com.demo.aaa.mvp.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aaa on 3/12/18.
 */

@Module
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter providesLoginActivtyPresnter(LoginActivityMVP.Model model) {
        return new LoginActivtyPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model providesLoginActivityModel(LoginRepository repository) {
        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository providesLoginRepository() {
        return new MemoryRepository();
    }
}
