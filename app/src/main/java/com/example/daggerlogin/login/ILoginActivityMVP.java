package com.example.daggerlogin.login;

import com.example.daggerlogin.to.User;

public interface ILoginActivityMVP {

    interface Model{
        void createUser(String firstName, String lastName);
        User getUser();
    }
    interface View{
        String getFirstName();
        String getLastName();

        void showUserNotAvailable();
        void showInputError();
        void showUserSaved();

        void setFirstName(String firstName);
        void setLastName(String lastName);
    }
    interface Presenter{
        void setView(ILoginActivityMVP.View view);
        void loginButtonClicked();

        void getCurrentUser();
    }

}
