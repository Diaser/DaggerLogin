package com.example.daggerlogin.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.daggerlogin.R;
import com.example.daggerlogin.root.App;
import com.example.daggerlogin.utils.Utils;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements ILoginActivityMVP.View {

    EditText editName, editPassword;
    Button btnAceptar;
    @Inject
    ILoginActivityMVP.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getComponent().inject(this);
        editName = findViewById(R.id.edit_nombre);
        editPassword = findViewById(R.id.edit_contra);
        btnAceptar = findViewById(R.id.button_iniciar);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginButtonClicked();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstName() {
        return this.editName.getText().toString();
    }

    @Override
    public String getLastName() {
        return this.editPassword.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {
        Utils.showToastMessage(getApplicationContext(),"Error. Usuario no disponible");
    }

    @Override
    public void showInputError() {
        Utils.showToastMessage(getApplicationContext(),"Error. Datos vacíos");
    }

    @Override
    public void showUserSaved() {
        Utils.showToastMessage(getApplicationContext(),"Usuario guardado correctamente");
    }

    @Override
    public void setFirstName(String firstName) {
        this.editName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        this.editPassword.setText(lastName);
    }
}