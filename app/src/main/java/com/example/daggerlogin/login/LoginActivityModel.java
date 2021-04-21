package com.example.daggerlogin.login;

import com.example.daggerlogin.to.User;

public class LoginActivityModel implements ILoginActivityMVP.Model{
    private LoginRepository repository;

    public LoginActivityModel(LoginRepository repository){
        this.repository = repository;
    }

    @Override
    public void createUser(String firstName, String lastName) {
        //Lógica de bussines saber si el usuario ya existe, que el email es valido que la edad este bien
        repository.saveuser(new User(firstName, lastName));
    }

    @Override
    public User getUser() {
        //lógica de bussines comprobar el correo etc..
        return repository.getUser();
    }
}
