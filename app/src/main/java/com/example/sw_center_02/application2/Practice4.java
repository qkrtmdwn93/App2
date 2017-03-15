package com.example.sw_center_02.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Practice4 extends AppCompatActivity {
    EditText E1, E2, E3;
    Button btn;
    CheckBox C1;
    TextView T1, T2;
    int enter_pizza, enter_spa, enter_salad, orderCount, orderPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice4);

        this.setTitle("레스토랑 메뉴 주문");

        E1 = (EditText)findViewById(R.id.enter_pizza);
        E2 = (EditText)findViewById(R.id.enter_spaghetti);
        E3 = (EditText)findViewById(R.id.enter_salad);
        btn = (Button)findViewById(R.id.calculate);
        C1 = (CheckBox)findViewById(R.id.isHave_MembershipCard);
        T1 = (TextView)findViewById(R.id.orderCount);
        T2 = (TextView)findViewById(R.id.orderPrice);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E1.getText().toString().replace(" ","").equals("") || E2.getText().toString().replace(" ","").equals("") || E3.getText().toString().replace(" ","").equals("")){
                    Toast toast = Toast.makeText(getBaseContext(), "값을 입력하세요", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    enter_pizza = Integer.parseInt(E1.getText().toString());
                    enter_spa = Integer.parseInt(E2.getText().toString());
                    enter_salad = Integer.parseInt(E3.getText().toString());

                    orderCount = enter_pizza + enter_spa + enter_salad;
                    orderPrice = (enter_pizza * 15000) + (enter_spa * 13000) + ( enter_salad * 9000);
                    if(C1.isChecked()){
                        orderPrice = orderPrice - (orderPrice / 10);
                    }
                    T1.setText(orderCount + "개");
                    T2.setText(orderPrice + "원");
                }
            }
        });
    }
}
