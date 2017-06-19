package com.example.joselopez04.globalmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Validation_pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation_pass);
    }

    public void goLogin(View view)
    {
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
}
