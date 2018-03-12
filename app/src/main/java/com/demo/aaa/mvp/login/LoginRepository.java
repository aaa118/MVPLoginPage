package com.demo.aaa.mvp.login;

/**
 * Created by aaa on 3/12/18.
 */

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
