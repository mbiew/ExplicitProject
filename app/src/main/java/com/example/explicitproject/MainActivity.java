package com.example.explicitproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnNext1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext1 = (Button) findViewById(R.id.btn1);
        btnNext1.setOnClickListener(this);
    }

    @Override

     public void onClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                Intent btnNext1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(btnNext1);
            default:
                break;
        }
        }




}
