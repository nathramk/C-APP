package com.example.usuario.myfirstcalculate;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class estandar extends AppCompatActivity {

    TextView txtDist;
    double numero1;
    double numero2;
    String operacion;
    double result;
    boolean decimal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estandar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtDist = (TextView) findViewById(R.id.txtDist);

        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);
        Button btn6 = (Button)findViewById(R.id.btn6);
        Button btn7 = (Button)findViewById(R.id.btn7);
        Button btn8 = (Button)findViewById(R.id.btn8);
        Button btn9 = (Button)findViewById(R.id.btn9);
        Button btn0 = (Button)findViewById(R.id.btn0);
        Button btnP = (Button)findViewById(R.id.btnP);
        Button btnS = (Button)findViewById(R.id.btnS);
        Button btnR = (Button)findViewById(R.id.btnR);
        Button btnM = (Button)findViewById(R.id.btnM);
        Button btnD = (Button)findViewById(R.id.btnD);
        Button btnIgual = (Button)findViewById(R.id.btnIgual);
        Button btnC = (Button)findViewById(R.id.btnC);


        btnIgual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero2 = Double.parseDouble(txtDist.getText().toString());
                if (operacion.equals("+")){
                    result = numero1 + numero2;
                    txtDist.setText(result + "");
                }if (operacion.equals("-")){
                    result = numero1 - numero2;
                    txtDist.setText(result + "");
                }if (operacion.equals("*")){
                    result = numero1 * numero2;
                    txtDist.setText(result + "");
                }if (operacion.equals("/")){
                    result = numero1 / numero2;
                    txtDist.setText(result + "");
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero1 = 0;
                txtDist.setText("");
            }
        });
        btnR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero1 = Double.parseDouble(txtDist.getText().toString());
                operacion="-";
                txtDist.setText("");
            }
        });
        btnM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero1 = Double.parseDouble(txtDist.getText().toString());
                operacion="*";
                txtDist.setText("");
            }
        });
        btnD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero1 = Double.parseDouble(txtDist.getText().toString());
                operacion="/";
                txtDist.setText("");
            }
        });
        btnS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numero1 = Double.parseDouble(txtDist.getText().toString());
                operacion="+";
                txtDist.setText("");
            }
        });
        btnP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (decimal == false) {
                    txtDist.setText(txtDist.getText() + ".");
                    decimal = true;
                } else {
                    return;
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText()+"0");
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
