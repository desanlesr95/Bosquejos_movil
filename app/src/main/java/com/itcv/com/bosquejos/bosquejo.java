package com.itcv.com.bosquejos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bosquejo extends AppCompatActivity implements View.OnClickListener{
    Button atras,fin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bosquejo);
        atras=(Button)findViewById(R.id.atras);
        fin=(Button)findViewById(R.id.fin);
        atras.setOnClickListener(this);
        fin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.atras:
                Intent i=new Intent(this,MainActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.fin:
                finish();
                break;
        }
    }
}
