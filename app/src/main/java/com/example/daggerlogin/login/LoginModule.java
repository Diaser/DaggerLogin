package com.example.daggerlogin.login;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public ILoginActivityMVP.Presenter provideLoginActivityPresenter(ILoginActivityMVP.Model model){
        return new LoginPresenter(model);
    }

    @Provides
    ILoginActivityMVP.Model provideLoginActivityModel(LoginRepository repository){
        return new LoginActivityModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new MemoryRepository(); //BD, CLOUD etc...
    }

}
