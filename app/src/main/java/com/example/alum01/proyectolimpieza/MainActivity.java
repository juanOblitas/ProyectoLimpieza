package com.example.alum01.proyectolimpieza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnPresupuesto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPresupuesto=(Button)findViewById(R.id.btnBudget);
        btnPresupuesto.setOnClickListener(this);
        //TextView mLink = (TextView) findViewById(R.id.web);
        //mLink.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==btnPresupuesto.getId()){
            startActivity(new Intent("com.example.alum01.intents.LoginUser"));
        }
    }

}

