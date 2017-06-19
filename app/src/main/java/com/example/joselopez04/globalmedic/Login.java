package com.example.joselopez04.globalmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goResetPass(View view) {
        Intent i = new Intent(this, Reset_password.class);
        startActivity(i);
    }

    public void goHome(View view)
    {
        Intent i = new Intent(this, HomeMenu.class);
        startActivity(i);
    }
}
