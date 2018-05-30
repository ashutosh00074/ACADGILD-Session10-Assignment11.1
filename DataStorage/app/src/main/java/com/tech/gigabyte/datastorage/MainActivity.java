package com.tech.gigabyte.datastorage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button answer1Activity, answer2Activity, answer3Activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaring
        answer1Activity = (Button) findViewById(R.id.btn1);
        answer2Activity = (Button) findViewById(R.id.btn2);
        answer3Activity = (Button) findViewById(R.id.btn3);


    }

    //OnClick Event
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent i = new Intent(this, answer1.class);
                startActivity(i);
                break;
            case R.id.btn2:
                Intent j = new Intent(this, answer2.class);
                startActivity(j);
                break;
            case R.id.btn3:
                Intent k = new Intent(this, answer3.class);
                startActivity(k);
                break;


        }
    }
}
