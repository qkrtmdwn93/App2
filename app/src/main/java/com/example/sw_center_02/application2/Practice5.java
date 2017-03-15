package com.example.sw_center_02.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Practice5 extends AppCompatActivity {

    EditText E1, E2;
    Button plus_btn, minus_btn, product_btn, divide_btn;
    int number1, number2, total;
    double number1_div, number2_div, total_div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice5);

        this.setTitle("계산기");

        E1 = (EditText)findViewById(R.id.enter_number1);
        E2 = (EditText)findViewById(R.id.enter_number2);
        plus_btn = (Button)findViewById(R.id.plus);
        minus_btn = (Button)findViewById(R.id.minus);
        product_btn = (Button)findViewById(R.id.product);
        divide_btn = (Button)findViewById(R.id.division);

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E1.getText().toString().replace(" ","").equals("") || E2.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력하세요", Toast.LENGTH_SHORT);
                    toast.show();
                    E1.requestFocus();
                    E2.requestFocus();
                }
                else{
                    number1 = Integer.parseInt(E1.getText().toString());
                    number2 = Integer.parseInt(E2.getText().toString());

                    total = number1 + number2;

                    Toast toast = Toast.makeText(getBaseContext(), "더하기 계산 결과는 "+ total + "입니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E1.getText().toString().replace(" ","").equals("") || E2.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력하세요", Toast.LENGTH_SHORT);
                    toast.show();
                    E1.requestFocus();
                    E2.requestFocus();
                }
                else{
                    number1 = Integer.parseInt(E1.getText().toString());
                    number2 = Integer.parseInt(E2.getText().toString());

                    total = number1 - number2;

                    Toast toast = Toast.makeText(getBaseContext(), "빼기 계산 결과는 "+ total + "입니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        product_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E1.getText().toString().replace(" ","").equals("") || E2.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력하세요", Toast.LENGTH_SHORT);
                    toast.show();
                    E1.requestFocus();
                    E2.requestFocus();
                }
                else{
                    number1 = Integer.parseInt(E1.getText().toString());
                    number2 = Integer.parseInt(E2.getText().toString());

                    total = number1 * number2;

                    Toast toast = Toast.makeText(getBaseContext(), "곱하기 계산 결과는 "+ total + "입니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E1.getText().toString().replace(" ","").equals("") || E2.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력하세요", Toast.LENGTH_SHORT);
                    toast.show();
                    E1.requestFocus();
                    E2.requestFocus();
                }
                else{
                    number1_div = Integer.parseInt(E1.getText().toString());
                    number2_div = Integer.parseInt(E2.getText().toString());

                    total_div = number1_div / number2_div;
                    total = (int)total_div;

                    Toast toast = Toast.makeText(getBaseContext(), "나누기 계산 결과는 "+ total + "입니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
