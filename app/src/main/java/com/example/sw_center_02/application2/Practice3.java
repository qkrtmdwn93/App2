package com.example.sw_center_02.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Practice3 extends AppCompatActivity {

    EditText E1;
    EditText E2;
    Button B1;
    Button B2;

    double enter_subssi, enter_fassi, subssi, fassi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice3);

        this.setTitle("온도 변환기");

        E1 = (EditText)findViewById(R.id.subssi);
        E2 = (EditText)findViewById(R.id.fassi);
        B1 = (Button)findViewById(R.id.cal_fassi);
        B2 = (Button)findViewById(R.id.cal_subssi);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E1.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력하세요", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    enter_subssi = Integer.parseInt(E1.getText().toString());
                    fassi = enter_subssi * 1.8 + 32;

                    Toast toast = Toast.makeText(getBaseContext(), "화씨 온도는 " + fassi + "도 입니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E2.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력하세요", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    enter_fassi = Integer.parseInt(E2.getText().toString());
                    subssi = (enter_fassi -32)/1.8;

                    Toast toast = Toast.makeText(getBaseContext(), "섭씨 온도는 " + subssi + "도 입니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
