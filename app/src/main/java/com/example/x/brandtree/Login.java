package com.example.x.brandtree;

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
    public void otp(View view){
        Intent intent = new Intent(
                Login.this, OTPActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_right_out, R.anim.slide_right_in);
    }
}
