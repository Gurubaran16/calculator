package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button div;
    private Button mul;
    private Button com;
    private Button dot;
    private Button clear;
    private Button equal;
    private TextView work;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUAL='0';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "2");
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + "0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + ".");
            }
        });

        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                work.setText(work.getText().toString() + ",");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1)+"+");
                work.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=SUBTRACTION;
                result.setText(String.valueOf(val1)+"-");
                work.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(val1)+"*");
                work.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=DIVISION;
                result.setText(String.valueOf(val1)+"/");
                work.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=EQUAL;
                result.setText(result.getText().toString()+String.valueOf(val2)+"="+String.valueOf(val1));
                work.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (work.getText().length()>0){
                   CharSequence name=work.getText().toString();
                   work.setText(name.subSequence(0,name.length()-1));
               }
               else{
                   val1=Double.NaN;
                   val2=Double.NaN;
                   work.setText(null);
                   result.setText(null);
               }
            }
        });
    }



    private void setupUIViews(){
        one=(Button) findViewById(R.id.btn1);
        two=(Button) findViewById(R.id.btn2);
       three =(Button) findViewById(R.id.btn3);
        four=(Button) findViewById(R.id.btn4);
        five=(Button) findViewById(R.id.btn5);
        six=(Button) findViewById(R.id.btn6);
        seven=(Button) findViewById(R.id.btn7);
        eight=(Button) findViewById(R.id.btn8);
        nine=(Button) findViewById(R.id.btn9);
        zero=(Button) findViewById(R.id.btn0);
        add=(Button) findViewById(R.id.btnplus);
       sub=(Button) findViewById(R.id.btnmin);
        div=(Button) findViewById(R.id.btndiv);
        mul=(Button) findViewById(R.id.btnmul);
        dot=(Button) findViewById(R.id.btndot);
        com=(Button) findViewById(R.id.btncom);
        clear=(Button) findViewById(R.id.btnclear);
        equal=(Button) findViewById(R.id.btnequal);
        work=(TextView) findViewById(R.id.tvwork);
        work.canScrollVertically(8);
        result=(TextView)findViewById(R.id.tvresult);
        result.setHorizontallyScrolling(true);
    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(work.getText().toString());

            switch (ACTION){
                case ADDITION:
                    val1=val1+val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case SUBTRACTION:
                    val1=val1-val2;
                    break;
                case DIVISION:
                    val1=val1/val2;
                    break;
                case EQUAL:
                    break;

            }
        }
        else {
            val1=Double.parseDouble(work.getText().toString());
        }
    }
}