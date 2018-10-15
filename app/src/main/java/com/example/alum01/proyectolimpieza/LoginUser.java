package com.example.alum01.proyectolimpieza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class LoginUser extends AppCompatActivity implements OnClickListener{
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        register=(TextView)findViewById(R.id.register);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==register.getId()){
            startActivity(new Intent("com.example.alum01.intents.SignUp"));
        }
    }
}
