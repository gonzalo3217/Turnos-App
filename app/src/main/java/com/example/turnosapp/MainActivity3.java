package com.example.turnosapp;



import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private EditText et3;

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        et1 = (EditText)findViewById(R.id.txt_matematicas);
        et2 = (EditText)findViewById(R.id.txt_fisica);
        et3 = (EditText)findViewById(R.id.txt_quimica);
        tv1 = (TextView)findViewById(R.id.tv_estatus);
    }

    public void TurnosF2018(View view){
        String Matematicas_String = et1.getText().toString();
        String Fisica_String = et2.getText().toString();
        String Quimica_String = et3.getText().toString();

        int mes = Integer.parseInt(Matematicas_String);
        int numero = Integer.parseInt(Fisica_String);
        int zona = Integer.parseInt(Quimica_String);


        if (mes == 2 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 1) {
            tv1.setText("Fiscalia Flagrancia 1" );
        } else if (mes == 2 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 2 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 2 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 2 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 2 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 2 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 2 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 2 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 2 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 2 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 2 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 2 && (numero == 26 || numero == 27 || numero == 28) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 2 && (numero == 26 || numero == 27 || numero == 28) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 2 && (numero == 26 || numero == 27 || numero == 28) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 2 && (numero == 26 || numero == 27 || numero == 28) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 3 && (numero == 1 || numero == 2 || numero == 3 || numero == 4) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 3 && (numero == 1 || numero == 2 || numero == 3 || numero == 4) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 3 && (numero == 1 || numero == 2 || numero == 3 || numero == 4) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 3 && (numero == 1 || numero == 2 || numero == 3 || numero == 4) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 3 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 3 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 3 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 3 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 3 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 3 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 3 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 3 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 3 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 3 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 3 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 3 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 3 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 3 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 3 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 3 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 4 && (numero == 1) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 4 && (numero == 1) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 4 && (numero == 1) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 4 && (numero == 1) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 4 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 4 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 4 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 4 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 4 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 4 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 4 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 4 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 4 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 4 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 4 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 4 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 4 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 4 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 4 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 4 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 4 && (numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 4 && (numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 4 && (numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 4 && (numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6) && zona == 1) {
            tv1.setText("Fiscalia Flagrancia 1" );
        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 5 && (numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 5 && (numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 5 && (numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 5 && (numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 5 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 5 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 5 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 5 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 5 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 5 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 5 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 5 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 5 && (numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 5 && (numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 5 && (numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 5 && (numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 6 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 6 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 6 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 6 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 6 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 6 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 6 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 6 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 6 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 6 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 6 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 6 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 6 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 6 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 6 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 6 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");

        } else if (mes == 7 && (numero == 1) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 7 && (numero == 1) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 7 && (numero == 1) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 7 && (numero == 1) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");

        } else if (mes == 7 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 7 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 7 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 7 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 7 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 7 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 7 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 7 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 7 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 7 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 7 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 7 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 7 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 7 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 7 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 7 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");

        } else if (mes == 7 && (numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 7 && (numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 7 && (numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 7 && (numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 8 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 8 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 8 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 8 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 8 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 8 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13 * r.386 ");
        } else if (mes == 8 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 8 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 8 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 8 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7 * r.386 ");
        } else if (mes == 8 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 8 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 8 && ( numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 8 && ( numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 8 && ( numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 8 && ( numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");

        } else if (mes == 8 && (numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 731|| numero == 8) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes ==8 && (numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 731|| numero == 8) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 8 && (numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 731|| numero == 8) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 8 && (numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 731|| numero == 8) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");



        } else if (mes == 9 && (numero == 1 || numero == 2 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 9 && (numero == 1 || numero == 2 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 9 && (numero == 1 || numero == 2 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 9 && (numero == 1 || numero == 2 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 9 && (numero == 3|| numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 9 && (numero == 3|| numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 9 && (numero == 3|| numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes ==9 && (numero == 3|| numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 9 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 9 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 9 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 9 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 9 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes ==9 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 9 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 3) {
            tv1.setText( "Fiscalia 8 * res.495 ");
        } else if (mes == 9 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");


        } else if (mes == 9 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 9 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 9 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 9 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 4) {
            tv1.setText( "Fiscalia 2  * res.495 ");

        } else if (mes == 10 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 10 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 10 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 10 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 10 && (numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 10 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 10 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 10 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");



        } else if (mes == 10 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 10 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes ==10 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 10 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 10 && (numero == 29 || numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 10 && (numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 10 && (numero == 29 || numero == 30 || numero == 31 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 10 && (numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 11 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes ==11 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 11 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes ==11 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 11 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 11 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 11 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 11 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 11 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 11 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes ==  11 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 11 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");


        } else if (mes == 11 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 11 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 11 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 3) {
            tv1.setText( "Fiscalia 7 * res 500");
        } else if (mes == 11 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 11 && (numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 11 && (numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 11 && (numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 3) {
            tv1.setText( "Fiscalia 4 * res 500");
        } else if (mes ==11 && (numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 12 && (numero == 1|| numero == 2  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 12 && (numero == 1|| numero == 2  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 12 && (numero == 1|| numero == 2  ) && zona == 3) {
            tv1.setText( "Fiscalia 4 * res 500 ");
        } else if (mes ==12 && (numero == 1|| numero == 2  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 12 && ( numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 12 && ( numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 12 && ( numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 12 && ( numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 12 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes ==12 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 12 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 12 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");


        } else if (mes == 12 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 12 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 12 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 12 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 12 && (numero == 24|| numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 12 && (numero == 24|| numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 12 && (numero == 24|| numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes ==12 && (numero == 24|| numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 12 && (numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 12 && (numero == 31 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 12 && (numero == 31 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes ==12 && (numero == 31 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else {
            tv1.setText( "El dia o la zona son incorrectos ");
        }
    }



    public void TurnosF2019(View view){
        String Matematicas_String = et1.getText().toString();
        String Fisica_String = et2.getText().toString();
        String Quimica_String = et3.getText().toString();

        int mes = Integer.parseInt(Matematicas_String);
        int numero = Integer.parseInt(Fisica_String);
        int zona = Integer.parseInt(Quimica_String);



        if (mes == 1 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 2 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 2 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 2 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 1 && (numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 1 && (numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 1 && (numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 1 && (numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 1 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 1 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 1 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 1 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 1 && ( numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 1 && ( numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 1 && ( numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 1 && ( numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27  ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 7");

        } else if (mes == 1 && ( numero == 28 || numero == 29 || numero == 30 || numero == 31  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 1 && ( numero == 28 || numero == 29 || numero == 30 || numero == 31  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 1 && ( numero == 28 || numero == 29 || numero == 30 || numero == 31  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 1 && ( numero == 28 || numero == 29 || numero == 30 || numero == 31  ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 13");


        }else if (mes == 2 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        }else if (mes == 2 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 2 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 2 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");


        } else if (mes == 2 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 2 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 2 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 2 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");

        } else if (mes == 2 && (  numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 2 && (  numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 2 &&(  numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 2 && (  numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 2 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24)  && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 2 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 2 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 2 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 7");

        } else if (mes == 2 && ( numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 2 && ( numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 2 && ( numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 2 && ( numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 3 && (numero == 1 || numero == 2 || numero == 3) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 3 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 3 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 3 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 3 && (  numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 3 && ( numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 3 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 3 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");

        } else if (mes == 3 && (  numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 3 && ( numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 3 && ( numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 3 && ( numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 3 && ( numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 3 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 3 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 3 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 3 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 3 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 3 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 3 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 4 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 4 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 4 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 4 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");

        } else if (mes == 4 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 4 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 4 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 4 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 4 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 4 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 4 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 4 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 4 && (  numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 4 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 4 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 4 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 4 && ( numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 4 && ( numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 4 && ( numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 4 && ( numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1" );

        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");

        } else if (mes == 5 && (  numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 5 && (  numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 5 && (  numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 5 && (  numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 5 && ( numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 5 && ( numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 5 && ( numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 5 && ( numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 5 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 5 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 5 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 5 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 5 && ( numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 5 &&  ( numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 5 &&  ( numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 5 &&  ( numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 6 && (numero == 1 || numero == 2 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 6 && (numero == 1 || numero == 2 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 6 && (numero == 1 || numero == 2 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 6 && (numero == 1 || numero == 2 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 6 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 6 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 6 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 6 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 6 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 6 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 6 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 6 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 6 && ( numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 6 && ( numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 6 && ( numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 6 && ( numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 6 && (  numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 6 && ( numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 6 && ( numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 6 && ( numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 3)  {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 7 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 7 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 7 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 7 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 7 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 7 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 7 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 7 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 7 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 7 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 7 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 7 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 7 && ( numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 7 && ( numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 7 && ( numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 7 && ( numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");



        } else if (mes == 8 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 8 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 8 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 8 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 8 && ( numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 8 && ( numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 )  && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 8 && ( numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 )  && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15 *res 531-19 ");
        } else if (mes == 8 && ( numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 )  && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 8 && ( numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 8 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 8 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 *res 531-19 ");
        } else if (mes == 8 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 8 && (  numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 8 && (  numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 8 && (  numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 8 && (  numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 8 && ( numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes ==8 && ( numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 8 && ( numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 8 && ( numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");



        } else if (mes == 9 && (numero == 1 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 9 && (numero == 1 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 9 && (numero == 1  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 9 && (numero == 1  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 9 && (numero == 2 || numero == 3|| numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 9 && (numero == 2 || numero == 3|| numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 9 && (numero == 2 || numero == 3|| numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes ==9 && (numero == 2 || numero == 3|| numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 9 && ( numero == 9 ||  numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 9 && (numero == 9 ||  numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 9 && (numero == 9 ||  numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 9 && (numero == 9 ||  numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 9 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes ==9 &&  (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 9 &&  (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 )&& zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 9 &&  (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");


        } else if (mes == 9 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 9 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 9 &&(numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 9 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 9 && (numero == 30 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 9 && (numero == 30 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 9 &&(numero == 30 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 9 && (numero == 30 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");


        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 10 &&(numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 10 &&(numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 10 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 10 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 10 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 10 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13)&& zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 10 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 10 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 10 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 10 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");



        } else if (mes == 10 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 10 && (numero ==21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes ==10 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 10 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 10 && (numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 10 && ( numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 10 && ( numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 10 && ( numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 11 && (numero == 1|| numero == 2 || numero == 3   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes ==11 && (numero == 1|| numero == 2 || numero == 3 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 11 && (numero == 1|| numero == 2 || numero == 3  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes ==11 && (numero == 1|| numero == 2 || numero == 3  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 11 && (  numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 11 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 11 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 11 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 11 && ( numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 11 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes ==  11 && (numero ==11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 11 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");


        } else if (mes == 11 && ( numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 11 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 11 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 11 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 11 && (  numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 11 && ( numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 11 && ( numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes ==11 && ( numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 12 && (numero == 1 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 12 && (numero == 1 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 12 && (numero == 1 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes ==12 && (numero == 1  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 12 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 12 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 12 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 12 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 12 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes ==12 && ( numero ==  9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 12 && ( numero ==  9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 12 && ( numero ==  9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");


        } else if (mes == 12 && ( numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 12 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 12 && (numero ==16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 12 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 12 && (numero == 23 || numero == 24|| numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 12 && (numero == 23 || numero == 24|| numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 12 && (numero == 23 || numero == 24|| numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes ==12 && (numero == 23 || numero == 24|| numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 12 && (numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 12 && (numero == 30 || numero == 31 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 12 && (numero == 30 || numero == 31 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes ==12 && (numero == 30 || numero == 31 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else {
            tv1.setText( "El dia o la zona son incorrectos ");
        }
    }


    public void TurnosF2020(View view){
        String Matematicas_String = et1.getText().toString();
        String Fisica_String = et2.getText().toString();
        String Quimica_String = et3.getText().toString();

        int mes = Integer.parseInt(Matematicas_String);
        int numero = Integer.parseInt(Fisica_String);
        int zona = Integer.parseInt(Quimica_String);

        if (mes == 1 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 1 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 1 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 1 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 1 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 1) {
            tv1.setText("Fiscalia Flagrancia 10" );
        } else if (mes == 1 && ( numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 1 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 1 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 1 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 1 && ( numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 1 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 1 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 1 && ( numero == 20 ||  numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 1 && ( numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 1 && ( numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 1 && ( numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26  ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 8");

        } else if (mes == 1 && (  numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 1 && ( numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 1 && (numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 1 && (numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31  ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 14");



        } else if (mes == 2 && (  numero == 1 ||  numero == 2   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 2 && (  numero == 1 ||  numero == 2   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 2 && ( numero == 1 ||  numero == 2   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 2 && ( numero == 1 ||  numero == 2   ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 14");


        } else    if (mes == 2 && ( numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 1) {
            tv1.setText("Fiscalia Flagrancia 3");
        } else if (mes == 2 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 2 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 2 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 2" );

        } else if (mes == 2 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 2 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 2 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 2 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 2 && ( numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 2 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 2 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 2 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 2 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 2 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 2 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 2 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 3 && (numero == 1 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 3 && (numero == 1 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 3 && (numero == 1 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 3 && (numero == 1 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 3 && ( numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 3 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 3 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 3 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 3 && ( numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 3 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 3 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 3 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 3 && ( numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 3 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 3 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 3 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 3 && ( numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 || numero == 28 || numero == 29 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 3 && (numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 3 && (numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 3 && (numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 || numero == 28 || numero == 29) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");


        } else if (mes == 3 && ( numero == 30 || numero == 31  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 3 && ( numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 3 && ( numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 3 && ( numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 4 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 4 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 4 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 4 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 4 && ( numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 4 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 4 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 4 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 4 && ( numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 4 && (numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 || numero == 18 || numero == 19) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 4 && (numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 || numero == 18 || numero == 19) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 4 && (numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 || numero == 18 || numero == 19) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 4 && ( numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 4 && (numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 || numero == 25 || numero == 26) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 4 && (numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 || numero == 25 || numero == 26) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 4 && (numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 || numero == 25 || numero == 26) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 4 && ( numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 4 && (numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 4 && (numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 4 && (numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");



        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 5 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");

        } else if (mes == 5 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 5 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 5 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 5 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 5 && ( numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 5 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 5 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 5 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 5 && ( numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 5 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 5 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 5 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 5 && ( numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 5 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 5 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 5 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");



        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 6 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 6 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 6 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 6 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 6 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 6 && (numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 6 && (numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 6 && (numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 6 && ( numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 6 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 6 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 6 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");

        } else if (mes == 6 && ( numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 6 && ( numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 6 && ( numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 6 && ( numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 7 && ( numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 7 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 7 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 7 && (numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 7 && ( numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 7 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 7 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 7 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 7 && ( numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 7 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 7 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 7 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");

        } else if (mes == 7 && ( numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 7 && (numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 7 && (numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 7 && (numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");



        } else if (mes == 8 && (numero == 1 || numero == 2 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 8 && (numero == 1 || numero == 2 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 8 && (numero == 1 || numero == 2 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 8 && (numero == 1 || numero == 2 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 8 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 8 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 8 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 8 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 8 && (  numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 8 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 8 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 8 && (numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16   ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 8 && ( numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21 || numero == 22 || numero == 23  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 8 && ( numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21 || numero == 22 || numero == 23 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 8 && ( numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 8 && ( numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");


        } else if (mes == 8 && ( numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29 || numero == 30  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 8 && ( numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 8 && ( numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 8 && ( numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");


        } else if (mes == 8 && (numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes ==8 && (numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 8 && (numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 8 && (numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");



        } else if (mes == 9 && (numero == 1 || numero == 2 || numero == 3|| numero == 4 || numero == 5 || numero == 6 ) && zona == 1 ) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 9 && (numero == 1 || numero == 2 || numero == 3|| numero == 4 || numero == 5 || numero == 6  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 9 && (numero == 1 || numero == 2 || numero == 3|| numero == 4 || numero == 5 || numero == 6 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 9 && (numero == 1 || numero == 2  || numero == 3|| numero == 4 || numero == 5 || numero == 6) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 9 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 9 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 9 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes ==9 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 9 && (numero ==  14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 9 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 9 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 9 && (numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 9 && ( numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes ==9 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 9 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 9 && (numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");


        } else if (mes == 9 && ( numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 9 && (numero ==28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 9 && (numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 9 && (numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 10 && (numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 || numero == 10 || numero == 11 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 10 && (numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 10 && (numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 10 && (numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 10 && ( numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 10 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 10 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 10 && (numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");



        } else if (mes == 10 && ( numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 10 && (numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes ==10 && (numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 10 && (numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 || numero == 24 || numero == 25) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 10 && ( numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 10 && (numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 10 && (numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 || numero == 31 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 10 && (numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 11 && (numero == 1 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes ==11 && (numero == 1 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 11 && (numero == 1 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes ==11 && (numero == 1 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 11 && ( numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 11 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 11 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 11 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 11 && ( numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 || numero == 14 || numero == 15 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 11 && (numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 || numero == 14 || numero == 15 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes ==  11 && (numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 || numero == 14 || numero == 15 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 11 && (numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 || numero == 14 || numero == 15 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");


        } else if (mes == 11 && ( numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 11 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 11 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 11 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 11 && (numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 11 && (numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 11 && (numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes ==11 && (numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27 || numero == 28 || numero == 29 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9");

        } else if (mes == 11 && ( numero == 30 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 11 && ( numero == 30 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 11 && ( numero == 30 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes ==11 && ( numero == 30 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 12 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 12 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 12 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes ==12 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 12 && (  numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11 || numero == 12 || numero == 13  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 12 && ( numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11 || numero == 12 || numero == 13 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 12 && ( numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11 || numero == 12 || numero == 13 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 12 && ( numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3 ");

        } else if (mes == 12 && ( numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 || numero == 19 || numero == 20 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes ==12 && ( numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 12 && ( numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 12 && ( numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");


        } else if (mes == 12 && ( numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 || numero == 26|| numero == 27 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 12 && (numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 || numero == 26|| numero == 27 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 12 && (numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 || numero == 26|| numero == 27 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 12 && (numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 || numero == 26|| numero == 27) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9 ");

        } else if (mes == 12 && ( numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 12 && (numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 12 && (numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes ==12 && (numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");



        } else {
            tv1.setText( "El dia o la zona son incorrectos ");
        }
    }




















    public void TurnosF2021(View view){
        String Matematicas_String = et1.getText().toString();
        String Fisica_String = et2.getText().toString();
        String Quimica_String = et3.getText().toString();

        int mes = Integer.parseInt(Matematicas_String);
        int numero = Integer.parseInt(Fisica_String);
        int zona = Integer.parseInt(Quimica_String);

        if (mes == 1 && (numero == 1 || numero == 2 || numero == 3   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 1 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 1 && (numero == 1 || numero == 2 || numero == 3   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 1 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 1 && ( numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10  ) && zona == 1) {
            tv1.setText("Fiscalia Flagrancia 10" );
        } else if (mes == 1 && ( numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 1 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 1 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3");

        } else if (mes == 1 && (   numero == 11 || numero == 12||numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 1 && (  numero == 11 || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 1 && ( numero == 11 || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 1 && ( numero == 11 || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 1 && ( numero == 18 || numero == 19 ||  numero == 20 ||  numero == 21 || numero == 22 || numero == 23 || numero == 24   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 1 && ( numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 1 && (numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 1 && ( numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24   ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 9");

        } else if (mes == 1 && ( numero == 25 || numero == 26  || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 1 && (numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 1 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 1 && (numero == 25 || numero == 26||  numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31  ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 15");



        } else    if (mes == 2 && ( numero == 1 ||  numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7  ) && zona == 1) {
            tv1.setText("Fiscalia Flagrancia 10");
        } else if (mes == 2 && ( numero == 1 ||  numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 2 && ( numero == 1 ||  numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 2 && ( numero == 1 ||  numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 3" );

        } else if (mes == 2 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 2 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 2 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 2 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 2 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 2 && (numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 2 && (numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 2 && (numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9");

        } else if (mes == 2 && ( numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 2 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 2 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27  || numero == 28) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 2 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");



        } else if (mes == 3 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 3 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 3 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 3 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3");

        } else if (mes == 3 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 3 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 3 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 3 && (numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 3 && ( numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 3 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 3 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 3 && (numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 3 && (numero == 22 ||  numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 || numero == 28  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 3 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 || numero == 28 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 3 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 || numero == 28 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 3 && (numero == 22 || numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 || numero == 28) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");


        } else if (mes == 3 && (numero == 29  || numero == 30 || numero == 31  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 3 && (numero == 29  || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 3 && (numero == 29  || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 3 && (numero == 29  || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");


        } else if (mes == 4 && (numero == 1 || numero == 2 || numero == 3 || numero == 4  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 4 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 4 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 4 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 4 && ( numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 4 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 4 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 4 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 4 && (  numero == 12 || numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 || numero == 18  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 4 && ( numero == 12 || numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 || numero == 18 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 4 && ( numero == 12 || numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 || numero == 18 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 4 && ( numero == 12 || numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 || numero == 18 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 4 && (  numero == 19 || numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 || numero == 25  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 4 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 || numero == 25) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 4 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 || numero == 25) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 4 && (numero == 19 || numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 || numero == 25) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 4 && ( numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 4 && (numero == 26 ||numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 4 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 4 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");



        } else if (mes == 5 && (numero == 1 || numero == 2  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 5 && (numero == 1 || numero == 2  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 5 && (numero == 1 || numero == 2  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 5 && (numero == 1 || numero == 2  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 5 && ( numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 5 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 5 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 5 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 5 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 5 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 5 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 5 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 5 && ( numero == 17|| numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 5 && (numero == 17|| numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 5 && (numero == 17|| numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 5 && (numero == 17|| numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 5 && ( numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 5 && (numero == 24 ||numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 5 && (numero == 24 ||numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 5 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 5 && (  numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 5 && ( numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6 ");
        } else if (mes == 5 && ( numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 5 && ( numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");




        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 6 && ( numero == 7 ||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 6 && (numero == 7 ||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 6 && (numero == 7 ||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 6 && (numero == 7 ||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 6 && (  numero == 14||numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 6 && (numero == 14||numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 6 && (numero == 14||numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 6 && (numero == 14||numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 6 && ( numero == 21 ||numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 6 && (numero == 21 ||numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 6 && (numero == 21 ||numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 6 && (numero == 21 ||numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 6 && (numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 6 && ( numero == 28 ||numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 6 && (numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 6 && (numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 7 && (  numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 7 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 7 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 7 && (numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 7 && (  numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 7 && (numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 7 && (numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 7 && (numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 7 && (numero == 19||numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 7 && (numero == 19||numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 7 && (numero == 19||numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 7 && (numero == 19||numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");

        } else if (mes == 7 && ( numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 7 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 7 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 7 && (numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");



        } else if (mes == 8 && (numero == 1  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 8 && (numero == 1  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 8 && (numero == 1  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 8 && (numero == 1 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 8 && ( numero == 2||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 8 && (numero == 2||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 8 && (numero == 2||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 8 && (numero == 2||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 8 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 8 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 8 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 8 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15    ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 8 && ( numero == 16 ||numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21 || numero == 22   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 8 && ( numero == 16 ||numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21 || numero == 22  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 8 && ( numero == 16 ||numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21 || numero == 22 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 8 && ( numero == 16 ||numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21 || numero == 22 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");


        } else if (mes == 8 && (numero == 23 || numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 8 && ( numero == 23 || numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 8 && ( numero == 23 || numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 8 && ( numero == 23 || numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");


        } else if (mes == 8 && ( numero == 30||numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes ==8 && (numero == 30||numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 8 && (numero == 30||numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 8 && (numero == 30||numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");



        } else if (mes == 9 && (numero == 1 || numero == 2 || numero == 3|| numero == 4 || numero == 5 ) && zona == 1 ) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 9 && (numero == 1 || numero == 2 || numero == 3|| numero == 4 || numero == 5  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 9 && (numero == 1 || numero == 2 || numero == 3|| numero == 4 || numero == 5  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 9 && (numero == 1 || numero == 2  || numero == 3|| numero == 4 || numero == 5 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 9 && ( numero == 6  ||numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 9 && (  numero == 6  ||numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 9 && (  numero == 6  ||numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes ==9 && (  numero == 6  ||numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 9 && ( numero == 13 || numero ==  14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 9 && (numero == 13 || numero ==  14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 9 && (numero == 13 || numero ==  14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 9 && (numero == 13 || numero ==  14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");

        } else if (mes == 9 && ( numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes ==9 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 9 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 9 && (numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");


        } else if (mes == 9 && (numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 9 && (numero ==28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 9 && (numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 9 && (numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");



        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 10 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 10 && ( numero == 4 || numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 || numero == 10  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 10 && (numero == 4 || numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 || numero == 10) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 10 && (numero == 4 || numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 || numero == 10) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 10 && (numero == 4 || numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 || numero == 10) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 10 && (  numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 10 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 10 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 10 && (numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");



        } else if (mes == 10 && ( numero == 18 || numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 || numero == 24  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 10 && (numero == 18 || numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 || numero == 24) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes ==10 && (numero == 18 || numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 || numero == 24) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 10 && (numero == 18 || numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 || numero == 24) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 10 && ( numero == 25 || numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 10 && (numero == 25 || numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 10 &&  (numero == 25 ||numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 || numero == 31 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9 ");
        } else if (mes == 10 && (numero == 25 || numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 11 && (numero == 1 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes ==11 && (numero == 1 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 11 && (numero == 1 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15 ");
        } else if (mes ==11 && (numero == 1 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 11 && ( numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 11 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 11 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 11 && (numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 11 && (numero == 8 || numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 || numero == 14  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 11 && (numero == 8 || numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 || numero == 14 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes ==  11 && (numero == 8 || numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 || numero == 14) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3 ");
        } else if (mes == 11 && (numero == 8 || numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 || numero == 14 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");


        } else if (mes == 11 && ( numero == 15|| numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 11 && (numero == 15|| numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 11 && (numero == 15|| numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 11 && (numero == 15|| numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");

        } else if (mes == 11 && ( numero == 22||numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27 || numero == 28   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 11 && (numero == 22||numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27 || numero == 28  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 11 && (numero == 22||numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27 || numero == 28  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes ==11 && (numero == 22||numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27 || numero == 28  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12");

        } else if (mes == 11 && (numero == 29 || numero == 30 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 11 && (numero == 29 || numero == 30 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 11 && (numero == 29 || numero == 30 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes ==11 && (numero == 29 || numero == 30 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 12 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 12 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 || numero == 5   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 12 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 || numero == 5   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes ==12 && (numero == 1|| numero == 2 || numero == 3 || numero == 4 || numero == 5   ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 12 && (numero == 6  ||  numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11 || numero == 12   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 12 && ( numero == 6  ||  numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11 || numero == 12 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 12 && ( numero == 6  ||  numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11 || numero == 12 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 12 && ( numero == 6  ||  numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11 || numero == 12) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10 ");

        } else if (mes == 12 && (numero == 13 || numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 || numero == 19 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes ==12 && ( numero == 13 || numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 || numero == 19 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 12 && ( numero == 13 || numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 || numero == 19 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 12 && ( numero == 13 || numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 || numero == 19 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");


        } else if (mes == 12 && (numero == 20  || numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 || numero == 26) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 12 && (numero == 20  || numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 || numero == 26) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 12 && (numero == 20  || numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 || numero == 26 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 12 && (numero == 20  || numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 || numero == 26) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 12 ");

        } else if (mes == 12 && ( numero == 27  ||numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 12 && ( numero == 27  || numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 12 && (numero == 27  ||  numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes ==12 && (numero == 27  || numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");



        } else {
            tv1.setText( "El dia o la zona son incorrectos ");
        }
    }



    public void TurnosF2022(View view){
        String Matematicas_String = et1.getText().toString();
        String Fisica_String = et2.getText().toString();
        String Quimica_String = et3.getText().toString();

        int mes = Integer.parseInt(Matematicas_String);
        int numero = Integer.parseInt(Fisica_String);
        int zona = Integer.parseInt(Quimica_String);

        if (mes == 1 && (numero == 1 || numero == 2    ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 1 && (numero == 1 || numero == 2  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 1 && (numero == 1 || numero == 2    ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 1 && (numero == 1 || numero == 2   ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 16");

        } else if (mes == 1 && (  numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9  ) && zona == 1) {
            tv1.setText("Fiscalia Flagrancia 1" );
        } else if (mes == 1 && ( numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 1 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 1 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9   ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 10");

        } else if (mes == 1 && ( numero == 10  ||  numero == 11 || numero == 12||numero == 13 || numero == 14 || numero == 15 || numero == 16  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 1 && (   numero == 10  || numero == 11 || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 1 && (  numero == 10  || numero == 11 || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 1 && ( numero == 10  ||  numero == 11 || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 1 && ( numero == 17 || numero == 18 || numero == 19 ||  numero == 20 ||  numero == 21 || numero == 22 || numero == 23   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 1 && ( numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 1 && (numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 1 && (numero == 17 ||  numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 || numero == 23   ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 12");

        } else if (mes == 1 && ( numero == 24 || numero == 25 || numero == 26  || numero == 27 || numero == 28 || numero == 29 || numero == 30  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 1 && (numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28 || numero == 29 || numero == 30   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 1 && (numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30    ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 1 && (numero == 24 || numero == 25 || numero == 26||  numero == 27 || numero == 28 || numero == 29 || numero == 30   ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 16");

        } else if (mes == 1 && (  numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 1 && ( numero == 31   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 1 && ( numero == 31   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 1 && ( numero == 31  ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 10");



        } else    if (mes == 2 && ( numero == 1 ||  numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6   ) && zona == 1) {
            tv1.setText("Fiscalia Flagrancia 1");
        } else if (mes == 2 && ( numero == 1 ||  numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 2 && ( numero == 1 ||  numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 2 && ( numero == 1 ||  numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 4) {
            tv1.setText("Fiscalia Flagrancia 10" );

        } else if (mes == 2 && ( numero == 7|| numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 2 && (numero == 7||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 2 && (numero == 7||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 2 && (numero == 7|| numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 2 && ( numero == 14 ||numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 2 && ( numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 2 && ( numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 2 && ( numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 || numero == 21 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9");

        } else if (mes == 2 && ( numero == 21 ||  numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 2 && (numero == 21 ||  numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 2 && (numero == 21 ||  numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 2 && (numero == 21 ||   numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 || numero == 27  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 2 && ( numero == 28) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 2 && ( numero == 28) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 2 && ( numero == 28) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 2 && ( numero == 28 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3");



        } else if (mes == 3 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 3 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 3 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 3 && ( numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3");

        } else if (mes == 3 && (  numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 3 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 3 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 3 && ( numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 3 && (  numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 3 && ( numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 3 && ( numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 3 && ( numero == 14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20   ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9");

        } else if (mes == 3 && (  numero == 21||numero == 22 ||  numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 3 && (numero == 21|| numero == 22 || numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 3 && (numero == 21|| numero == 22 || numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 3 && ( numero == 21|| numero == 22 || numero == 23 || numero == 24 || numero == 25 ||numero == 26 || numero == 27 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");


        } else if (mes == 3 && ( numero == 28 || numero == 29  || numero == 30 || numero == 31  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 3 && (numero == 29  || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 3 && (numero == 29  || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 3 && (numero == 29  || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3");


        } else if (mes == 4 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 4 && ( numero == 1 || numero == 2 || numero == 3 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 4 && ( numero == 1 || numero == 2 || numero == 3  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 4 && ( numero == 1 || numero == 2 || numero == 3  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3");

        } else if (mes == 4 && (  numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 4 && ( numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 4 && ( numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 4 && ( numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 6");

        } else if (mes == 4 && (  numero == 11 ||numero == 12 || numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 4 && ( numero == 11 ||  numero == 12 || numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7 ");
        } else if (mes == 4 && (  numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 4 && (  numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 ||  numero == 16 || numero == 17 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9");

        } else if (mes == 4 && (  numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 4 && (numero == 18 ||numero == 19 || numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 4 && (numero == 18 ||numero == 19 || numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 4 && (numero == 18 ||numero == 19 || numero == 20 || numero == 21 || numero == 22 ||  numero == 23 || numero == 24 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 4 && ( numero == 25 ||numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 4 && (numero == 25 ||numero == 26 ||numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1 ");
        } else if (mes == 4 && (numero == 25 ||numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 4 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3");



        } else if (mes == 5 && (numero == 1  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 5 && (numero == 1  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 5 && (numero == 1   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 5 && (numero == 1  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3");

        } else if (mes == 5 && ( numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 5 && (numero == 2 ||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 5 && (numero == 2 ||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 5 && (numero == 2 ||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 5 && ( numero == 9 ||numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 5 && ( numero == 9 ||numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 7 ");
        } else if (mes == 5 && ( numero == 9 ||numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 5 && (numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 9");

        } else if (mes == 5 && ( numero == 16 ||numero == 17|| numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 5 && ( numero == 16 ||numero == 17|| numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 5 && ( numero == 16 ||numero == 17|| numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 5 && ( numero == 16 ||numero == 17|| numero == 18 || numero == 19 || numero == 20 || numero == 21 || numero == 22 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 15");

        } else if (mes == 5 && (  numero == 23 ||numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 5 && (  numero == 23 ||numero == 24 ||numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 1 ");
        } else if (mes == 5 && (  numero == 23 ||numero == 24 ||numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 5 && (  numero == 23 ||numero == 24 || numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 3");

        } else if (mes == 5 && ( numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 5 && ( numero == 30 ||numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11 ");
        } else if (mes == 5 && (numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 5 && (numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");




        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 6 && (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 6 && ( numero == 6 || numero == 7 ||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 6 && (  numero == 6 || numero == 7 ||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 6 && ( numero == 6 || numero == 7 ||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 6 && ( numero == 6 ||numero == 7 ||numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 6 && (   numero == 13 || numero == 14||numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 6 && (numero == 13 || numero == 14||numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 6 && (numero == 13 || numero == 14||numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 6 && (numero == 13 || numero == 14||numero == 15 || numero == 16 || numero == 17 || numero == 18 || numero == 19 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 6 && (  numero == 20 || numero == 21 ||numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 6 && ( numero == 20 ||numero == 21 ||numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 6 && ( numero == 20 ||numero == 21 ||numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 6 && ( numero == 20 ||numero == 21 ||numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 6 && (numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 6 && (numero == 27 || numero == 28 ||numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 6 && (numero == 27 ||numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 6 && (numero == 27 ||numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");


        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 7 && (numero == 1 || numero == 2 || numero == 3  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");

        } else if (mes == 7 && (   numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 7 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 7 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 7 && (numero == 4 || numero == 5 || numero == 6 || numero == 7 || numero == 8 || numero == 9 || numero == 10   ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 7 && ( numero == 11   || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 7 && ( numero == 11   || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 7 && (numero == 11   || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 7 && (numero == 11   || numero == 12|| numero == 13 || numero == 14 || numero == 15 || numero == 16 || numero == 17  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 7 && ( numero == 18||numero == 19||numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 7 && (numero == 18||numero == 19|| numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 7 && (numero == 18||numero == 19|| numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1");
        } else if (mes == 7 && (numero == 18||numero == 19|| numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 7 && (  numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 7 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 7 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes == 7 && (numero == 25 || numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30 || numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 5");





        } else if (mes == 8 && ( numero == 1 || numero == 2 ||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 8 && ( numero == 1 || numero == 2||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 8 && (numero == 1 ||  numero == 2||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7");
        } else if (mes == 8 && ( numero == 1 || numero == 2||numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 8 && (  numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 8 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 8 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes == 8 && ( numero == 8 || numero == 9 || numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14     ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 8 && (  numero == 15  || numero == 16 ||numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 8 && ( numero == 15  || numero == 16 ||numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 8 && ( numero == 15  || numero == 16 ||numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 1 ");
        } else if (mes == 8 && (numero == 15  ||  numero == 16 ||numero == 17 || numero == 18 || numero == 19 ||  numero == 20 || numero == 21  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");


        } else if (mes == 8 && (  numero == 22 ||  numero == 23 || numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28    ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 8 && ( numero == 22 || numero == 23 || numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 8 && (numero == 22 ||  numero == 23 || numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 8 && (numero == 22 ||  numero == 23 || numero == 24 || numero == 25 || numero == 26 ||  numero == 27 || numero == 28  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");


        } else if (mes == 8 && (  numero == 29 || numero == 30||numero == 31) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes ==8 && ( numero == 29 ||  numero == 30||numero == 31) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 8 && ( numero == 29 ||  numero == 30||numero == 31) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7 ");
        } else if (mes == 8 && (numero == 29 ||  numero == 30||numero == 31) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");



        } else if (mes == 9 && (numero == 1 || numero == 2 || numero == 3|| numero == 4  ) && zona == 1 ) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 9 && (numero == 1 || numero == 2 || numero == 3|| numero == 4  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 9 && (numero == 1 || numero == 2 || numero == 3|| numero == 4   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 7 ");
        } else if (mes == 9 && (numero == 1 || numero == 2  || numero == 3|| numero == 4  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 8");

        } else if (mes == 9 && (  numero == 5  || numero == 6  ||numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 9 && (  numero == 5  ||  numero == 6  ||numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 9 && (  numero == 5  ||  numero == 6  ||numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 13");
        } else if (mes ==9 && (  numero == 5  ||  numero == 6  ||numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 14");

        } else if (mes == 9 && ( numero == 12 ||  numero == 13 || numero ==  14 || numero == 15 || numero == 16 || numero == 17 || numero == 18   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 9 && ( numero == 12 || numero == 13 || numero ==  14 || numero == 15 || numero == 16 || numero == 17 || numero == 18  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 9 && ( numero == 12 || numero == 13 || numero ==  14 || numero == 15 || numero == 16 || numero == 17 || numero == 18  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 9 && ( numero == 12 || numero == 13 || numero ==  14 || numero == 15 || numero == 16 || numero == 17 || numero == 18 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 2");

        } else if (mes == 9 && ( numero == 19  || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes ==9 && ( numero == 19  || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 9 && (numero == 19  || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 9 && (numero == 19  || numero == 20 || numero == 21 || numero == 22 || numero == 23 || numero == 24 || numero == 25 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");


        } else if (mes == 9 && (  numero == 26 || numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 9 && ( numero == 26 ||  numero == 27 || numero ==28 || numero == 29 || numero == 30) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 9 && ( numero == 26 ||  numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 9 && ( numero == 26 ||   numero == 27 || numero == 28 || numero == 29 || numero == 30) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");



        } else if (mes == 10 && (numero == 1 || numero == 2   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 10 && (numero == 1 || numero == 2   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 10 && (numero == 1 || numero == 2   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 10 && (numero == 1 || numero == 2   ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 10 && (  numero == 3 ||  numero == 4 || numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 10 && ( numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 10 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 10 && (numero == 3 || numero == 4 || numero == 5 || numero == 6 || numero == 7|| numero == 8 || numero == 9) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 10 && (  numero == 10 ||  numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 10 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 10 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 10 && ( numero == 10 || numero == 11 || numero == 12 || numero == 13 || numero == 14 || numero == 15 || numero == 16  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");



        } else if (mes == 10 && ( numero == 17  || numero == 18 || numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 10 && ( numero == 17  || numero == 18 || numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes ==10 && ( numero == 17  || numero == 18 || numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 10 && (numero == 17  ||  numero == 18 || numero == 19 || numero == 20 || numero == 21||numero == 22 || numero == 23 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 10 && (  numero == 24   || numero == 25 || numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 10 && ( numero == 24   || numero == 25 || numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 10 &&  ( numero == 24   || numero == 25 ||numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12 ");
        } else if (mes == 10 && ( numero == 24   || numero == 25 || numero == 26 || numero == 27 || numero == 28||numero == 29 || numero == 30 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");


        } else if (mes == 10 && (  numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 10 && ( numero == 31 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 10 &&  ( numero == 31  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16 ");
        } else if (mes == 10 && ( numero == 31 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");



        } else if (mes == 11 && ( numero == 1   || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 11 && ( numero == 1   || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 11 && ( numero == 1   || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes == 11 && ( numero == 1   || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 11 && (  numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 11 && (  numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes ==  11 && (  numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10 ");
        } else if (mes == 11 && (  numero == 7 || numero == 8 || numero == 9 || numero == 10 || numero == 11||numero == 12 || numero == 13  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1");


        } else if (mes == 11 && (   numero == 14 || numero == 15|| numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 11 && (  numero == 14 || numero == 15|| numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 11 && (  numero == 14 || numero == 15|| numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 11");
        } else if (mes == 11 && (  numero == 14 || numero == 15|| numero == 16 || numero == 17 || numero == 18 || numero == 19 || numero == 20 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 4");

        } else if (mes == 11 && (numero == 21 ||  numero == 22||numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 11 && ( numero == 21 || numero == 22||numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 11 && ( numero == 21 || numero == 22||numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes ==11 && ( numero == 21 || numero == 22||numero == 23 || numero == 24 || numero == 25 || numero == 26|| numero == 27   ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7");

        } else if (mes == 11 && ( numero == 28  || numero == 29 || numero == 30 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 11 && (numero == 28  || numero == 29 || numero == 30 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 11 && (numero == 28  || numero == 29 || numero == 30 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes ==11 && (numero == 28  || numero == 29 || numero == 30 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 12 && (numero == 1 || numero == 2 || numero == 3 || numero == 4  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 12 && (numero == 1|| numero == 2 || numero == 3 || numero == 4   ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 12 && (numero == 1|| numero == 2 || numero == 3 || numero == 4   ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes ==12 && (numero == 1|| numero == 2 || numero == 3 || numero == 4    ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");

        } else if (mes == 12 && (  numero == 5 ||numero == 6  ||  numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11   ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 2");
        } else if (mes == 12 && ( numero == 5 || numero == 6  ||  numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11  ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 3");
        } else if (mes == 12 && ( numero == 5 || numero == 6  ||  numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 10");
        } else if (mes == 12 && ( numero == 5 || numero == 6  ||  numero == 7 || numero == 8 || numero == 9 ||numero == 10 || numero == 11 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 1 ");

        } else if (mes == 12 && (  numero == 12  || numero == 13 || numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18  ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 4");
        } else if (mes ==12 && ( numero == 12  ||  numero == 13 || numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 5");
        } else if (mes == 12 && (numero == 12  ||  numero == 13 || numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 6");
        } else if (mes == 12 && ( numero == 12  ||   numero == 13 || numero == 14 || numero == 15 || numero == 16 ||numero == 17 || numero == 18  ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 11");


        } else if (mes == 12 && (  numero == 19  || numero == 20  || numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 8");
        } else if (mes == 12 && (numero == 19  || numero == 20  || numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 9");
        } else if (mes == 12 && (numero == 19  || numero == 20  || numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25  ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 12");
        } else if (mes == 12 && (numero == 19  || numero == 20  || numero == 21 || numero == 22 || numero == 23 ||numero == 24|| numero == 25 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 7 ");

        } else if (mes == 12 && (   numero == 26 || numero == 27  ||numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 1) {
            tv1.setText( "Fiscalia Flagrancia 14");
        } else if (mes == 12 && (  numero == 26 || numero == 27  || numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 2) {
            tv1.setText( "Fiscalia Flagrancia 15");
        } else if (mes == 12 && (  numero == 26 || numero == 27  ||  numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 3) {
            tv1.setText( "Fiscalia Flagrancia 16");
        } else if (mes ==12 && (  numero == 26 || numero == 27  || numero == 28 || numero == 29 || numero == 30 || numero == 31 ) && zona == 4) {
            tv1.setText( "Fiscalia Flagrancia 13");



        } else {
            tv1.setText( "El dia o la zona son incorrectos ");
        }
    }


    //Método para el botón Anterior
    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}