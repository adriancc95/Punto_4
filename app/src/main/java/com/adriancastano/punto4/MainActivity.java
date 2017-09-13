package com.adriancastano.punto4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int cifra1, cifra2, escala, tolerancia, resultado;
    private String sCifra1, sCifra2;
    private TextView tResultado;
    private Button bColor1,bColor2, bColor3, bColor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bColor1 = (Button) findViewById(R.id.bColor1);
        bColor2 = (Button) findViewById(R.id.bColor2);
        bColor3 = (Button) findViewById(R.id.bColor3);
        bColor4 = (Button) findViewById(R.id.bColor4);
        tResultado = (TextView) findViewById(R.id.tResultado);
    }

    public void negro1(View view) {
        cifra1 = 0;
        bColor1.setBackgroundColor(getResources().getColor(R.color.black));
    }
    public void marron1(View view) {
        cifra1 = 1;
        bColor1.setBackgroundColor(getResources().getColor(R.color.maroon));
    }
    public void rojo1(View view) {
        cifra1 = 2;
        bColor1.setBackgroundColor(getResources().getColor(R.color.red));
    }
    public void naranja1(View view) {
        cifra1 = 3;
        bColor1.setBackgroundColor(getResources().getColor(R.color.orange));
    }
    public void amarillo1(View view) {
        cifra1 = 4;
        bColor1.setBackgroundColor(getResources().getColor(R.color.yellow));
    }
    public void verde1(View view) {
        cifra1 = 5;
        bColor1.setBackgroundColor(getResources().getColor(R.color.green));
    }
    public void azul1(View view) {
        cifra1 = 6;
        bColor1.setBackgroundColor(getResources().getColor(R.color.blue));
    }
    public void purpura1(View view) {
        cifra1 = 7;
        bColor1.setBackgroundColor(getResources().getColor(R.color.purple));
    }
    public void gris1(View view) {
        cifra1 = 8;
        bColor1.setBackgroundColor(getResources().getColor(R.color.gray));
    }
    public void blanco1(View view) {
        cifra1 = 9;
        bColor1.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void negro2(View view) {
        cifra2 = 0;
        bColor2.setBackgroundColor(getResources().getColor(R.color.black));
    }
    public void marron2(View view) {
        cifra2 = 1;
        bColor2.setBackgroundColor(getResources().getColor(R.color.maroon));
    }
    public void rojo2(View view) {
        cifra2 = 2;
        bColor2.setBackgroundColor(getResources().getColor(R.color.red));
    }
    public void naranja2(View view) {
        cifra2 = 3;
        bColor2.setBackgroundColor(getResources().getColor(R.color.orange));
    }
    public void amarillo2(View view) {
        cifra2 = 4;
        bColor2.setBackgroundColor(getResources().getColor(R.color.yellow));
    }
    public void verde2(View view) {
        cifra2 = 5;
        bColor2.setBackgroundColor(getResources().getColor(R.color.green));
    }
    public void azul2(View view) {
        cifra2 = 6;
        bColor2.setBackgroundColor(getResources().getColor(R.color.blue));
    }
    public void purpura2(View view) {
        cifra2 = 7;
        bColor2.setBackgroundColor(getResources().getColor(R.color.purple));
    }
    public void gris2(View view) {
        cifra2 = 8;
        bColor1.setBackgroundColor(getResources().getColor(R.color.gray));
    }
    public void blanco2(View view) {
        cifra2 = 9;
        bColor2.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void negro3(View view) {
        escala = 0;
        bColor3.setBackgroundColor(getResources().getColor(R.color.black));
    }
    public void marron3(View view) {
        escala = 1;
        bColor3.setBackgroundColor(getResources().getColor(R.color.maroon));
    }
    public void rojo3(View view) {
        escala = 2;
        bColor3.setBackgroundColor(getResources().getColor(R.color.red));
    }
    public void naranja3(View view) {
        escala = 3;
        bColor3.setBackgroundColor(getResources().getColor(R.color.orange));
    }
    public void amarillo3(View view) {
        escala = 4;
        bColor3.setBackgroundColor(getResources().getColor(R.color.yellow));
    }
    public void verde3(View view) {
        escala = 5;
        bColor3.setBackgroundColor(getResources().getColor(R.color.green));
    }
    public void azul3(View view) {
        escala = 6;
        bColor3.setBackgroundColor(getResources().getColor(R.color.blue));
    }
    public void purpura3(View view) {
        escala = 7;
        bColor3.setBackgroundColor(getResources().getColor(R.color.purple));
    }
    public void gris3(View view) {
        escala = 8;
        bColor3.setBackgroundColor(getResources().getColor(R.color.gray));
    }
    public void blanco3(View view) {
        escala = 9;
        bColor3.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void marron4(View view) {
        tolerancia = 1;
        bColor4.setBackgroundColor(getResources().getColor(R.color.maroon));
    }
    public void rojo4(View view) {
        tolerancia = 2;
        bColor4.setBackgroundColor(getResources().getColor(R.color.red));
    }
    public void dorado(View view) {
        tolerancia = 5;
        bColor4.setBackgroundColor(getResources().getColor(R.color.gold));
    }
    public void plateado(View view) {
        tolerancia = 10;
        bColor4.setBackgroundColor(getResources().getColor(R.color.silver));
    }

    public void calcular(View view) {
        sCifra1 = String.valueOf(cifra1);
        sCifra2 = String.valueOf(cifra2);
        resultado = Integer.parseInt(sCifra1 + sCifra2);
        resultado = (int) (resultado * Math.pow(10, escala));
        tResultado.setText("Valor: " + resultado + "Ω ±" + tolerancia + "%");
    }

    public void limpiar(View view) {
        bColor1.setBackgroundColor(0);
        bColor2.setBackgroundColor(0);
        bColor3.setBackgroundColor(0);
        bColor4.setBackgroundColor(0);
        resultado = 0;
        tResultado.setText("");
    }
}
