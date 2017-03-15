package com.example.sw_center_02.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Practice1 extends AppCompatActivity {

     EditText E1;
     EditText E2;

    int appleprice;
    int applegetsu;
    int total;
     Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice1);

        this.setTitle("나의 첫번째 앱");
        E1 = (EditText)findViewById(R.id.apple_price);
        E2 = (EditText)findViewById(R.id.apple_getsu);
        calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(E1.getText().toString() .replace(" ","").equals("") || E2.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력해주세요", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {

                    appleprice = Integer.parseInt(E1.getText().toString());
                    applegetsu = Integer.parseInt(E2.getText().toString());

                    total = applegetsu * appleprice * 100;

                    Toast toast = Toast.makeText(getBaseContext(), "사과의 가격은" + total + "원 입니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
                }
            });

    }
}
