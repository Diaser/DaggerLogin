package com.example.daggerlogin.login;

import com.example.daggerlogin.to.User;

public interface LoginRepository {

    void saveuser(User user);
    User getUser();
}
