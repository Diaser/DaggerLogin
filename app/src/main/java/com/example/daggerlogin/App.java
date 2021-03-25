package com.example.daggerlogin;

import android.app.Application;

public class App extends Application {
    //Aquí tenemos que hacer la lógica
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        //Inicialización alternativa
        component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
