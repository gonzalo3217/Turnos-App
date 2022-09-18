package com.example.turnosapp;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        tv1 = (TextView) findViewById(R.id.tv1);
    }





    public void LasPiedras2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {


            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4||dia == 5 ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 11 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 || dia == 12  ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 11 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18  || dia == 19) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 11 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25  ||dia == 26) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 11 &&   dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Las Piedras 4°");

                break;

            case 12:
                if (dia == 1 ||dia == 2||dia == 3 ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 ||dia == 10 ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 )  {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if ( dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ||dia == 24) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30||dia == 31)
                    tv1.setText("Fiscalia Las Piedras 4°");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }



    public void LasPiedras2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if ( dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if ( dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if ( dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if ( dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 1°");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 2 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 2 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 2 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 2 &&  dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia Las Piedras 1°");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 3 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 3 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 3 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 3 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 1°");
                break;
            case 4:
                if (mes == 4 && dia == 1  ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 4 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 4 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 4 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 4 &&  dia == 30)
                    tv1.setText("Fiscalia Las Piedras 2°");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 5 &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 5 &&  dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 5 &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia ==  26 || dia == 27 ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 5 &&  dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 2°");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 6 &&  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 6 &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 6 &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 6 &&  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Las Piedras 2°");
                break;
            case 7:
                if (mes == 7 && dia == 1 ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 7 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 7 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 7 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21||dia == 22 ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 7 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 7 &&  dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 3°");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 8 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 8 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 8 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ||dia == 26) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 8 &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 3°");
                break;

            case 9:
                if (mes == 9 && dia == 1||dia == 2 ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 9 &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ||dia == 9) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 9 &&  dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 9 &&  dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 9 &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Las Piedras 3°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6||dia == 7  ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 10 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13||dia == 14  ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 10 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 10 &&  dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 10 &&  dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 4°");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 11 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 11 &&  dia == 12  || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 11 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 11 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Las Piedras 4°");

                break;

            case 12:
                if (dia == 1 ||dia == 2) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16)  {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)  {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (dia == 31 )
                    tv1.setText("Fiscalia Las Piedras 1°");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }






    public void LasPiedras2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 1°");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 2 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 2 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 2 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 2 && dia == 25 || dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia Las Piedras 1°");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 3 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 3 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 3 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 3 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 1°");
                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 4 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 4 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 4 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 4 && dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Las Piedras 2°");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 5 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 5 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 5 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 5 && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 2°");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 6 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 6 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 6 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 6 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Las Piedras 2°");
                break;
            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 7 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 7 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 7 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 3°");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 8 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 8 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 8 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 8 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 3°");
                break;

            case 9:
                if (mes == 9 && dia == 1) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 9 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 9 && dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 9 && dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 9 && dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 9 && dia == 30)
                    tv1.setText("Fiscalia Las Piedras 4°");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 10 && dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 10 && dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 10 && dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 10 && dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 4°");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 11 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 11 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 11 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (mes == 11 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Las Piedras 4°");

                break;

            case 12:
                if (dia == 1) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Las Piedras 1°");
                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }









    public void LasPiedras2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 ) {
                tv1.setText( "Fiscalia Las Piedras 4°");
            } else if (mes == 1  &&   dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia Las Piedras 1°");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21) {
                tv1.setText( "Fiscalia Las Piedras 2°");
            } else if (mes == 1  && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia Las Piedras 3°");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 2  &&   dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16    ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 2  && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 2  &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia Las Piedras 4°");
                break;

            case 3:

                if (mes == 3 && dia == 1    ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 3  && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 3  &&  dia == 9 || dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 3  &&  dia == 16 || dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 3  &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29   ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 3  &&  dia == 30 || dia == 31  );
                tv1.setText( "Fiscalia Las Piedras 1°");




                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 4 &&   dia == 6 || dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 4  &&   dia == 13 || dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 4  &&  dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 4  &&   dia == 27 || dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia Las Piedras 1°");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 5  &&    dia == 4 || dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 5  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 5  &&   dia == 18 || dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24     ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 5  &&  dia == 25 || dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia Las Piedras 1°");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 6 &&  dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 6  &&    dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28    ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 6  &&    dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia Las Piedras 2°");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 7 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 7  &&   dia == 13 || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 7  &&  dia == 20 || dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 7  &&  dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia Las Piedras 2°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 8  &&   dia == 3 || dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 8  &&    dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16    ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 8  &&   dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23    ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 8  && dia == 24  || dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 8  && dia == 31     )
                    tv1.setText("Fiscalia Las Piedras 3°");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 9  &&   dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13    ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 9 &&    dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20     ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 9  &&    dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 9  &&     dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia Las Piedras 3°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4     ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 10  &&   dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 10  && dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 10  &&    dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 10  &&   dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Las Piedras 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1    ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 11  &&  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 11  &&  dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 11  &&    dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29   ){
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 11  &&    dia == 30   )
                    tv1.setText( "Fiscalia Las Piedras 4°");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 12  &&    dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 12 &&      dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 12  &&   dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 11  &&    dia == 30  || dia == 31   )
                    tv1.setText( "Fiscalia Las Piedras 4°");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }













    public void LasPiedras2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia Las Piedras 4°");
            } else if (mes == 1  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia Las Piedras 1°");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ) {
                tv1.setText( "Fiscalia Las Piedras 2°");
            } else if (mes == 1  &&   dia == 20 || dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26  ){
                tv1.setText( "Fiscalia Las Piedras 3°");
             } else if (mes == 1  &&    dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
            tv1.setText( "Fiscalia Las Piedras 4°");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 2  &&   dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16    ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 2  && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 2  &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia Las Piedras 4°");
                break;

            case 3:
                if ( dia == 1   || dia == 2 ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if ( dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16   ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23  ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30)
                    tv1.setText( "Fiscalia Las Piedras 4°");
                 else if ( mes == 3  &&   (  dia == 31))
                 tv1.setText( "Fiscalia Las Piedras 1°");
                     break;


            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5|| dia == 6   ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 4 &&    dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13  ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 4  &&   dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20   ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 4  &&   dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 4  &&    dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia Las Piedras 1°");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  || dia == 4 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 5  &&    dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  || dia == 11 ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 5  &&   dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ||dia == 18 ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 5  &&    dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 5  &&   dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia Las Piedras 1°");



                break;
            case 6:
                if (mes == 6 && dia == 1   ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 6  &&   dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 6  &&    dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14||dia ==  15  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 6 &&   dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21|| dia == 22 ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 6  &&     dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  || dia == 29   ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "Fiscalia Las Piedras 2°");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ||dia == 6 ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 7 &&   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13    ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 7  &&    dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 7  &&   dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 7  &&   dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia Las Piedras 2°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2 || dia == 3   ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 8  &&   dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ||dia == 10   ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 8  &&    dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16  ||  dia == 17  ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 8  &&   dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 8  &&  dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30|| dia == 31)
                    tv1.setText( "Fiscalia Las Piedras 2°");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 9  &&    dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||  dia == 14   ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 9 &&     dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 9  &&      dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia Las Piedras 3°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4  || dia == 5    ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 10  &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  || dia == 12  ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 10  &&   dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 ||  dia == 26 ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Las Piedras 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1  || dia == 2 ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||  dia == 23   ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia Las Piedras 3°");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7  ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 12  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  || dia == 14    ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 12 &&    dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ||dia == 21   ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia == 28  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 12  &&   dia == 29 || dia == 30  ||  dia == 31   )
                    tv1.setText( "Fiscalia Las Piedras 4°");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }










    public void LasPiedras2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                tv1.setText( "Fiscalia Las Piedras 4°");
            } else if (mes == 1  &&    dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11   ) {
                tv1.setText( "Fiscalia Las Piedras 1°");
            } else if (mes == 1  &&   dia == 12||dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18   ) {
                tv1.setText( "Fiscalia Las Piedras 2°");
            } else if (mes == 1  &&  dia == 19 ||  dia == 20 || dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25   ){
                tv1.setText( "Fiscalia Las Piedras 3°");
            } else if (mes == 1  &&  dia == 26  || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia Las Piedras 4°");
                break;

            case 2:

                if (mes == 2 && dia == 1   ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 2  &&  dia == 2  ||dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 2  && dia == 9   || dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15     ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 2  &&  dia == 16||dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 2  && dia == 23 ||  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia Las Piedras 4°");
                break;

            case 3:
                if ( dia == 1  ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if ( dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if ( dia == 9 ||dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (dia == 16|| dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22   ) {
                    tv1.setText("Fiscalia Las Piedras 3°");
                } else if (dia == 23||dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29)
                    tv1.setText( "Fiscalia Las Piedras 4°");
                else if ( mes == 3  &&   (    dia == 30||dia == 31))
                    tv1.setText( "Fiscalia Las Piedras 1°");
                break;


            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia Las Piedras 1°");
                } else if (mes == 4 &&  dia == 6   || dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 4  &&   dia == 13  ||dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19    ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 4  &&  dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 4  &&   dia == 27 || dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia Las Piedras 1°");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 5  &&    dia == 4  || dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 5  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17   ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 5  &&    dia == 18||dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 5  && dia == 25  || dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia Las Piedras 1°");



                break;
            case 6:
                if (mes == 6 && dia == 1  || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 6 &&dia ==  15   || dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 6  && dia == 22   ||  dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28     ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 6  &&  dia == 29  || dia == 30  )
                    tv1.setText( "Fiscalia Las Piedras 2°");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 7 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 7  &&  dia == 13   || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 7  && dia == 20  ||  dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 7  && dia == 27   ||  dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia Las Piedras 2°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 8  &&dia == 3   ||   dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 8  &&  dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 8  &&  dia == 17  ||  dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 8  && dia == 24 ||  dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30|| dia == 31){
                    tv1.setText( "Fiscalia Las Piedras 2°");
                 } else if (mes == 8  &&  dia == 31)
                tv1.setText( "Fiscalia Las Piedras 3°");

                break;


            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 9  &&  dia == 7  ||  dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13  ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 9 &&    dia == 14  ||   dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 9  &&  dia == 21   ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 9  &&  dia ==  28    ||   dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia Las Piedras 3°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4   ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 10  && dia == 5   ||   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 10  &&  dia == 12    ||dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 10  &&  dia == 19 ||  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 10  &&    dia == 26   ||dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Las Piedras 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1  ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 11  &&   dia == 2 ||dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText("Fiscalia Las Piedras 4°");
                } else if (mes == 11  &&  dia == 9  || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22   ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 11  &&  dia == 23   ||dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29    ){
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 11  &&  dia == 30   )
                      tv1.setText( "Fiscalia Las Piedras 4°");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia Las Piedras 4°");
                } else if (mes == 12  &&  dia == 7   || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13    ) {
                    tv1.setText( "Fiscalia Las Piedras 1°");
                } else if (mes == 12 &&   dia == 14   || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia Las Piedras 2°");
                } else if (mes == 12  &&  dia == 21 ||   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia Las Piedras 3°");
                } else if (mes == 11  && dia == 28 ||  dia == 29 || dia == 30  ||  dia == 31   )
                    tv1.setText( "Fiscalia Las Piedras 4°");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }






    public void Maldonado2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {


            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4||dia == 5 ) {
                    tv1.setText("por carga de trabajo");
                } else if (mes == 11 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 || dia == 12  ) {
                    tv1.setText("por carga de trabajo");
                } else if (mes == 11 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18  || dia == 19) {
                    tv1.setText("por carga de trabajo");
                } else if (mes == 11 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25  ||dia == 26) {
                    tv1.setText("por carga de trabajo");
                } else if (mes == 11 &&   dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("por carga de trabajo");

                break;

            case 12:
                if (dia == 1 ||dia == 2||dia == 3 ) {
                    tv1.setText("por carga de trabajo");
                } else if (  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 ||dia == 10 ) {
                    tv1.setText("por carga de trabajo");
                } else if (dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 )  {
                    tv1.setText("por carga de trabajo");
                } else if ( dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ||dia == 24) {
                    tv1.setText("por carga de trabajo");
                } else if (  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30||dia == 31)
                    tv1.setText("Fiscalia de Maldonado 1°");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }







    public void Maldonado2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 ) {
                tv1.setText( "Fiscalia Maldonado 1°");
            } else if (mes == 1  &&   dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia Maldonado 2°");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21) {
                tv1.setText("Fiscalia Maldonado 3°");
            } else if (mes == 1  && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText("Fiscalia Maldonado 4°");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 || dia == 5 || dia == 6   ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 2  &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  || dia == 12 || dia == 13 ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 2  &&   dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 2  &&  dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25 ||dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 2  &&   dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia Maldonado 2°");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia Maldonado 2 °");
                } else if (mes == 3  &&  dia == 7 || dia == 8  ||  dia == 9 || dia == 10 || dia == 11  ||  dia == 12 || dia == 13) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 3  &&   dia == 14 || dia == 15  ||   dia == 16 || dia == 17||dia == 18|| dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 3  &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 3  &&  dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia Maldonado 2°");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 4 && dia == 4 || dia == 5  || dia == 6 || dia == 7   || dia == 8 ||dia == 9 || dia == 10  ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 4  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 4  &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 4  && dia == 25 || dia == 26  || dia == 27 || dia ==  28    ||dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia Maldonado 2°");
                break;

            case 5:
                if  (mes == 5 && dia == 1  ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 5  &&   dia == 2 || dia == 3  || dia == 4 || dia == 5 ||dia == 6 ||dia == 7  || dia == 8  ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 5  &&  dia == 9 || dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 5  &&   dia == 16 || dia == 17 ||  dia == 18 || dia == 19   || dia == 20 ||dia == 21|| dia == 22  ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 5  &&  dia == 23 || dia == 24  ||   dia == 25 || dia == 26 || dia == 27|| dia ==  28 || dia == 29  ){
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 5  &&  dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia Maldonado 3°");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2   || dia  == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 6  &&  dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ||  dia == 10 ||dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 6 && dia == 13 || dia == 14 || dia ==  15 || dia == 16|| dia == 17 ||  dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 6  && dia == 20 || dia == 21   ||  dia == 22 || dia == 23 ||  dia == 24 ||dia == 25 || dia == 26    ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 6  &&  dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia Maldonado 3°");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 7 &&   dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia ==  15  ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 7  &&    dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 7  &&  dia == 18 || dia == 19|| dia == 20 || dia == 21 ||dia == 22 ||  dia == 23  ||  dia == 24   ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 7  && dia == 25 || dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText("Fiscalia Maldonado 3°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ||dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 8  &&      dia == 8 || dia == 9   || dia == 10 || dia == 11  ||dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 8  &&    dia  ==  15 || dia == 16||   dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21  ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 8  &&    dia == 22 || dia == 23  ||  dia == 24  || dia == 25  || dia == 26 || dia == 27 || dia ==  28) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 8  &&    dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia Maldonado 4°");
                break;

            case 9:
                if (mes == 9 && dia == 1  || dia == 2  || dia  == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 9  &&    dia == 5 || dia == 6 ||dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11   ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 9 &&      dia == 12 ||dia == 13|| dia == 14  || dia ==  15  ||   dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 9  &&   dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 ||  dia == 23 || dia == 24  || dia == 25  ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 9  &&    dia == 26 || dia == 27 ||  dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText("Fiscalia Maldonado 4°");



                break;

            case 10:
                if (mes == 10 && dia == 1 ||  dia == 2   ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 10  &&  dia == 3 || dia == 4   ||  dia == 5 || dia == 6 ||dia == 7 || dia == 8||dia == 9      ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 10  &&   dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13||dia == 14 || dia  ==  15||dia == 16  ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 10  &&   dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22|| dia == 23 ){
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 10  &&   dia == 24  || dia == 25 ||  dia == 26 || dia == 27|| dia ==  28 || dia == 29  || dia == 30 ){
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 10  &&   dia == 31 )
                    tv1.setText("Fiscalia Maldonado 1°");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 11  && dia == 7 || dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12 || dia == 13   ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 11  &&   dia == 14 || dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 11  &&   dia == 21 ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 11  &&    dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia Maldonado 1°");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 12  &&    dia == 5 || dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 12 &&    dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 12  &&     dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 12  &&dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText( "Fiscalia Maldonado 3°");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }







    public void Maldonado2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 ) {
                tv1.setText( "Fiscalia Maldonado 2°");
            } else if (mes == 1  &&   dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia Maldonado 3°");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21) {
                tv1.setText("Fiscalia Maldonado 4°");
            } else if (mes == 1  && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText("Fiscalia Maldonado 1°");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 2  &&  dia == 6  ||dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  || dia == 12  ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 2  &&   dia == 13|| dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 2  &&  dia == 20  ||dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25 ||dia == 26)  {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 2  && dia == 27  || dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia Maldonado 2°");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia Maldonado 2 °");
                } else if (mes == 3  && dia == 6 || dia == 7 || dia == 8  ||  dia == 9 || dia == 10 || dia == 11  ||  dia == 12) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 3  &&    dia == 13|| dia == 14 || dia == 15  ||   dia == 16 || dia == 17||dia == 18|| dia == 19   ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 3  && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26  ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 3  && dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia Maldonado 2°");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2  ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 4 && dia == 3  ||dia == 4 || dia == 5  || dia == 6 || dia == 7   || dia == 8 ||dia == 9  ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 4  &&   dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 4  &&   dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ||  dia == 22 ||dia == 23  ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 4  &&  dia == 24 ||dia == 25 || dia == 26  || dia == 27 || dia ==  28    ||dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia Maldonado 2°");
                break;

            case 5:
                if (mes == 5  &&  dia == 1  ||  dia == 2 || dia == 3  || dia == 4 || dia == 5 ||dia == 6 ||dia == 7    ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 5  && dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 5  &&  dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19   || dia == 20 ||dia == 21  ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 5  && dia == 22  ||dia == 23 || dia == 24  ||   dia == 25 || dia == 26 || dia == 27|| dia ==  28   ){
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 5  && dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia Maldonado 3°");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2   || dia  == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 6  &&   dia == 5||dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ||  dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 6 &&  dia == 12||dia == 13 || dia == 14 || dia ==  15 || dia == 16|| dia == 17 ||  dia == 18  ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 6  && dia == 19 ||dia == 20 || dia == 21   ||  dia == 22 || dia == 23 ||  dia == 24 ||dia == 25     ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 6  &&  dia == 26|| dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia Maldonado 3°");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 7 &&   dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia ==  15  ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 7  &&    dia == 16 ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 7  &&    dia == 17||dia == 18 || dia == 19|| dia == 20 || dia == 21 ||dia == 22 ||  dia == 23    ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 7  &&   dia == 24 ||dia == 25 || dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30   ){
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 7  &&    dia == 31 )
                    tv1.setText("Fiscalia Maldonado 2°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ||dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 8  &&    dia == 7  ||  dia == 8 || dia == 9   || dia == 10 || dia == 11  ||dia == 12 || dia == 13  ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 8  &&   dia == 14 || dia  ==  15 || dia == 16||   dia == 17 || dia == 18 ||  dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 8  &&   dia == 21 ||  dia == 22 || dia == 23  ||  dia == 24  || dia == 25  || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 8  &&    dia ==  28  ||dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia Maldonado 2°");
                break;

            case 9:
                if (mes == 9 && dia == 1  || dia == 2  || dia  == 3 ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 9  &&     dia == 4 ||dia == 5 || dia == 6 ||dia == 7 || dia == 8 ||  dia == 9 || dia == 10   ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 9 &&      dia == 11||  dia == 12 ||dia == 13|| dia == 14  || dia ==  15  ||   dia == 16 || dia == 17   ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 9  &&  dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 ||  dia == 23 || dia == 24    ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 9  &&   dia == 25||  dia == 26 || dia == 27 ||  dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText("Fiscalia Maldonado 2°");



                break;

            case 10:
                if (mes == 10 && dia == 1   ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 10  &&   dia == 2 || dia == 3 || dia == 4   ||  dia == 5 || dia == 6 ||dia == 7 || dia == 8     ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 10  &&dia == 9  ||  dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13||dia == 14 || dia  ==  15  ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 10  &&   dia == 16||dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22 ){
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 10  &&  dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27|| dia ==  28 || dia == 29   ){
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 10  &&  dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Maldonado 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 11  &&  dia == 6||dia == 7 || dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12  ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 11  &&    dia == 13 || dia == 14 || dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19   ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 11  &&  dia == 20 || dia == 21 ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26  ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 11  &&   dia == 27  ||dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia Maldonado 3°");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3  ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 12  && dia == 4   || dia == 5 || dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 12 &&  dia == 11  || dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17  ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 12  &&    dia == 18 || dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 12  &&dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText( "Fiscalia Maldonado 3°");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }












    public void Maldonado2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 ) {
                tv1.setText( "Fiscalia Maldonado 3°");
            } else if (mes == 1  &&   dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia Maldonado 4°");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21) {
                tv1.setText("Fiscalia Maldonado 1°");
            } else if (mes == 1  && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText("Fiscalia Maldonado 2°");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4  ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 2  &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 2  &&   dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18  ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 2  &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 2  &&  dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia Maldonado 3°");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 3  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||  dia == 9 || dia == 10 ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 3  &&  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ||   dia == 16 || dia == 17 ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 3  && dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 3  && dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia Maldonado 3°");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 4 &&    dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 4  &&   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 4  &&   dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 || dia ==  28 ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 4  &&   dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia Maldonado 4°");
                break;

            case 5:
                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  || dia == 4 || dia == 5 ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 5  &&   dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 5  &&   dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 5  &&    dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||   dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 5  && dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia Maldonado 4°");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2  ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 6  &&  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||  dia == 8 || dia == 9  ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 6 &&  dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15 || dia == 16  ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 6  &&dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21   ||  dia == 22 || dia == 23     ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 6  &&  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia Maldonado 4°");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 7 &&   dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 7  &&   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19|| dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 7  && dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26|| dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 7  &&  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText("Fiscalia Maldonado 1°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 8  &&     dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 8  &&    dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16||   dia == 17 || dia == 18    ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 8  &&   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||  dia == 24  || dia == 25  ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 8  &&   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia Maldonado 1°");
                break;

            case 9:
                if (mes == 9 && dia == 1   ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 9  &&   dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 || dia == 8    ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 9 &&      dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13|| dia == 14  || dia ==  15     ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 9  &&   dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22   ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 9  &&    dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||  dia ==  28 || dia == 29  ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 9  &&     dia == 30   )
                    tv1.setText("Fiscalia Maldonado 2°");


                break;

            case 10:
                if (mes == 10 && dia == 1 ||  dia == 2 || dia == 3 || dia == 4   ||  dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 10  &&  dia == 7 || dia == 8||dia == 9 || dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13     ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 10  &&  dia == 14 || dia  ==  15||dia == 16 || dia == 17 || dia == 18  ||  dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia Maldonado 4°");
                } else if (mes == 10  &&    dia == 21 || dia == 22|| dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 ){
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 10  &&  dia ==  28 || dia == 29  || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Maldonado 2°");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia Maldonado 2°");
                } else if (mes == 11  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||dia == 9 || dia == 10   ) {
                    tv1.setText("Fiscalia Maldonado 3°");
                } else if (mes == 11  &&    dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15||  dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 11  &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||dia == 23 || dia == 24  ) {
                    tv1.setText("Fiscalia Maldonado 1°");
                } else if (mes == 11  &&    dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia Maldonado 2°");


                break;

            case 12:

                if (mes == 12 && dia == 1  ) {
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 12  &&    dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6||   dia == 7 || dia == 8 ) {
                    tv1.setText( "Fiscalia Maldonado 3°");
                } else if (mes == 12 &&    dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 ) {
                    tv1.setText( "Fiscalia Maldonado 4°");
                } else if (mes == 12  &&     dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ) {
                    tv1.setText( "Fiscalia Maldonado 1°");
                } else if (mes == 12  && dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29  ){
                    tv1.setText( "Fiscalia Maldonado 2°");
                } else if (mes == 12  &&  dia == 30  || dia == 31   )
                    tv1.setText( "Fiscalia Maldonado 3°");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }





    public void Maldonado2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de Maldonado 4°");
            } else if (mes == 1  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia de Maldonado 1°");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ) {
                tv1.setText( "Fiscalia de Maldonado 2°");
            } else if (mes == 1  &&   dia == 20 || dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26  ){
                tv1.setText( "Fiscalia de Maldonado 3°");
            } else if (mes == 1  &&    dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia de Maldonado 4°");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 2  &&   dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16    ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 2  && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 2  &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de Maldonado 4°");

                break;
                case 3:
                if (dia == 1   || dia == 2 ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16 ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23  ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if ( dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ) {
                    tv1.setText( "Fiscalia de Maldonado 4");
                } else if ( dia == 31  )
                tv1.setText( "Fiscalia de Maldonado 1°");




                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5|| dia == 6   ) {
                    tv1.setText("Fiscalia de Maldonado 1°");
                } else if (mes == 4 &&    dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13  ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 4  &&   dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20   ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 4  &&   dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 4  &&    dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Maldonado 1°");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  || dia == 4 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 5  &&    dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  || dia == 11 ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 5  &&   dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ||dia == 18 ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 5  &&    dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 5  &&   dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Maldonado 1°");



                break;
            case 6:
                if (mes == 6 && dia == 1   ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 6  &&   dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 6  &&    dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14||dia ==  15  ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 6 &&   dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21|| dia == 22 ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 6  &&     dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  || dia == 29   ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "Fiscalia de Maldonado 2°");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ||dia == 6 ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 7 &&   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13    ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 7  &&    dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 7  &&   dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 7  &&   dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de Maldonado 2°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2 || dia == 3   ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 8  &&   dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ||dia == 10   ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 8  &&    dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16  ||  dia == 17  ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 8  &&   dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 8  &&  dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30|| dia == 31)
                    tv1.setText( "Fiscalia de Maldonado 2°");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 9  &&    dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 9 &&     dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 9  &&      dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Maldonado 3°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4  || dia == 5    ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 10  &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  || dia == 12  ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 10  &&   dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 ||  dia == 26 ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Maldonado 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1  || dia == 2 ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText("Fiscalia de Maldonado 4°");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||  dia == 23   ) {
                    tv1.setText("Fiscalia de Maldonado 2°");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Maldonado 3°");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7  ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 12  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  || dia == 14    ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 12 &&    dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ||dia == 21   ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia == 28  ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 12  &&   dia == 29 || dia == 30  ||  dia == 31   )
                    tv1.setText( "Fiscalia de Maldonado 4°");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void  Maldonado2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                tv1.setText( "Fiscalia de Maldonado 4°");
            } else if (mes == 1  &&    dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11   ) {
                tv1.setText( "Fiscalia de Maldonado 1°");
            } else if (mes == 1  &&   dia == 12||dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18   ) {
                tv1.setText( "Fiscalia de Maldonado 2°");
            } else if (mes == 1  &&  dia == 19 ||  dia == 20 || dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25   ){
                tv1.setText( "Fiscalia de Maldonado 3°");
            } else if (mes == 1  &&  dia == 26  || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia de Maldonado 4°");
                break;

            case 2:

                if (mes == 2 && dia == 1   ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 2  &&  dia == 2  ||dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 2  && dia == 9   || dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15     ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 2  &&  dia == 16||dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22  ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 2  && dia == 23 ||  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de Maldonado 4°");
                break;

            case 3:
                if ( dia == 1  ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if ( dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if ( dia == 9 ||dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (dia == 16|| dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22   ) {
                    tv1.setText("Fiscalia de Maldonado 3°");
                } else if (dia == 23||dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29)
                    tv1.setText( "Fiscalia de Maldonado 4°");
                else if ( mes == 3  &&   (    dia == 30||dia == 31))
                    tv1.setText( "Fiscalia de Maldonado 1°");
                break;


            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia de Maldonado 1°");
                } else if (mes == 4 &&  dia == 6   || dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 4  &&   dia == 13  ||dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19    ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 4  &&  dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 4  &&   dia == 27 || dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Maldonado 1°");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 5  &&    dia == 4  || dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 5  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17   ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 5  &&    dia == 18||dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 5  && dia == 25  || dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Maldonado 1°");



                break;
            case 6:
                if (mes == 6 && dia == 1  || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 6 &&dia ==  15   || dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 6  && dia == 22   ||  dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28     ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 6  &&  dia == 29  || dia == 30  )
                    tv1.setText( "Fiscalia de Maldonado 2°");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 7 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 7  &&  dia == 13   || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 7  && dia == 20  ||  dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 7  && dia == 27   ||  dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de Maldonado 2°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 8  &&dia == 3   ||   dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 8  &&  dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 8  &&  dia == 17  ||  dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 8  && dia == 24 ||  dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30|| dia == 31){
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 8  &&  dia == 31)
                    tv1.setText( "Fiscalia de Maldonado 3°");

                break;


            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 9  &&  dia == 7  ||  dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13  ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 9 &&    dia == 14  ||   dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 9  &&  dia == 21   ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 9  &&  dia ==  28    ||   dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Maldonado 3°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4   ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 10  && dia == 5   ||   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 10  &&  dia == 12    ||dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 10  &&  dia == 19 ||  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 10  &&    dia == 26   ||dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Maldonado 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1  ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 11  &&   dia == 2 ||dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText("Fiscalia de Maldonado 4°");
                } else if (mes == 11  &&  dia == 9  || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22   ) {
                    tv1.setText("Fiscalia de Maldonado 2°");
                } else if (mes == 11  &&  dia == 23   ||dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29    ){
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 11  &&  dia == 30   )
                    tv1.setText( "Fiscalia de Maldonado 4°");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de Maldonado 4°");
                } else if (mes == 12  &&  dia == 7   || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13    ) {
                    tv1.setText( "Fiscalia de Maldonado 1°");
                } else if (mes == 12 &&   dia == 14   || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Maldonado 2°");
                } else if (mes == 12  &&  dia == 21 ||   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia de Maldonado 3°");
                } else if (mes == 11  && dia == 28 ||  dia == 29 || dia == 30  ||  dia == 31   )
                    tv1.setText( "Fiscalia de Maldonado 4°");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }










    public void Paysandu2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {


            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 11  &&  dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14   ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 11  &&   dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19 || dia == 20  || dia == 21 ) {
                    tv1.setText( "Fiscalia de Paysandú 3º");
                } else if (mes == 11  &&  dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 11  &&   dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia de Paysandú 1º");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3 || dia == 4  || dia == 5) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 12  &&    dia == 6 ||   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11  || dia == 12 ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 12 &&   dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia de Paysandú 3º");
                } else if (mes == 12  &&    dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  || dia == 25 ||  dia == 26) {
                    tv1.setText( "Fiscalia de Paysandú 4º");
                } else if (mes == 12  && dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText( "Fiscalia de Paysandú 1º");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void Paysandu2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 ) {
                tv1.setText( "Fiscalia de Paysandú 1º");
            } else if (mes == 1  &&   dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                tv1.setText("Fiscalia de Paysandú 2º");
            } else if (mes == 1  &&   dia == 10 || dia == 11 || dia == 12||dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                tv1.setText("Fiscalia de Paysandú 3º");
            } else if (mes == 1  &&dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21 || dia == 22 || dia == 23 ){
                tv1.setText("Fiscalia de Paysandú 4º");
            } else if (mes == 1  &&   dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30  ){
                tv1.setText("Fiscalia de Paysandú 1º");
            } else if (mes == 1  &&  dia == 31 )
                tv1.setText("Fiscalia de Paysandú 2º");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 || dia == 5 || dia == 6   ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 2  &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  || dia == 12 || dia == 13 ) {
                    tv1.setText( "Fiscalia de Paysandú 3º");
                } else if (mes == 2  &&   dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 2  &&  dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25 ||dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 2  &&   dia ==  28 || dia ==  29  )
                    tv1.setText("Fiscalia de Paysandú 2º");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 3  &&  dia == 7 || dia == 8  ||  dia == 9 || dia == 10 || dia == 11  ||  dia == 12 || dia == 13) {
                    tv1.setText( "Fiscalia de Paysandú 3º");
                } else if (mes == 3  &&   dia == 14 || dia == 15  ||   dia == 16 || dia == 17||dia == 18|| dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 3  &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 3  &&  dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText("Fiscalia de Paysandú 2º");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 4 && dia == 4 || dia == 5  || dia == 6 || dia == 7   || dia == 8 ||dia == 9 || dia == 10  ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 4  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 4  &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 4  && dia == 25 || dia == 26  || dia == 27 || dia ==  28    ||dia == 29 ||dia == 30  )
                    tv1.setText("Fiscalia de Paysandú 2º");
                break;

            case 5:
                if  (mes == 5 && dia == 1  ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 5  &&   dia == 2 || dia == 3  || dia == 4 || dia == 5 ||dia == 6 ||dia == 7  || dia == 8  ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 5  &&  dia == 9 || dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 5  &&   dia == 16 || dia == 17 ||  dia == 18 || dia == 19   || dia == 20 ||dia == 21|| dia == 22  ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 5  &&  dia == 23 || dia == 24  ||   dia == 25 || dia == 26 || dia == 27|| dia ==  28 || dia == 29  ){
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 5  &&  dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Paysandú 3º");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2   || dia  == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 6  &&  dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ||  dia == 10 ||dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 6 && dia == 13 || dia == 14 || dia ==  15 || dia == 16|| dia == 17 ||  dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 6  && dia == 20 || dia == 21   ||  dia == 22 || dia == 23 ||  dia == 24 ||dia == 25 || dia == 26    ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 6  &&  dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia de Paysandú 3º");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 7 &&   dia == 4 || dia == 5  || dia == 6 || dia == 7|| dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 7  &&  dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 7  &&  dia == 18 || dia == 19|| dia == 20 || dia == 21 ||dia == 22 ||  dia == 23  ||  dia == 24   ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 7  && dia == 25 || dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText("Fiscalia de Paysandú 3º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ||dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 8  &&      dia == 8 || dia == 9   || dia == 10 || dia == 11  ||dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 8  &&    dia  ==  15 || dia == 16||   dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21  ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 8  &&    dia == 22 || dia == 23  ||  dia == 24  || dia == 25  || dia == 26 || dia == 27 || dia ==  28) {
                    tv1.setText( "Fiscalia de Paysandú 3º");
                } else if (mes == 8  &&    dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia de Paysandú 4º");
                break;

            case 9:
                if (mes == 9 && dia == 1  || dia == 2  || dia  == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 9  &&    dia == 5 || dia == 6 ||dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11   ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 9 &&      dia == 12 ||dia == 13|| dia == 14  || dia ==  15  ||   dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 9  &&   dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 ||  dia == 23 || dia == 24  || dia == 25  ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 9  &&    dia == 26 || dia == 27 ||  dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText("Fiscalia de Paysandú 4º");



                break;

            case 10:
                if (mes == 10 && dia == 1 ||  dia == 2   ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 10  &&  dia == 3 || dia == 4   ||  dia == 5 || dia == 6 ||dia == 7 || dia == 8||dia == 9      ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 10  &&   dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13||dia == 14 || dia  ==  15||dia == 16  ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 10  &&   dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22|| dia == 23 ){
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 10  &&   dia == 24  || dia == 25 ||  dia == 26 || dia == 27|| dia ==  28 || dia == 29  || dia == 30 ){
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 10  &&   dia == 31 )
                    tv1.setText("Fiscalia de Paysandú 1º");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 11  && dia == 7 || dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12 || dia == 13   ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 11  &&   dia == 14 || dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Paysandú 3º");
                } else if (mes == 11  &&   dia == 21 ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 11  &&    dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia de Paysandú 1º");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 12  &&    dia == 5 || dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 12 &&    dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 ) {
                    tv1.setText( "Fiscalia de Paysandú 3º");
                } else if (mes == 12  &&     dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24 || dia == 25 ) {
                    tv1.setText( "Fiscalia de Paysandú 4º");
                } else if (mes == 12  &&  dia == 26 || dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText( "Fiscalia de Paysandú 1º");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }







    public void Paysandu2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1  ) {
                tv1.setText("Fiscalia de Paysandú 1º");
            } else if (mes == 1  &&   dia == 2 ||dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                tv1.setText( "Fiscalia de Paysandú 2º");
            } else if (mes == 1  && dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia == 15 ) {
                tv1.setText("Fiscalia de Paysandú 3º");
            } else if (mes == 1  &&  dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21|| dia == 22 ){
                tv1.setText("Fiscalia de Paysandú 4º");
            } else if (mes == 1  &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ) {
                tv1.setText("Fiscalia de Paysandú 1º");
            } else if (mes == 1  &&  dia == 30 || dia == 31 )
                tv1.setText("Fiscalia de Paysandú 2º");

                break;




            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 2  &&  dia == 6  ||dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  || dia == 12  ) {
                    tv1.setText( "Fiscalia de Paysandú 3º");
                } else if (mes == 2  &&   dia == 13|| dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 2  &&  dia == 20  ||dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25 ||dia == 26)  {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 2  && dia == 27  || dia ==  28 || dia ==  29  )
                    tv1.setText("Fiscalia de Paysandú 2º");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 3  && dia == 6 || dia == 7 || dia == 8  ||  dia == 9 || dia == 10 || dia == 11  ||  dia == 12) {
                    tv1.setText( "Fiscalia de Paysandú 3º");
                } else if (mes == 3  &&    dia == 13|| dia == 14 || dia == 15  ||   dia == 16 || dia == 17||dia == 18|| dia == 19   ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 3  && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26  ) {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 3  && dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText("Fiscalia de Paysandú 2º");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2  ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 4 && dia == 3  ||dia == 4 || dia == 5  || dia == 6 || dia == 7   || dia == 8 ||dia == 9  ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 4  &&   dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 4  &&   dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ||  dia == 22 ||dia == 23  ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 4  &&  dia == 24 ||dia == 25 || dia == 26  || dia == 27 || dia ==  28    ||dia == 29 ||dia == 30  )
                    tv1.setText("Fiscalia de Paysandú 2º");
                break;

            case 5:
                if (mes == 5  &&  dia == 1  ||  dia == 2 || dia == 3  || dia == 4 || dia == 5 ||dia == 6 ||dia == 7    ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 5  && dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 5  &&  dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19   || dia == 20 ||dia == 21  ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 5  && dia == 22  ||dia == 23 || dia == 24  ||   dia == 25 || dia == 26 || dia == 27|| dia ==  28   ){
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 5  && dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Paysandú 3º");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2   || dia  == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 6  &&   dia == 5||dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ||  dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 6 &&  dia == 12||dia == 13 || dia == 14 || dia ==  15 || dia == 16|| dia == 17 ||  dia == 18  ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 6  && dia == 19 ||dia == 20 || dia == 21   ||  dia == 22 || dia == 23 ||  dia == 24 ||dia == 25     ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 6  &&  dia == 26|| dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia de Paysandú 3º");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 7 &&   dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia ==  15  ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 7  &&    dia == 16 ) {
                    tv1.setText( "Fiscalia Paysandú 4°");
                } else if (mes == 7  &&    dia == 17||dia == 18 || dia == 19|| dia == 20 || dia == 21 ||dia == 22 ||  dia == 23    ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 7  &&   dia == 24 ||dia == 25 || dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30   ){
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 7  &&    dia == 31 )
                    tv1.setText("Fiscalia de Paysandú 3º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ||dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 8  &&    dia == 7  ||  dia == 8 || dia == 9   || dia == 10 || dia == 11  ||dia == 12 || dia == 13  ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 8  &&   dia == 14 || dia  ==  15 || dia == 16||   dia == 17 || dia == 18 ||  dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 8  &&   dia == 21 ||  dia == 22 || dia == 23  ||  dia == 24  || dia == 25  || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de Paysandú 2º");
                } else if (mes == 8  &&    dia ==  28  ||dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia de Paysandú 3º");
                break;

            case 9:
                if (mes == 9 && dia == 1  || dia == 2  || dia  == 3 ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 9  &&     dia == 4 ||dia == 5 || dia == 6 ||dia == 7 || dia == 8 ||  dia == 9 || dia == 10   ) {
                    tv1.setText( "Fiscalia de Paysandú 4º");
                } else if (mes == 9 &&      dia == 11||  dia == 12 ||dia == 13|| dia == 14  || dia ==  15  ||   dia == 16 || dia == 17   ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 9  &&  dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 ||  dia == 23 || dia == 24    ) {
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 9  &&   dia == 25||  dia == 26 || dia == 27 ||  dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText("Fiscalia de Paysandú 3º");



                break;

            case 10:
                if (mes == 10 && dia == 1   ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 10  &&   dia == 2 || dia == 3 || dia == 4   ||  dia == 5 || dia == 6 ||dia == 7 || dia == 8     ) {
                    tv1.setText( "Fiscalia de Paysandú 4º");
                } else if (mes == 10  &&dia == 9  ||  dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13||dia == 14 || dia  ==  15  ) {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 10  &&   dia == 16||dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22 ){
                    tv1.setText("Fiscalia de Paysandú 2º");
                } else if (mes == 10  &&  dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27|| dia ==  28 || dia == 29   ){
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 10  &&  dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Paysandú 4º");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia de Paysandú 4º");
                } else if (mes == 11  &&  dia == 6||dia == 7 || dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12  ) {
                    tv1.setText("Fiscalia de Paysandú 1º");
                } else if (mes == 11  &&    dia == 13 || dia == 14 || dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19   ) {
                    tv1.setText( "Fiscalia de Paysandú 2º");
                } else if (mes == 11  &&  dia == 20 || dia == 21 ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26  ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 11  &&   dia == 27  ||dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia de Paysandú 4º");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3  ) {
                    tv1.setText( "Fiscalia de Paysandú 4º");
                } else if (mes == 12  && dia == 4   || dia == 5 || dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de Paysandú 1º");
                } else if (mes == 12 &&  dia == 11  || dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17  ) {
                    tv1.setText( "Fiscalia de Paysandú 2º");
                } else if (mes == 12  &&    dia == 18 || dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  ) {
                    tv1.setText("Fiscalia de Paysandú 3º");
                } else if (mes == 12  &&dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText( "Fiscalia de Paysandú 4º");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }







    public void Paysandu2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 ) {
                tv1.setText( "Fiscalia de Paysandu  4º");
            } else if (mes == 1  &&   dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia de Paysandu  1º");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21) {
                tv1.setText("Fiscalia de Paysandu  2º");
            } else if (mes == 1  && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText("Fiscalia de Paysandu  3º");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4  ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 2  &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  ) {
                    tv1.setText( "Fiscalia de Paysandu  1º");
                } else if (mes == 2  &&   dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18  ) {
                    tv1.setText("Fiscalia de Paysandu  2º");
                } else if (mes == 2  &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia de Paysandu  3º");
                } else if (mes == 2  &&  dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia de Paysandu  4º");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 3  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||  dia == 9 || dia == 10   ) {
                    tv1.setText( "Fiscalia de Paysandu  1º");
                } else if (mes == 3  &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ||   dia == 16 || dia == 17  ) {
                    tv1.setText("Fiscalia de Paysandu  2º");
                } else if (mes == 3  && dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  ) {
                    tv1.setText("Fiscalia de Paysandu  3º");
                } else if (mes == 3  &&dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de Paysandu  4º");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Paysandu  1º");
                } else if (mes == 4 &&    dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de Paysandu  2º");
                } else if (mes == 4  &&   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText("Fiscalia de Paysandu  3º");
                } else if (mes == 4  &&   dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 || dia ==  28 ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 4  &&   dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Paysandu  1º");
                break;

            case 5:
                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  || dia == 4 || dia == 5 ) {
                    tv1.setText( "Fiscalia de Paysandu  1º");
                } else if (mes == 5  &&   dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia de Paysandu  2º");
                } else if (mes == 5  &&   dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia de Paysandu  3º");
                } else if (mes == 5  &&    dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||   dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 5  && dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Paysandu  1º");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2  ) {
                    tv1.setText("Fiscalia de Paysandu  1º");
                } else if (mes == 6  &&  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||  dia == 8 || dia == 9  ) {
                    tv1.setText("Fiscalia de Paysandu  2º");
                } else if (mes == 6 &&  dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15 || dia == 16  ) {
                    tv1.setText( "Fiscalia de Paysandu  3º");
                } else if (mes == 6  &&dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21   ||  dia == 22 || dia == 23     ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 6  &&  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia de Paysandu  1º");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Paysandu  2º");
                } else if (mes == 7 &&   dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de Paysandu  3º");
                } else if (mes == 7  &&   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19|| dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 7  && dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26|| dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia de Paysandu  1º");
                } else if (mes == 7  &&  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText("Fiscalia de Paysandu  2º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia de Paysandu  2º");
                } else if (mes == 8  &&     dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia de Paysandu  3º");
                } else if (mes == 8  &&    dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16||   dia == 17 || dia == 18    ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 8  &&   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||  dia == 24  || dia == 25  ) {
                    tv1.setText( "Fiscalia de Paysandu  1º");
                } else if (mes == 8  &&   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia de Paysandu  2º");
                break;

            case 9:
                if (mes == 9 && dia == 1   ) {
                    tv1.setText("Fiscalia de Paysandu  2º");
                } else if (mes == 9  &&   dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 || dia == 8    ) {
                    tv1.setText( "Fiscalia de Paysandu  3º");
                } else if (mes == 9 &&      dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13|| dia == 14  || dia ==  15     ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 9  &&   dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22   ) {
                    tv1.setText("Fiscalia de Paysandu  1º");
                } else if (mes == 9  &&    dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||  dia ==  28 || dia == 29  ) {
                    tv1.setText("Fiscalia de Paysandu  2º");
                } else if (mes == 9  &&     dia == 30   )
                    tv1.setText("Fiscalia de Paysandu  3º");


                break;

            case 10:
                if (mes == 10 && dia == 1 ||  dia == 2 || dia == 3 || dia == 4   ||  dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia de Paysandu  3º");
                } else if (mes == 10  &&  dia == 7 || dia == 8||dia == 9 || dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13     ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 10  &&  dia == 14 || dia  ==  15||dia == 16 || dia == 17 || dia == 18  ||  dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia de Paysandu  1º");
                } else if (mes == 10  &&    dia == 21 || dia == 22|| dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 ){
                    tv1.setText("Fiscalia Paysandu 2°");
                } else if (mes == 10  &&  dia ==  28 || dia == 29  || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Paysandu 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia de Paysandu  3º");
                } else if (mes == 11  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||dia == 9 || dia == 10   ) {
                    tv1.setText("Fiscalia de Paysandu 4º");
                } else if (mes == 11  &&    dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15||  dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de Paysandu  1º");
                } else if (mes == 11  &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||dia == 23 || dia == 24  ) {
                    tv1.setText("Fiscalia Las Piedras 2°");
                } else if (mes == 11  &&    dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia de Paysandu  3º");


                break;

            case 12:

                if (mes == 12 && dia == 1  ) {
                    tv1.setText( "Fiscalia de Paysandu  3º");
                } else if (mes == 12  &&    dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6||   dia == 7 || dia == 8 ) {
                    tv1.setText( "Fiscalia de Paysandu  4º");
                } else if (mes == 12 &&    dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 ) {
                    tv1.setText( "Fiscalia de Paysandu  1º");
                } else if (mes == 12  &&     dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ) {
                    tv1.setText( "Fiscalia de Paysandu  2º");
                } else if (mes == 12  && dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29  ){
                    tv1.setText( "Fiscalia de Paysandu  3º");
                } else if (mes == 12  &&  dia == 30  || dia == 31   )
                    tv1.setText( "Fiscalia de Paysandu  4º");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }














    public void Paysandu2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de Paysandu 4°");
            } else if (mes == 1  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia de Paysandu 1°");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ) {
                tv1.setText( "Fiscalia de Paysandu 2°");
            } else if (mes == 1  &&   dia == 20 || dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26  ){
                tv1.setText( "Fiscalia de Paysandu 3°");
            } else if (mes == 1  &&    dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia de Paysandu 4°");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 2  &&   dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16    ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 2  && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 2  &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de Paysandu 4°");
                break;

            case 3:

                if ( dia == 1   || dia == 2 ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if ( dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16   ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (  dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23  ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29|| dia == 30   ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
               } else if (  dia == 31  )
                tv1.setText( "Fiscalia de Paysandu 1°");




                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5|| dia == 6   ) {
                    tv1.setText("Fiscalia de Paysandu 1°");
                } else if (mes == 4 &&    dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13  ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 4  &&   dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20   ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 4  &&   dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 4  &&    dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Paysandu 1°");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  || dia == 4 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 5  &&    dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  || dia == 11 ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 5  &&   dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ||dia == 18 ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 5  &&    dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 5  &&   dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Paysandu 1°");



                break;
            case 6:
                if (mes == 6 && dia == 1   ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 6  &&   dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 6  &&    dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14||dia ==  15  ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 6 &&   dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21|| dia == 22 ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 6  &&     dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  || dia == 29   ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "Fiscalia de Paysandu 2°");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ||dia == 6 ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 7 &&   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13    ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 7  &&    dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 7  &&   dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 7  &&   dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de Paysandu 2°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2 || dia == 3   ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 8  &&   dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ||dia == 10   ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 8  &&    dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16  ||  dia == 17  ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 8  &&   dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 8  &&  dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30|| dia == 31)
                    tv1.setText( "Fiscalia de Paysandu 2°");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 9  &&    dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 9 &&     dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 9  &&      dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Paysandu 3°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4  || dia == 5    ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 10  &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  || dia == 12  ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 10  &&   dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 ||  dia == 26 ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Paysandu 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1  || dia == 2 ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText("Fiscalia de Paysandu 4°");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||  dia == 23   ) {
                    tv1.setText("Fiscalia de Paysandu 2°");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Paysandu 3°");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7  ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 12  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  || dia == 14    ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 12 &&    dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ||dia == 21   ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia == 28  ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 11  &&   dia == 29 || dia == 30  ||  dia == 31   )
                    tv1.setText( "Fiscalia de Paysandu 4°");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void  Paysandu2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                tv1.setText( "Fiscalia de Paysandu 4°");
            } else if (mes == 1  &&    dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11   ) {
                tv1.setText( "Fiscalia de Paysandu 1°");
            } else if (mes == 1  &&   dia == 12||dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18   ) {
                tv1.setText( "Fiscalia de Paysandu 2°");
            } else if (mes == 1  &&  dia == 19 ||  dia == 20 || dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25   ){
                tv1.setText( "Fiscalia de Paysandu 3°");
            } else if (mes == 1  &&  dia == 26  || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia de Paysandu 4°");
                break;

            case 2:

                if (mes == 2 && dia == 1   ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 2  &&  dia == 2  ||dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 2  && dia == 9   || dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15     ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 2  &&  dia == 16||dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22  ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 2  && dia == 23 ||  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de Paysandu 4°");
                break;

            case 3:
                if ( dia == 1  ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if ( dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if ( dia == 9 ||dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (dia == 16|| dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22   ) {
                    tv1.setText("Fiscalia de Paysandu 3°");
                } else if (dia == 23||dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29)
                    tv1.setText( "Fiscalia de Paysandu 4°");
                else if ( mes == 3  &&   (    dia == 30||dia == 31))
                    tv1.setText( "Fiscalia de Paysandu 1°");
                break;


            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia de Paysandu 1°");
                } else if (mes == 4 &&  dia == 6   || dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 4  &&   dia == 13  ||dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19    ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 4  &&  dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 4  &&   dia == 27 || dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Paysandu 1°");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 5  &&    dia == 4  || dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 5  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17   ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 5  &&    dia == 18||dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 5  && dia == 25  || dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Paysandu 1°");



                break;
            case 6:
                if (mes == 6 && dia == 1  || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 6 &&dia ==  15   || dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 6  && dia == 22   ||  dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28     ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 6  &&  dia == 29  || dia == 30  )
                    tv1.setText( "Fiscalia de Paysandu 2°");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 7 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 7  &&  dia == 13   || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 7  && dia == 20  ||  dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 7  && dia == 27   ||  dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de Paysandu 2°");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 8  &&dia == 3   ||   dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 8  &&  dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 8  &&  dia == 17  ||  dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 8  && dia == 24 ||  dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30|| dia == 31){
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 8  &&  dia == 31)
                    tv1.setText( "Fiscalia de Paysandu 3°");

                break;


            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 9  &&  dia == 7  ||  dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13  ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 9 &&    dia == 14  ||   dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 9  &&  dia == 21   ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 9  &&  dia ==  28    ||   dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Paysandu 3°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4   ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 10  && dia == 5   ||   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 10  &&  dia == 12    ||dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 10  &&  dia == 19 ||  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 10  &&    dia == 26   ||dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Paysandu 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1  ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 11  &&   dia == 2 ||dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText("Fiscalia de Paysandu 4°");
                } else if (mes == 11  &&  dia == 9  || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22   ) {
                    tv1.setText("Fiscalia de Paysandu 2°");
                } else if (mes == 11  &&  dia == 23   ||dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29    ){
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 11  &&  dia == 30   )
                    tv1.setText( "Fiscalia de Paysandu 4°");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de Paysandu 4°");
                } else if (mes == 12  &&  dia == 7   || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13    ) {
                    tv1.setText( "Fiscalia de Paysandu 1°");
                } else if (mes == 12 &&   dia == 14   || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Paysandu 2°");
                } else if (mes == 12  &&  dia == 21 ||   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia de Paysandu 3°");
                } else if (mes == 12  && dia == 28 ||  dia == 29 || dia == 30  ||  dia == 31   )
                    tv1.setText( "Fiscalia de Paysandu 4°");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }












    public void Salto2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {


            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 11  &&  dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14   ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 11  &&   dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19 || dia == 20  || dia == 21 ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 11  &&  dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 11  &&   dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia de Salto 1º");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3 || dia == 4  || dia == 5) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 12  &&    dia == 6 ||   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11  || dia == 12 ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 12 &&   dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 12  &&    dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  || dia == 25 ||  dia == 26) {
                    tv1.setText( "Fiscalia de Salto 4º");
                } else if (mes == 12  && dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText( "Fiscalia de Salto 1º");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void Salto2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 ) {
                tv1.setText( "Fiscalia de Salto 1º");
            } else if (mes == 1  &&   dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                tv1.setText("Fiscalia de Salto 2º");
            } else if (mes == 1  &&   dia == 10 || dia == 11 || dia == 12||dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                tv1.setText("Fiscalia de Salto 3º");
            } else if (mes == 1  &&dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21 || dia == 22 || dia == 23 ){
                tv1.setText("Fiscalia de Salto 4º");
            } else if (mes == 1  &&   dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30  ){
                tv1.setText("Fiscalia de Salto 1º");
            } else if (mes == 1  &&  dia == 31 )
                tv1.setText("Fiscalia de Salto 2º");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 || dia == 5 || dia == 6   ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 2  &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 2  &&   dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 2  &&  dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25 ||dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 2  &&   dia ==  28 || dia ==  29  )
                    tv1.setText("Fiscalia de Salto 2º");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 3  &&  dia == 7 || dia == 8  ||  dia == 9 || dia == 10 || dia == 11  ||  dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 3  &&   dia == 14 || dia == 15  ||   dia == 16 || dia == 17||dia == 18|| dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 3  &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 3  &&  dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText("Fiscalia de Salto 2º");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 4 && dia == 4 || dia == 5  || dia == 6 || dia == 7   || dia == 8 ||dia == 9 || dia == 10  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 4  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 4  &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 4  && dia == 25 || dia == 26  || dia == 27 || dia ==  28    ||dia == 29 ||dia == 30  )
                    tv1.setText("Fiscalia de Salto 2º");
                break;

            case 5:
                if  (mes == 5 && dia == 1  ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 5  &&   dia == 2 || dia == 3  || dia == 4 || dia == 5 ||dia == 6 ||dia == 7  || dia == 8  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 5  &&  dia == 9 || dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 5  &&   dia == 16 || dia == 17 ||  dia == 18 || dia == 19   || dia == 20 ||dia == 21|| dia == 22  ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 5  &&  dia == 23 || dia == 24  ||   dia == 25 || dia == 26 || dia == 27|| dia ==  28 || dia == 29  ){
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 5  &&  dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Salto 3º");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2   || dia  == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 6  &&  dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ||  dia == 10 ||dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 6 && dia == 13 || dia == 14 || dia ==  15 || dia == 16|| dia == 17 ||  dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 6  && dia == 20 || dia == 21   ||  dia == 22 || dia == 23 ||  dia == 24 ||dia == 25 || dia == 26    ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 6  &&  dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia de Salto 3º");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 7 &&   dia == 4 || dia == 5  || dia == 6 || dia == 7|| dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 7  &&  dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 7  &&  dia == 18 || dia == 19|| dia == 20 || dia == 21 ||dia == 22 ||  dia == 23  ||  dia == 24   ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 7  && dia == 25 || dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText("Fiscalia de Salto 3º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ||dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 8  &&      dia == 8 || dia == 9   || dia == 10 || dia == 11  ||dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 8  &&    dia  ==  15 || dia == 16||   dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21  ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 8  &&    dia == 22 || dia == 23  ||  dia == 24  || dia == 25  || dia == 26 || dia == 27 || dia ==  28) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 8  &&    dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia de Salto 4º");
                break;

            case 9:
                if (mes == 9 && dia == 1  || dia == 2  || dia  == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 9  &&    dia == 5 || dia == 6 ||dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11   ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 9 &&      dia == 12 ||dia == 13|| dia == 14  || dia ==  15  ||   dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 9  &&   dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 ||  dia == 23 || dia == 24  || dia == 25  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 9  &&    dia == 26 || dia == 27 ||  dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText("Fiscalia de Salto 4º");



                break;

            case 10:
                if (mes == 10 && dia == 1 ||  dia == 2   ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 10  &&  dia == 3 || dia == 4   ||  dia == 5 || dia == 6 ||dia == 7 || dia == 8||dia == 9      ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 10  &&   dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13||dia == 14 || dia  ==  15||dia == 16  ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 10  &&   dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22|| dia == 23 ){
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 10  &&   dia == 24  || dia == 25 ||  dia == 26 || dia == 27|| dia ==  28 || dia == 29  || dia == 30 ){
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 10  &&   dia == 31 )
                    tv1.setText("Fiscalia de Salto 1º");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 11  && dia == 7 || dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12 || dia == 13   ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 11  &&   dia == 14 || dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 11  &&   dia == 21 ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 11  &&    dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia de Salto 1º");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 12  &&    dia == 5 || dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 12 &&    dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 12  &&     dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24 || dia == 25 ) {
                    tv1.setText( "Fiscalia de Salto 4º");
                } else if (mes == 12  &&  dia == 26 || dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText( "Fiscalia de Salto 1º");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }






    public void Salto2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1  ) {
                tv1.setText("Fiscalia de Salto 1º");
            } else if (mes == 1  &&   dia == 2 ||dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                tv1.setText( "Fiscalia de Salto 2º");
            } else if (mes == 1  && dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia == 15 ) {
                tv1.setText("Fiscalia de Salto 3º");
            } else if (mes == 1  &&  dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21|| dia == 22 ){
                tv1.setText("Fiscalia de Salto 4º");
            } else if (mes == 1  &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ) {
                tv1.setText("Fiscalia de Salto 1º");
            } else if (mes == 1  &&  dia == 30 || dia == 31 )
                tv1.setText("Fiscalia de Salto 2º");

                break;




            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 2  &&  dia == 6  ||dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  || dia == 12  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 2  &&   dia == 13|| dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 2  &&  dia == 20  ||dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25 ||dia == 26)  {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 2  && dia == 27  || dia ==  28 || dia ==  29  )
                    tv1.setText("Fiscalia de Salto 2º");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 3  && dia == 6 || dia == 7 || dia == 8  ||  dia == 9 || dia == 10 || dia == 11  ||  dia == 12) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 3  &&    dia == 13|| dia == 14 || dia == 15  ||   dia == 16 || dia == 17||dia == 18|| dia == 19   ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 3  && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26  ) {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 3  && dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText("Fiscalia de Salto 2º");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2  ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 4 && dia == 3  ||dia == 4 || dia == 5  || dia == 6 || dia == 7   || dia == 8 ||dia == 9  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 4  &&   dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 4  &&   dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ||  dia == 22 ||dia == 23  ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 4  &&  dia == 24 ||dia == 25 || dia == 26  || dia == 27 || dia ==  28    ||dia == 29 ||dia == 30  )
                    tv1.setText("Fiscalia de Salto 2º");
                break;

            case 5:
                if (mes == 5  &&  dia == 1  ||  dia == 2 || dia == 3  || dia == 4 || dia == 5 ||dia == 6 ||dia == 7    ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 5  && dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 5  &&  dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19   || dia == 20 ||dia == 21  ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 5  && dia == 22  ||dia == 23 || dia == 24  ||   dia == 25 || dia == 26 || dia == 27|| dia ==  28   ){
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 5  && dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Salto 3º");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2   || dia  == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 6  &&   dia == 5||dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ||  dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 6 &&  dia == 12||dia == 13 || dia == 14 || dia ==  15 || dia == 16|| dia == 17 ||  dia == 18  ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 6  && dia == 19 ||dia == 20 || dia == 21   ||  dia == 22 || dia == 23 ||  dia == 24 ||dia == 25     ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 6  &&  dia == 26|| dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia de Salto 3º");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 7 &&   dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia ==  15  ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 7  &&    dia == 16 ) {
                    tv1.setText( "Fiscalia de Salto 4°");
                } else if (mes == 7  &&    dia == 17||dia == 18 || dia == 19|| dia == 20 || dia == 21 ||dia == 22 ||  dia == 23    ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 7  &&   dia == 24 ||dia == 25 || dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30   ){
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 7  &&    dia == 31 )
                    tv1.setText("Fiscalia de Salto 3º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ||dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 8  &&    dia == 7  ||  dia == 8 || dia == 9   || dia == 10 || dia == 11  ||dia == 12 || dia == 13  ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 8  &&   dia == 14 || dia  ==  15 || dia == 16||   dia == 17 || dia == 18 ||  dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 8  &&   dia == 21 ||  dia == 22 || dia == 23  ||  dia == 24  || dia == 25  || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de Salto 2º");
                } else if (mes == 8  &&    dia ==  28  ||dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia de Salto 3º");
                break;

            case 9:
                if (mes == 9 && dia == 1  || dia == 2  || dia  == 3 ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 9  &&     dia == 4 ||dia == 5 || dia == 6 ||dia == 7 || dia == 8 ||  dia == 9 || dia == 10   ) {
                    tv1.setText( "Fiscalia de Salto 4º");
                } else if (mes == 9 &&      dia == 11||  dia == 12 ||dia == 13|| dia == 14  || dia ==  15  ||   dia == 16 || dia == 17   ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 9  &&  dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 ||  dia == 23 || dia == 24    ) {
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 9  &&   dia == 25||  dia == 26 || dia == 27 ||  dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText("Fiscalia de Salto 3º");



                break;

            case 10:
                if (mes == 10 && dia == 1   ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 10  &&   dia == 2 || dia == 3 || dia == 4   ||  dia == 5 || dia == 6 ||dia == 7 || dia == 8     ) {
                    tv1.setText( "Fiscalia de Salto 4º");
                } else if (mes == 10  &&dia == 9  ||  dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13||dia == 14 || dia  ==  15  ) {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 10  &&   dia == 16||dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22 ){
                    tv1.setText("Fiscalia de Salto 2º");
                } else if (mes == 10  &&  dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27|| dia ==  28 || dia == 29   ){
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 10  &&  dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Salto 4º");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 11  &&  dia == 6||dia == 7 || dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12  ) {
                    tv1.setText("Fiscalia de Salto 1º");
                } else if (mes == 11  &&    dia == 13 || dia == 14 || dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19   ) {
                    tv1.setText( "Fiscalia de Salto 2º");
                } else if (mes == 11  &&  dia == 20 || dia == 21 ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 11  &&   dia == 27  ||dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia de Salto 4º");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3  ) {
                    tv1.setText( "Fiscalia de Salto 4º");
                } else if (mes == 12  && dia == 4   || dia == 5 || dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de Salto 1º");
                } else if (mes == 12 &&  dia == 11  || dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17  ) {
                    tv1.setText( "Fiscalia de Salto 2º");
                } else if (mes == 12  &&    dia == 18 || dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  ) {
                    tv1.setText("Fiscalia de Salto 3º");
                } else if (mes == 12  &&dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText( "Fiscalia de Salto 4º");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void Salto2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 ) {
                tv1.setText( "Fiscalia de Salto  4º");
            } else if (mes == 1  &&   dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia de Salto  1º");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21) {
                tv1.setText("Fiscalia de Salto  2º");
            } else if (mes == 1  && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText("Fiscalia de Salto  3º");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4  ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 2  &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  ) {
                    tv1.setText( "Fiscalia de Salto  1º");
                } else if (mes == 2  &&   dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18  ) {
                    tv1.setText("Fiscalia de Salto  2º");
                } else if (mes == 2  &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia de Salto  3º");
                } else if (mes == 2  &&  dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia de Salto  4º");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 3  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||  dia == 9 || dia == 10   ) {
                    tv1.setText( "Fiscalia de Salto  1º");
                } else if (mes == 3  &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ||   dia == 16 || dia == 17  ) {
                    tv1.setText("Fiscalia de Salto  2º");
                } else if (mes == 3  && dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  ) {
                    tv1.setText("Fiscalia de Salto  3º");
                } else if (mes == 3  &&dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de Salto  4º");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Salto  1º");
                } else if (mes == 4 &&    dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de Salto  2º");
                } else if (mes == 4  &&   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText("Fiscalia de Salto  3º");
                } else if (mes == 4  &&   dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 || dia ==  28 ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 4  &&   dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Salto  1º");
                break;

            case 5:
                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  || dia == 4 || dia == 5 ) {
                    tv1.setText( "Fiscalia de Salto  1º");
                } else if (mes == 5  &&   dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia de Salto  2º");
                } else if (mes == 5  &&   dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia de Salto  3º");
                } else if (mes == 5  &&    dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||   dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 5  && dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Salto  1º");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2  ) {
                    tv1.setText("Fiscalia de Salto  1º");
                } else if (mes == 6  &&  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||  dia == 8 || dia == 9  ) {
                    tv1.setText("Fiscalia de Salto  2º");
                } else if (mes == 6 &&  dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15 || dia == 16  ) {
                    tv1.setText( "Fiscalia de Salto  3º");
                } else if (mes == 6  &&dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21   ||  dia == 22 || dia == 23     ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 6  &&  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia de Salto  1º");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de Salto  2º");
                } else if (mes == 7 &&   dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de Salto  3º");
                } else if (mes == 7  &&   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19|| dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 7  && dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26|| dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia de Salto  1º");
                } else if (mes == 7  &&  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText("Fiscalia de Salto  2º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia de Salto  2º");
                } else if (mes == 8  &&     dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia de Salto  3º");
                } else if (mes == 8  &&    dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16||   dia == 17 || dia == 18    ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 8  &&   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||  dia == 24  || dia == 25  ) {
                    tv1.setText( "Fiscalia de Salto  1º");
                } else if (mes == 8  &&   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia de Salto  2º");
                break;

            case 9:
                if (mes == 9 && dia == 1   ) {
                    tv1.setText("Fiscalia de Salto  2º");
                } else if (mes == 9  &&   dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 || dia == 8    ) {
                    tv1.setText( "Fiscalia de Salto  3º");
                } else if (mes == 9 &&      dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13|| dia == 14  || dia ==  15     ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 9  &&   dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22   ) {
                    tv1.setText("Fiscalia de Salto  1º");
                } else if (mes == 9  &&    dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||  dia ==  28 || dia == 29  ) {
                    tv1.setText("Fiscalia de Salto  2º");
                } else if (mes == 9  &&     dia == 30   )
                    tv1.setText("Fiscalia de Salto  3º");


                break;

            case 10:
                if (mes == 10 && dia == 1 ||  dia == 2 || dia == 3 || dia == 4   ||  dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia de Salto  3º");
                } else if (mes == 10  &&  dia == 7 || dia == 8||dia == 9 || dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13     ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 10  &&  dia == 14 || dia  ==  15||dia == 16 || dia == 17 || dia == 18  ||  dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia de Salto  1º");
                } else if (mes == 10  &&    dia == 21 || dia == 22|| dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 ){
                    tv1.setText("Fiscalia de Salto 2°");
                } else if (mes == 10  &&  dia ==  28 || dia == 29  || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Salto 3°");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia de Salto  3º");
                } else if (mes == 11  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||dia == 9 || dia == 10   ) {
                    tv1.setText("Fiscalia de Salto 4º");
                } else if (mes == 11  &&    dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15||  dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de Salto  1º");
                } else if (mes == 11  &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||dia == 23 || dia == 24  ) {
                    tv1.setText("Fiscalia de Salto 2°");
                } else if (mes == 11  &&    dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia de Salto  3º");


                break;

            case 12:

                if (mes == 12 && dia == 1  ) {
                    tv1.setText( "Fiscalia de Salto  3º");
                } else if (mes == 12  &&    dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6||   dia == 7 || dia == 8 ) {
                    tv1.setText( "Fiscalia de Salto  4º");
                } else if (mes == 12 &&    dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 ) {
                    tv1.setText( "Fiscalia de Salto  1º");
                } else if (mes == 12  &&     dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ) {
                    tv1.setText( "Fiscalia de Salto  2º");
                } else if (mes == 12  && dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29  ){
                    tv1.setText( "Fiscalia de Salto  3º");
                } else if (mes == 12  &&  dia == 30  || dia == 31   )
                    tv1.setText( "Fiscalia de Salto  4º");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }


    public void Salto2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de Salto  4° Turno");
            } else if (mes == 1  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia de Salto  1° Turno");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ) {
                tv1.setText( "Fiscalia de Salto  2° Turno");
            } else if (mes == 1  &&   dia == 20 || dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26  ){
                tv1.setText( "Fiscalia de Salto  3° Turno");
            } else if (mes == 1  &&    dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia de Salto  4° Turno");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 2  &&   dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16    ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 2  && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 2  &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                break;

            case 3:

                if ( dia == 1   || dia == 2 ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (   dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16   ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (   dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23  ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if ( dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29|| dia == 30   ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno") ;
                } else if (  dia == 31  )
                tv1.setText( "Fiscalia de Salto  1° Turno");




                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5|| dia == 6   ) {
                    tv1.setText("Fiscalia de Salto  1° Turno");
                } else if (mes == 4 &&    dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13  ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 4  &&   dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20   ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 4  &&   dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 4  &&    dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Salto  1° Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  || dia == 4 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 5  &&    dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  || dia == 11 ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 5  &&   dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ||dia == 18 ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 5  &&    dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 5  &&   dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Salto  1° Turno");



                break;
            case 6:
                if (mes == 6 && dia == 1   ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 6  &&   dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 6  &&    dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14||dia ==  15  ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 6 &&   dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21|| dia == 22 ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 6  &&     dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  || dia == 29   ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "Fiscalia de Salto  2° Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ||dia == 6 ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 7 &&   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13    ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 7  &&    dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 7  &&   dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 7  &&   dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de Salto  2° Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2 || dia == 3   ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 8  &&   dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ||dia == 10   ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 8  &&    dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16  ||  dia == 17  ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 8  &&   dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 8  &&  dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30|| dia == 31)
                    tv1.setText( "Fiscalia de Salto  2° Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 9  &&    dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 9 &&     dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 9  &&      dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Salto  3° Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4  || dia == 5    ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 10  &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  || dia == 12  ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 10  &&   dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 ||  dia == 26 ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Salto  3° Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1  || dia == 2 ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText("Fiscalia de Salto  4° Turno");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||  dia == 23   ) {
                    tv1.setText("Fiscalia de Salto  2° Turno");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Salto  3° Turno");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7  ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 12  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  || dia == 14    ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 12 &&    dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ||dia == 21   ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia == 28  ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 11  &&   dia == 29 || dia == 30  ||  dia == 31   )
                    tv1.setText( "Fiscalia de Salto  4° Turno");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }





    public void  Salto2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                tv1.setText( "Fiscalia de Salto  4° Turno");
            } else if (mes == 1  &&    dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11   ) {
                tv1.setText( "Fiscalia de Salto  1° Turno");
            } else if (mes == 1  &&   dia == 12||dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18   ) {
                tv1.setText( "Fiscalia de Salto  2° Turno");
            } else if (mes == 1  &&  dia == 19 ||  dia == 20 || dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25   ){
                tv1.setText( "Fiscalia de Salto  3° Turno");
            } else if (mes == 1  &&  dia == 26  || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia de Salto  4° Turno");
                break;

            case 2:

                if (mes == 2 && dia == 1   ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 2  &&  dia == 2  ||dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 2  && dia == 9   || dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15     ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 2  &&  dia == 16||dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22  ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 2  && dia == 23 ||  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                break;

            case 3:
                if ( dia == 1  ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if ( dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if ( dia == 9 ||dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (dia == 16|| dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22   ) {
                    tv1.setText("Fiscalia de Salto  3° Turno");
                } else if (dia == 23||dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29)
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                else if ( mes == 3  &&   (    dia == 30||dia == 31))
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                break;


            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia de Salto  1° Turno");
                } else if (mes == 4 &&  dia == 6   || dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 4  &&   dia == 13  ||dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19    ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 4  &&  dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 4  &&   dia == 27 || dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Salto  1° Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 5  &&    dia == 4  || dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 5  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17   ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 5  &&    dia == 18||dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 5  && dia == 25  || dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Salto  1° Turno");



                break;
            case 6:
                if (mes == 6 && dia == 1  || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 6 &&dia ==  15   || dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 6  && dia == 22   ||  dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28     ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 6  &&  dia == 29  || dia == 30  )
                    tv1.setText( "Fiscalia de Salto  2° Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 7 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 7  &&  dia == 13   || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 7  && dia == 20  ||  dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 7  && dia == 27   ||  dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de Salto  2° Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 8  &&dia == 3   ||   dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 8  &&  dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 8  &&  dia == 17  ||  dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 8  && dia == 24 ||  dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30|| dia == 31){
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 8  &&  dia == 31)
                    tv1.setText( "Fiscalia de Salto  3° Turno");

                break;


            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 9  &&  dia == 7  ||  dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13  ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 9 &&    dia == 14  ||   dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 9  &&  dia == 21   ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 9  &&  dia ==  28    ||   dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Salto  3° Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4   ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 10  && dia == 5   ||   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 10  &&  dia == 12    ||dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 10  &&  dia == 19 ||  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 10  &&    dia == 26   ||dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de Salto  3° Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1  ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 11  &&   dia == 2 ||dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText("Fiscalia de Salto  4° Turno");
                } else if (mes == 11  &&  dia == 9  || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22   ) {
                    tv1.setText("Fiscalia de Salto  2° Turno");
                } else if (mes == 11  &&  dia == 23   ||dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29    ){
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 11  &&  dia == 30   )
                    tv1.setText( "Fiscalia de Salto  4° Turno");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de Salto  4° Turno");
                } else if (mes == 12  &&  dia == 7   || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13    ) {
                    tv1.setText( "Fiscalia de Salto  1° Turno");
                } else if (mes == 12 &&   dia == 14   || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Salto  2° Turno");
                } else if (mes == 12  &&  dia == 21 ||   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia de Salto  3° Turno");
                } else if (mes == 12  && dia == 28 ||  dia == 29 || dia == 30  ||  dia == 31   )
                    tv1.setText( "Fiscalia de Salto  4° Turno");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }








    public void SanCarlos2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {


            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 11  &&  dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12 || dia == 13  ||  dia == 14 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 11  &&   dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19 || dia == 20  || dia == 21) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 11  &&   dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27||dia ==  28  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 11  &&     dia == 29 ||  dia == 30  )
                    tv1.setText( "Fiscalia de  San Carlos 2º");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3 || dia == 4   ||dia == 5 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 12  &&   dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11  ||dia == 12  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 12 &&   dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18||  dia == 19 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 12  &&     dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  || dia == 25 ||dia == 26 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 12  &&  dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText(  "Fiscalia de  San Carlos 2º");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void SanCarlos2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 ) {
                tv1.setText( "Fiscalia de  San Carlos 2º");
            } else if (mes == 1  &&   dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                tv1.setText(  "Fiscalia de  San Carlos 1º");
            } else if (mes == 1  &&  dia == 10 || dia == 11 || dia == 12 ||dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                tv1.setText( "Fiscalia de  San Carlos 2º");
            } else if (mes == 1  && dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21 ||dia == 22 || dia == 23  ) {
                tv1.setText( "Fiscalia de  San Carlos 1º");
            } else if (mes == 1  &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31){
                tv1.setText( "Fiscalia de  San Carlos 2º");
            } else if (mes == 1  &&  dia == 31)
                tv1.setText( "Fiscalia de  San Carlos 1º");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 || dia == 5 || dia == 6   ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 2  &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  || dia == 12 || dia == 13 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 2  &&   dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 2  &&  dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25 ||dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 2  &&   dia ==  28  )
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 3  &&  dia == 7 || dia == 8  ||  dia == 9 || dia == 10 || dia == 11  ||  dia == 12 || dia == 13) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 3  &&   dia == 14 || dia == 15  ||   dia == 16 || dia == 17||dia == 18|| dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 3  &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 3  &&  dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 4 && dia == 4 || dia == 5  || dia == 6 || dia == 7   || dia == 8 ||dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 4  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 4  &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 4  && dia == 25 || dia == 26  || dia == 27 || dia ==  28    ||dia == 29 ||dia == 30  )
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                break;

            case 5:
                if  (mes == 5 && dia == 1  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 5  &&   dia == 2 || dia == 3  || dia == 4 || dia == 5 ||dia == 6 ||dia == 7  || dia == 8  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 5  &&  dia == 9 || dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 5  &&   dia == 16 || dia == 17 ||  dia == 18 || dia == 19   || dia == 20 ||dia == 21|| dia == 22  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 5  &&  dia == 23 || dia == 24  ||   dia == 25 || dia == 26 || dia == 27|| dia ==  28 || dia == 29  ){
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 5  &&  dia == 30 || dia == 31 )
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2   || dia  == 3 || dia == 4 || dia == 5) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 6  &&  dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ||  dia == 10 ||dia == 11 || dia == 12) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 6 && dia == 13 || dia == 14 || dia ==  15 || dia == 16|| dia == 17 ||  dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 6  && dia == 20 || dia == 21   ||  dia == 22 || dia == 23 ||  dia == 24 ||dia == 25 || dia == 26    ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 6  &&  dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 7 &&   dia == 4 || dia == 5  || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 7  &&  dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia ==  15  || dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 7  &&  dia == 18 || dia == 19|| dia == 20 || dia == 21 ||dia == 22 ||  dia == 23  ||  dia == 24   ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 7  && dia == 25 || dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de  San Carlos 2º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ||dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 8  &&      dia == 8 || dia == 9   || dia == 10 || dia == 11  ||dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 8  &&    dia  ==  15 || dia == 16||   dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 8  &&    dia == 22 || dia == 23  ||  dia == 24  || dia == 25  || dia == 26 || dia == 27 || dia ==  28) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 8  &&    dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                break;

            case 9:
                if (mes == 9 && dia == 1  || dia == 2  || dia  == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 9  &&    dia == 5 || dia == 6 ||dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11   ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 9 &&      dia == 12 ||dia == 13|| dia == 14  || dia ==  15  ||   dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 9  &&   dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 ||  dia == 23 || dia == 24  || dia == 25  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 9  &&    dia == 26 || dia == 27 ||  dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText( "Fiscalia de  San Carlos 1º");



                break;

            case 10:
                if (mes == 10 && dia == 1 ||  dia == 2   ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 10  &&  dia == 3 || dia == 4   ||  dia == 5 || dia == 6 ||dia == 7 || dia == 8||dia == 9      ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 10  &&   dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13||dia == 14 || dia  ==  15||dia == 16  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 10  &&   dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22|| dia == 23 ){
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 10  &&   dia == 24  || dia == 25 ||  dia == 26 || dia == 27|| dia ==  28 || dia == 29  || dia == 30 ){
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 10  &&   dia == 31 )
                    tv1.setText( "Fiscalia de  San Carlos 2º");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 11  && dia == 7 || dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12 || dia == 13   ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 11  &&   dia == 14 || dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 11  &&   dia == 21 ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 11  &&    dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText( "Fiscalia de  San Carlos 2º");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 12  &&    dia == 5 || dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 12 &&    dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 12  &&     dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  || dia == 25) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 12  &&  dia == 26 || dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText(  "Fiscalia de  San Carlos 2º");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }














    public void SanCarlos2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1) {
                tv1.setText(  "Fiscalia de  San Carlos 2º");
            } else if (mes == 1  &&   dia == 2  || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                tv1.setText(  "Fiscalia de  San Carlos 1º");
            } else if (mes == 1  && dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                tv1.setText( "Fiscalia de  San Carlos 2º");
            } else if (mes == 1  &&  dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21||dia == 22){
                tv1.setText( "Fiscalia de  San Carlos 1º");
            } else if (mes == 1  &&   dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ){
                tv1.setText( "Fiscalia de  San Carlos 2º");
            } else if (mes == 1  &&    dia == 30 || dia == 31)
                tv1.setText( "Fiscalia de  San Carlos 1º");
                break;
            case 2:


                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 2  &&  dia == 6  ||dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  || dia == 12  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 2  &&   dia == 13|| dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 2  &&  dia == 20  ||dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25 ||dia == 26)  {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 2  && dia == 27  || dia ==  28 || dia ==  29  )
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 3  && dia == 6 || dia == 7 || dia == 8  ||  dia == 9 || dia == 10 || dia == 11  ||  dia == 12) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 3  &&    dia == 13|| dia == 14 || dia == 15  ||   dia == 16 || dia == 17||dia == 18|| dia == 19   ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 3  && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 3  && dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 4 && dia == 3  ||dia == 4 || dia == 5  || dia == 6 || dia == 7   || dia == 8 ||dia == 9  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 4  &&   dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 4  &&   dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ||  dia == 22 ||dia == 23  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 4  &&  dia == 24 ||dia == 25 || dia == 26  || dia == 27 || dia ==  28    ||dia == 29 ||dia == 30  )
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                break;

            case 5:
                if (mes == 5  &&  dia == 1  ||  dia == 2 || dia == 3  || dia == 4 || dia == 5 ||dia == 6 ||dia == 7    ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 5  && dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 5  &&  dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19   || dia == 20 ||dia == 21  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 5  && dia == 22  ||dia == 23 || dia == 24  ||   dia == 25 || dia == 26 || dia == 27|| dia ==  28   ){
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 5  && dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2   || dia  == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 6  &&   dia == 5||dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ||  dia == 10 ||dia == 11 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 6 &&  dia == 12||dia == 13 || dia == 14 || dia ==  15 || dia == 16|| dia == 17 ||  dia == 18  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 6  && dia == 19 ||dia == 20 || dia == 21   ||  dia == 22 || dia == 23 ||  dia == 24 ||dia == 25     ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 6  &&  dia == 26|| dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 7 && dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 7  &&   dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia ==  15 || dia == 16 ) {
                    tv1.setText( "Fiscalia San Carlos 2°");
                } else if (mes == 7  &&    dia == 17||dia == 18 || dia == 19|| dia == 20 || dia == 21 ||dia == 22 ||  dia == 23    ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 7  &&   dia == 24 ||dia == 25 || dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30   ){
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 7  &&    dia == 31 )
                    tv1.setText( "Fiscalia de  San Carlos 1º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ||dia == 5 || dia == 6 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 8  &&    dia == 7  ||  dia == 8 || dia == 9   || dia == 10 || dia == 11  ||dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 8  &&   dia == 14 || dia  ==  15 || dia == 16||   dia == 17 || dia == 18 ||  dia == 19 || dia == 20  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 8  &&   dia == 21 ||  dia == 22 || dia == 23  ||  dia == 24  || dia == 25  || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 8  &&    dia ==  28  ||dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                break;

            case 9:
                if (mes == 9 && dia == 1  || dia == 2  || dia  == 3 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 9  &&     dia == 4 ||dia == 5 || dia == 6 ||dia == 7 || dia == 8 ||  dia == 9 || dia == 10   ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 9 &&      dia == 11||  dia == 12 ||dia == 13|| dia == 14  || dia ==  15  ||   dia == 16 || dia == 17   ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 9  &&  dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 ||  dia == 23 || dia == 24    ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 9  &&   dia == 25||  dia == 26 || dia == 27 ||  dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText( "Fiscalia de  San Carlos 1º");



                break;

            case 10:
                if (mes == 10 && dia == 1   ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 10  &&   dia == 2 || dia == 3 || dia == 4   ||  dia == 5 || dia == 6 ||dia == 7 || dia == 8     ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 10  &&dia == 9  ||  dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13||dia == 14 || dia  ==  15  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 10  &&   dia == 16||dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22 ){
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 10  &&  dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27|| dia ==  28 || dia == 29   ){
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 10  &&  dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de  San Carlos 2º");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 11  &&  dia == 6||dia == 7 || dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 11  &&    dia == 13 || dia == 14 || dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19   ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 11  &&  dia == 20 || dia == 21 ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 11  &&   dia == 27  ||dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText( "Fiscalia de  San Carlos 2º");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 12  && dia == 4   || dia == 5 || dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 12 &&  dia == 11  || dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 12  &&    dia == 18 || dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 12  &&dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText(  "Fiscalia de  San Carlos 2º");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }












    public void SanCarlos2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7  ) {
                tv1.setText(  "Fiscalia de  San Carlos 1º");
            } else if (mes == 1  &&  dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14) {
                tv1.setText(  "Fiscalia de  San Carlos 2º");
            } else if (mes == 1  &&  dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ||  dia == 20 || dia == 21) {
                tv1.setText( "Fiscalia de  San Carlos 1º");
            } else if (mes == 1  && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                tv1.setText( "Fiscalia de  San Carlos 2º");
            } else if (mes == 1  &&  dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia de  San Carlos 1º");


                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 2  && dia == 5  ||  dia == 6 || dia == 7 || dia == 8 || dia == 9 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 2  &&   dia == 10 ||  dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 2  &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 2  &&  dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 3  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||  dia == 9 || dia == 10 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 3  &&  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ||   dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 3  && dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 3  && dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 4 &&    dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 4  &&   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 4  &&   dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 || dia ==  28 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 4  &&   dia == 29 ||dia == 30  )
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                break;

            case 5:
                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  || dia == 4 || dia == 5 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 5  &&   dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 5  &&   dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 5  &&    dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||   dia == 25 || dia == 26   ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 5  && dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 6  &&  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||  dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 6 &&  dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15 || dia == 16  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 6  &&dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21   ||  dia == 22 || dia == 23     ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 6  &&  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 7 &&   dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 7  &&   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19|| dia == 20 || dia == 21 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 7  && dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26|| dia == 27 || dia ==  28  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 7  &&  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de  San Carlos 1º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de  San Carlos 11º");
                } else if (mes == 8  &&     dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   || dia == 10 || dia == 11 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 8  &&    dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16||   dia == 17 || dia == 18    ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 8  &&   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||  dia == 24  || dia == 25  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 8  &&   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                break;

            case 9:
                if (mes == 9 && dia == 1   ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 9  &&   dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 || dia == 8    ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 9 &&      dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13|| dia == 14  || dia ==  15     ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 9  &&   dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22   ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 9  &&    dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||  dia ==  28 || dia == 29  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 9  &&     dia == 30   )
                    tv1.setText( "Fiscalia de  San Carlos 2º");


                break;

            case 10:
                if (mes == 10 && dia == 1 ||  dia == 2 || dia == 3 || dia == 4   ||  dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 10  &&  dia == 7 || dia == 8||dia == 9 || dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13     ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 10  &&  dia == 14 || dia  ==  15||dia == 16 || dia == 17 || dia == 18  ||  dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 10  &&    dia == 21 || dia == 22|| dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 ){
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 10  &&  dia ==  28 || dia == 29  || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de  San Carlos 2º");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de  San Carlos 2º");
                } else if (mes == 11  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||dia == 9 || dia == 10   ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 11  &&    dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15||  dia == 16 || dia == 17 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 11  &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||dia == 23 || dia == 24  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 11  &&    dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText( "Fiscalia de  San Carlos 2º");


                break;

            case 12:

                if (mes == 12 && dia == 1  ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 12  &&    dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6||   dia == 7 || dia == 8 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 1º");
                } else if (mes == 12 &&    dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 ) {
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 12  &&     dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ) {
                    tv1.setText( "Fiscalia de  San Carlos 1º");
                } else if (mes == 12  && dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29  ){
                    tv1.setText(  "Fiscalia de  San Carlos 2º");
                } else if (mes == 12  &&  dia == 30  || dia == 31   )
                    tv1.setText(  "Fiscalia de  San Carlos 1º");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }





    public void SanCarlos2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de San Carlos 1°");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "Fiscalia de San Carlos 2°");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "Fiscalia de San Carlos 1° ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "Fiscalia de San Carlos 2°");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de San Carlos 1° ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de San Carlos 1°");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 3  &&    dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8||dia == 9    ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 3  &&  dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 3  &&   dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ||  dia == 23 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 3  &&dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                }  else if (mes == 3  &&  dia == 31   )
                    tv1.setText( "Fiscalia de San Carlos 2°");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 4 && dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12  || dia == 13 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 4  &&dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 4  &&  dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 4  &&  dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de San Carlos 2°");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3   || dia == 4 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 5  &&  dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ||dia == 11 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 5  &&   dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 5  &&dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de San Carlos 2°");




                break;
            case 6:
                if (mes == 6 && dia == 1  ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 6  &&   dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 6  &&   dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 6 &&    dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21  || dia == 22) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 6  &&   dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  ||  dia == 29 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 6  &&  dia == 30  )
                    tv1.setText( "Fiscalia de San Carlos 1°");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 7 && dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||dia == 13 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 7  && dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19|| dia == 20 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 7  &&  dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 7  && dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de San Carlos 1°");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 8  &&  dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9|| dia == 10   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 8  &&   dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16 ||dia == 17    ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 8  && dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||dia == 24   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 8  &&  dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31   )
                    tv1.setText( "Fiscalia de San Carlos 1°");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||  dia == 7 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 9  &&  dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13   ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 9 &&   dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20    || dia == 21   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 9  &&    dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||  dia ==  28) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 9  &&     dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de San Carlos 2°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4   ||  dia == 5  ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 10  &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  ||  dia == 12  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 10  && dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19  ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 10  &&     dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25  || dia == 26   ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 10  &&  dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de San Carlos 2°");

                break;

            case 11:

                if (mes == 11 && dia == 1  ||  dia == 2   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 11  && dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||  dia == 9 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  || dia == 16) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 11  &&     dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29||   dia == 30  )
                    tv1.setText( "Fiscalia de San Carlos 2°");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 12  &&     dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13   || dia == 14  ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 12 &&     dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21   ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 12  &&    dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27||dia == 28    )   {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 12  &&   dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de San Carlos 1°");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }






    public void SanCarlos2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4  ) {
                tv1.setText( "Fiscalia de San Carlos 1°");
            } else if (mes == 1  &&  dia == 5  ||dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11  ) {
                tv1.setText( "Fiscalia de San Carlos 2°");
            } else if (mes == 1  &&  dia == 12   ||dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18  ) {
                tv1.setText( "Fiscalia de San Carlos 1° ");
            } else if (mes == 1  &&   dia == 19 ||dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25    ) {
                tv1.setText( "Fiscalia de San Carlos 2°");
            } else if (mes == 1  &&  dia == 26|| dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de San Carlos 1° ");

                break;

            case 2:

                if (mes == 2 && dia == 1   ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 2  &&   dia == 2 ||dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8    ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 2  &&  dia == 9 ||dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 2  && dia == 16  ||dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 2  && dia == 23  || dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de San Carlos 1°");
                break;

            case 3:

                if (mes == 3 && dia == 1   ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 3  &&    dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 3  &&dia == 9 ||   dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 3  &&   dia == 16|| dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 3  &&  dia == 23 ||dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                }  else if (mes == 3  &&  dia == 30  || dia == 31   )
                    tv1.setText( "Fiscalia de San Carlos 2°");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 4 && dia == 6 ||dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 4  &&  dia == 13 ||dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 4  &&  dia == 20 ||dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 4  &&  dia == 27 ||dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de San Carlos 2°");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3    ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 5  &&  dia == 4|| dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 5  &&  dia == 11|| dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 5  &&   dia == 18  || dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 5  &&dia == 25|| dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de San Carlos 2°");




                break;
            case 6:
                if (mes == 6 && dia == 1  ||dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 6  &&    dia == 8|| dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 6 &&  dia ==  15  || dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 6  &&  dia == 22 || dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 6  &&   dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de San Carlos 1°");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 7 && dia == 6  || dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 7  &&  dia == 13 ||dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 7  && dia == 20 || dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 7  &&dia == 27 ||  dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de San Carlos 1°");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 8  &&  dia == 3 ||dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 8  && dia == 10 ||  dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16    ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 8  &&dia == 17 || dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23    ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 8  && dia == 24 || dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31 ){
                    tv1.setText( "Fiscalia de San Carlos 1°");
                  } else if (mes == 8  &&   dia == 31   )
                    tv1.setText( "Fiscalia de San Carlos 2°");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 9  &&  dia == 7  || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13     ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 9 && dia == 14   ||  dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20       ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 9  &&   dia == 21  ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 9  &&     dia ==  28  || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de San Carlos 2°");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4    ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 10  &&   dia == 5  || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 10  && dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 10  && dia == 19   ||   dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25     ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 10  &&dia == 26  || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de San Carlos 2°");

                break;

            case 11:

                if (mes == 11 && dia == 1   ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 11  && dia == 2  ||  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 11  &&   dia == 9  ||dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 11  &&  dia == 16  ||dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 11  &&    dia == 23  ||dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29  ){
                    tv1.setText( "Fiscalia de San Carlos 2°");
                  } else if (mes == 11  &&      dia == 30  )
                  tv1.setText( "Fiscalia de San Carlos 1°");



                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 12  &&dia == 7    ||  dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13    ) {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 12 &&    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20    ) {
                    tv1.setText( "Fiscalia de San Carlos 1°");
                } else if (mes == 12  && dia == 21   ||dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   )   {
                    tv1.setText( "Fiscalia de San Carlos 2°");
                } else if (mes == 12  &&  dia == 28 || dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de San Carlos 1°");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









}