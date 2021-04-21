package com.example.daggerlogin.root;

import android.app.Application;

import com.example.daggerlogin.login.LoginModule;

public class App extends Application {
    //Aquí tenemos que hacer la lógica
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        //Inicialización alternativa
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
