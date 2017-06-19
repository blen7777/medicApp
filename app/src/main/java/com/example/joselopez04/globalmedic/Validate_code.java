package com.example.joselopez04.globalmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Validate_code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_code);
    }

    public void goValidatePass(View view)
    {
        Intent i = new Intent(this, Validation_pass.class);
        startActivity(i);
    }
}
