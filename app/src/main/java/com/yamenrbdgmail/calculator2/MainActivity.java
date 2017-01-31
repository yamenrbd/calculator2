package com.yamenrbdgmail.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bt1;private Button bt9;
    private Button bt2;private Button bt0;
    private Button bt3;private Button btPlus;
    private Button bt4;private Button btMinus;
    private Button bt5;private Button btMultiply;
    private Button bt6;private Button btDivide;
    private Button bt7;private Button btResult;
    private Button bt8;private TextView result;
    private Button bt00;private Button btDot;
    private double first; private double second;
    private String res; int operation ;private Button clc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0 = (Button) findViewById(R.id.btn0);bt6 = (Button) findViewById(R.id.btn6);
        bt1 = (Button) findViewById(R.id.btn1);bt7 = (Button) findViewById(R.id.btn7);
        bt2 = (Button) findViewById(R.id.btn2);bt8 = (Button) findViewById(R.id.btn8);
        bt3 = (Button) findViewById(R.id.btn3);bt9 = (Button) findViewById(R.id.btn9);
        bt4 = (Button) findViewById(R.id.btn4);bt00 = (Button) findViewById(R.id.btn00);
        bt5 = (Button) findViewById(R.id.btn5);btPlus = (Button) findViewById(R.id.btnP);
        btMinus = (Button) findViewById(R.id.btnMI);btDivide = (Button) findViewById(R.id.btnD);
        btMultiply = (Button) findViewById(R.id.btnM);btResult = (Button) findViewById(R.id.btnR);
        btDot =(Button) findViewById(R.id.btnDot);result = (TextView) findViewById(R.id.txt);
        clc = (Button)findViewById(R.id.btnC);

        clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                first=0;second=0;

            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        bt00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"00");
            }
        });
        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });
        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=Double.parseDouble(result.getText().toString());
                result.setText("");
                operation=1;

            }
        });
        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=Double.parseDouble(result.getText().toString());
                result.setText("");
                operation=2;

            }
        });
        btMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=Double.parseDouble(result.getText().toString());
                result.setText("");
                operation=3;

            }
        });
        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first=Double.parseDouble(result.getText().toString());
                result.setText("");
                operation=4;

            }
        });
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second=Double.parseDouble(result.getText().toString());
                if(operation==1){
                    second= Double.parseDouble(result.getText().toString());
                    double fin = first+second;
                    result.setText(Double.toString(fin));



                }
                else if(operation==2){
                    second= Double.parseDouble(result.getText().toString());
                    double fin = first-second;
                    result.setText(Double.toString(fin));

                }
                else if(operation==3){
                    second= Double.parseDouble(result.getText().toString());
                    double fin = first*second;
                    result.setText(Double.toString(fin));

                }
                else if(operation==4){
                    second= Double.parseDouble(result.getText().toString());
                    double fin = first/second;
                    result.setText(Double.toString(fin));

                }

            }
        });

    }
}
