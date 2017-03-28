package com.example.usuario.myfirstcalculate;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class cientifica extends AppCompatActivity {


    TextView txtDisplay;
    String operacion;
    double number1;
    double number2;
    double resultado;
    boolean decimal = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cientifica);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtDisplay = (TextView) findViewById(R.id.txtDisplay);

        Button btnNum01 = (Button)findViewById(R.id.btnNum01);
        Button btnNum02 = (Button)findViewById(R.id.btnNum02);
        Button btnNum03 = (Button)findViewById(R.id.btnNum03);
        Button btnNum04 = (Button)findViewById(R.id.btnNum04);
        Button btnNum05 = (Button)findViewById(R.id.btnNum05);
        Button btnNum06 = (Button)findViewById(R.id.btnNum06);
        Button btnNum07 = (Button)findViewById(R.id.btnNum07);
        Button btnNum08 = (Button)findViewById(R.id.btnNum08);
        Button btnNum09 = (Button)findViewById(R.id.btnNum09);
        Button btnNum00 = (Button)findViewById(R.id.btnNum00);
        Button btnPunto = (Button)findViewById(R.id.btnPunto);
        Button btnSum = (Button)findViewById(R.id.btnSum);
        Button btnEquals = (Button)findViewById(R.id.btnEquals);
        Button btnRes = (Button)findViewById(R.id.btnRes);
        Button btnMult = (Button)findViewById(R.id.btnMult);
        Button btnClean = (Button)findViewById(R.id.btnClean);
        Button btnDiv = (Button)findViewById(R.id.btnDiv);
        Button btnSin = (Button)findViewById(R.id.btnSin);
        Button btnCos = (Button)findViewById(R.id.btnCos);
        Button btnTan = (Button)findViewById(R.id.btnTan);
        Button btnLimp = (Button)findViewById(R.id.btnLimp);
        Button btnAsin = (Button)findViewById(R.id.btnAsin);
        Button btnAcos = (Button)findViewById(R.id.btnAcos);
        Button btnAtan = (Button)findViewById(R.id.btnAtan);
        Button btnRaiz = (Button)findViewById(R.id.btnRaiz);
        Button btnLog = (Button)findViewById(R.id.btnLog);
        Button btnPi = (Button)findViewById(R.id.btnPi);
        Button btnPot = (Button)findViewById(R.id.btnPot);
        Button btnFact = (Button)findViewById(R.id.btnFact);
        Button btnPorcent = (Button)findViewById(R.id.btnPorcent);

        btnEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){

                number2 = Double.parseDouble(txtDisplay.getText().toString());
                if (operacion.equals("+")){
                    resultado = number1 + number2;
                    txtDisplay.setText(resultado + "");
                }if (operacion.equals("-")){
                    resultado = number1 - number2;
                    txtDisplay.setText(resultado + "");
                }if (operacion.equals("*")){
                    resultado = number1 * number2;
                    txtDisplay.setText(resultado + "");
                }if (operacion.equals("/")){
                    resultado = number1 / number2;
                    txtDisplay.setText(resultado + "");
                }if (operacion.equals("^")){
                    resultado = Math.pow(number1,number2);
                    txtDisplay.setText("" + resultado);

                }if (operacion.equals("%")){
                    resultado= number1*(number2/100);
                    txtDisplay.setText(resultado + "");
                }
            }

        });

        btnLimp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText().toString().substring(0, txtDisplay.getText().length()-1));
            }
        });

        btnPorcent.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                operacion = "%";
                txtDisplay.setText("");
            }
        });

        btnFact.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                double aux = 1 , i=1;
                while (i <= number1){
                    aux = aux * i;
                    i=i+1;
                    txtDisplay.setText(""+aux);
                }
            }

        });

        btnPot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                operacion = "^";
                txtDisplay.setText("");

            }
        });

        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = Math.PI;
                txtDisplay.setText("" + resultado);
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                resultado = Math.log(number1);
                txtDisplay.setText("" + resultado);
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                resultado = Math.sqrt(number1);
                txtDisplay.setText("" + resultado);
            }
        });

        btnAtan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                resultado = Math.atan(number1);
                txtDisplay.setText("" + resultado);
            }
        });

        btnAcos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                resultado = Math.acos(number1);
                txtDisplay.setText("" + resultado);
            }
        });

        btnAsin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //double aux;
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                //aux = Math.sin(number1);
                resultado = Math.asin(number1);
                txtDisplay.setText("" + resultado);
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                resultado = Math.tan(number1);
                txtDisplay.setText(""+resultado);
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                resultado = Math.cos(number1);
                txtDisplay.setText("" + resultado);
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                resultado = Math.sin(number1);
                txtDisplay.setText("" + resultado);
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = 0;
                txtDisplay.setText("");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                operacion = "/";
                txtDisplay.setText("");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                operacion = "*";
                txtDisplay.setText("");
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                operacion = "-";
                txtDisplay.setText("");
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDisplay.getText().toString());
                operacion="+";
                txtDisplay.setText("");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    if (decimal == false) {
                        txtDisplay.setText(txtDisplay.getText() + ".");
                        decimal = true;
                    } else {
                        return;
                    }
            }
        });
        btnNum01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"1");
            }
        });
        btnNum02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"2");
            }
        });
        btnNum03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"3");
            }
        });
        btnNum04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"4");
            }
        });
        btnNum05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"5");
            }
        });
        btnNum06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"6");
            }
        });
        btnNum07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"7");
            }
        });
        btnNum08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"8");
            }
        });
        btnNum09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"9");
            }
        });
        btnNum00.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDisplay.setText(txtDisplay.getText() +"0");
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
