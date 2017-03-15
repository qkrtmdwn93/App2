package com.example.sw_center_02.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Practice2 extends AppCompatActivity {

    EditText E1;
    EditText E2;
    Button B1;
    Button B2;

    int enter_age, enter_birth, age, birth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice2);

        this.setTitle("나이 계산기");

        E1 = (EditText)findViewById(R.id.year);
        E2 = (EditText)findViewById(R.id.age);
        B1 = (Button) findViewById(R.id.calcu_Age);
        B2 = (Button) findViewById(R.id.calcu_Year);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(E1.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력해주세요", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    enter_birth = Integer.parseInt(E1.getText().toString());
                    age = 2017 - enter_birth + 1;

                    Toast toast = Toast.makeText(getBaseContext(), "당신의 나이는 " + age + "세 입니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(E2.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력해주세요", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    enter_age = Integer.parseInt(E2.getText().toString());
                    birth = 2017 - enter_age + 1;

                    Toast toast = Toast.makeText(getBaseContext(), "당신의 태어난 해는 " + birth + "년 입니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
