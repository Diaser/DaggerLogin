package com.example.daggerlogin.login;

import androidx.annotation.Nullable;

import com.example.daggerlogin.to.User;

public class LoginPresenter implements ILoginActivityMVP.Presenter{

    @Nullable
    private ILoginActivityMVP.View view;
    private ILoginActivityMVP.Model model;

    public LoginPresenter(ILoginActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(ILoginActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {
        if(view != null){
            if(view.getFirstName().trim().equals("") || view.getLastName().trim().equals(""))
                view.showInputError();
            else{
                model.createUser(view.getFirstName().trim(), view.getLastName().trim());
            }
        }
    }

    @Override
    public void getCurrentUser() {
        User user = model.getUser();
        if(user == null){
            if(view !=null){
                view.showUserNotAvailable();
            }
        }else{
            if(view!=null){
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }
        }
    }
}
