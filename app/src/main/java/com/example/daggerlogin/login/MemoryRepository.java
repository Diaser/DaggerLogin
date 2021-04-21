package com.example.daggerlogin.login;

import com.example.daggerlogin.to.User;

public class MemoryRepository implements LoginRepository{
    private User user;

    @Override
    public void saveuser(User user) {
        if(user == null)
            user = getUser();
        else
            this.user = user;

    }

    @Override
    public User getUser() {
        if(user == null) {
            user = new User("Atonio", "Banderas");
            user.setId(0);
            return user;
        }else{
            return user;
        }
    }
}
