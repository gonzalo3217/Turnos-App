package com.example.turnosapp;



import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        et1 = (EditText) findViewById(R.id.editTextNumber);
        et2 = (EditText) findViewById(R.id.editTextNumber3);
        tv1 = (TextView) findViewById(R.id.textView7);
    }


    public void Atlantida2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {


            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 11 &&  dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11  || dia == 12 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 11 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18 ||dia == 19) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 11 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25||dia == 26  ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 11 &&   dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de Atlàntida 2º");

                break;

            case 12:
                if (dia == 1 ||dia == 2||dia == 3 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10  ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ||dia == 17)  {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if ( dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ||dia == 24) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 1º");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }




    public void Atlantida2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if ( dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if ( dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if ( dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if ( dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 1º");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 2 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 2 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 2 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 2 &&  dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia de Atlàntida  1º");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 3 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 3 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 3 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 3 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 1º");
                break;
            case 4:
                if (mes == 4 && dia == 1  ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 4 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 4 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 4 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 4 &&  dia == 30)
                    tv1.setText("Fiscalia de Atlàntida  2º");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 5 &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 5 &&  dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 5 &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia ==  26 || dia == 27 ) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 5 &&  dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 1º");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 6 &&  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 6 &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 ) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 6 &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 6 &&  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de Atlàntida 2º");
                break;
            case 7:
                if (mes == 7 && dia == 1 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 7 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 7 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 7 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21||dia == 22 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 7 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 7 &&  dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 1º");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 8 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 8 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 8 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ||dia == 26) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 8 &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 1º");
                break;

            case 9:
                if (mes == 9 && dia == 1||dia == 2 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 9 &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ||dia == 9) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 9 &&  dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 9 &&  dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 9 &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de Atlàntida  1º");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 10 &&  dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 10 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||  dia == 21) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 10 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 10 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 2º");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 11 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 11 &&  dia == 12  || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 11 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 ) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 11 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de Atlàntida  2º");

                break;

            case 12:
                if (dia == 1 ||dia == 2) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16)  {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)  {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if ( dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 1º");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }






    public void Atlantida2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida  1º");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 2 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 2 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 2 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 2 && dia == 25 || dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia de Atlàntida 1º");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 3 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 3 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 3 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 3 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 1º");
                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 4 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 4 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 4 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 4 && dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de Atlàntida 2º");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 5 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 5 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 5 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 5 && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 2º");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 6 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 6 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 6 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 6 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de Atlàntida  2º");
                break;
            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 7 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 7 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 7 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida 1º");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 8 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 8 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 8 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 8 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida  1º");
                break;

            case 9:
                if (mes == 9 && dia == 1) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 9 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 9 && dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 9 && dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 9 && dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 9 && dia == 30)
                    tv1.setText("Fiscalia de Atlàntida 2º");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 10 && dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 10 && dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 10 && dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 10 && dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida  2º");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (mes == 11 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (mes == 11 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (mes == 11 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia de Atlàntida  1º");
                } else if (mes == 11 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de Atlàntida 2º");

                break;

            case 12:
                if (dia == 1) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia de Atlàntida  2º");
                } else if (dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia de Atlàntida 1º");
                } else if (dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia de Atlàntida 2º");
                } else if (dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de Atlàntida  1º");
                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }








    public void Atlántida2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de Atlántida 1");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "Fiscalia de Atlántida 2");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "Fiscalia de Atlántida 1 ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "Fiscalia de Atlántida 2");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de Atlántida 1 ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia de Atlántida 1");
                break;

            case 3:

                if (mes == 3 && dia == 1   ) {
                    tv1.setText( "Fiscalia deAtlántida 1");
                } else if (mes == 3  &&    dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 3  &&  dia == 9 || dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 3  &&   dia == 16 || dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 3  &&dia == 23 || dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                }  else if (mes == 3  &&  dia == 30 || dia == 31   )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 4 &&dia == 6 || dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 4  && dia == 13 || dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 4  && dia == 20 || dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 4  && dia == 27 || dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 5  &&   dia == 4 || dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 5  &&   dia == 11 || dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 5  &&   dia == 18 || dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 5  &&dia == 25 || dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 2");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 6 &&   dia ==  15 || dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 6  &&    dia == 22 || dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 6  &&   dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia de Atlántida 1");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 7 && dia == 6 || dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 7  && dia == 13 || dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 7  && dia == 20 || dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 7  &&dia == 27 || dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 1");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 8  &&  dia == 3 || dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 8  &&   dia == 10 || dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 8  && dia == 17 || dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 8  && dia == 24  || dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 8  &&    dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 9  &&   dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13    ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 9 &&    dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20     ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 9  &&    dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 9  &&     dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Atlántida 2");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4     ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 10  &&   dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 10  && dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 10  &&    dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 10  &&   dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;

            case 11:

                if (mes == 11 && dia == 1    ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 11  &&  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 11  &&  dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 11  &&    dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29   ){
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 11  &&    dia == 30   )
                    tv1.setText( "Fiscalia de Atlántida 1");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 12  &&    dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 12 &&      dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 12  &&   dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 )   {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 12  &&   dia == 28 ||  dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de Atlántida 1");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void Atlántida2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de Atlántida 1");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "Fiscalia de Atlántida 2");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "Fiscalia de Atlántida 1 ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "Fiscalia de Atlántida 2");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de Atlántida 1 ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de Atlántida 1");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia deAtlántida 1");
                } else if (mes == 3  &&    dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8||dia == 9    ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 3  &&  dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 3  &&   dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ||  dia == 23 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 3  &&dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                }  else if (mes == 3  &&  dia == 31   )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 4 && dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12  || dia == 13 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 4  &&dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 4  &&  dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 4  &&  dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3   || dia == 4 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 5  &&  dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ||dia == 11 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 5  &&   dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 5  &&dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 2");




                break;
            case 6:
                if (mes == 6 && dia == 1  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 6  &&   dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 6  &&   dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 6 &&    dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21  || dia == 22) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 6  &&   dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  ||  dia == 29 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 6  &&  dia == 30  )
                    tv1.setText( "Fiscalia de Atlántida 1");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 7 && dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||dia == 13 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 7  && dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19|| dia == 20 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 7  &&  dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 7  && dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 1");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 8  &&  dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9|| dia == 10   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 8  &&   dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16 ||dia == 17    ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 8  && dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||dia == 24   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 8  &&  dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31   )
                    tv1.setText( "Fiscalia de Atlántida 1");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||  dia == 7 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 9  &&  dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13   ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 9 &&   dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20    || dia == 21   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 9  &&    dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||  dia ==  28) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 9  &&     dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Atlántida 2");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4   ||  dia == 5  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 10  &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  ||  dia == 12  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 10  && dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 10  &&     dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25  || dia == 26   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 10  &&  dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;

            case 11:

                if (mes == 11 && dia == 1  ||  dia == 2   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 11  && dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||  dia == 9 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  || dia == 16) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 11  &&     dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29||   dia == 30  )
                    tv1.setText( "Fiscalia de Atlántida 2");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 12  &&     dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13   || dia == 14  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 12 &&     dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 12  &&    dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27||dia == 28    )   {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 12  &&   dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de Atlántida 1");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }





    public void Atlántida2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4  ) {
                tv1.setText( "Fiscalia de Atlántida 1");
            } else if (mes == 1  &&  dia == 5  ||dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11  ) {
                tv1.setText( "Fiscalia de Atlántida 2");
            } else if (mes == 1  &&  dia == 12   ||dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18  ) {
                tv1.setText( "Fiscalia de Atlántida 1 ");
            } else if (mes == 1  &&   dia == 19 ||dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25    ) {
                tv1.setText( "Fiscalia de Atlántida 2");
            } else if (mes == 1  &&  dia == 26|| dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de Atlántida 1 ");

                break;

            case 2:

                if (mes == 2 && dia == 1   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 2  &&   dia == 2 ||dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8    ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 2  &&  dia == 9 ||dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 2  && dia == 16  ||dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 2  && dia == 23  || dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de Atlántida 1");
                break;

            case 3:

                if (mes == 3 && dia == 1   ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 3  &&    dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 3  &&dia == 9 ||   dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 3  &&   dia == 16|| dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 3  &&  dia == 23 ||dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                }  else if (mes == 3  &&  dia == 30  || dia == 31   )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 4 && dia == 6 ||dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 4  &&  dia == 13 ||dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 4  &&  dia == 20 ||dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 4  &&  dia == 27 ||dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3    ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 5  &&  dia == 4|| dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 5  &&  dia == 11|| dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 5  &&   dia == 18  || dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 5  &&dia == 25|| dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 2");




                break;
            case 6:
                if (mes == 6 && dia == 1  ||dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 6  &&    dia == 8|| dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 6 &&  dia ==  15  || dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 6  &&  dia == 22 || dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 6  &&   dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de Atlántida 1");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 7 && dia == 6  || dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 7  &&  dia == 13 ||dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 7  && dia == 20 || dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 7  &&dia == 27 ||  dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 1");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 8  &&  dia == 3 ||dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 8  && dia == 10 ||  dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16    ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 8  &&dia == 17 || dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23    ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 8  && dia == 24 || dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31 ){
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 8  &&   dia == 31   )
                    tv1.setText( "Fiscalia de Atlántida 2");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 9  &&  dia == 7  || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13     ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 9 && dia == 14   ||  dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20       ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 9  &&   dia == 21  ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 9  &&     dia ==  28  || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de Atlántida 2");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4    ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 10  &&   dia == 5  || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 10  && dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 10  && dia == 19   ||   dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25     ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 10  &&dia == 26  || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de Atlántida 2");

                break;

            case 11:

                if (mes == 11 && dia == 1   ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 11  && dia == 2  ||  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 11  &&   dia == 9  ||dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 11  &&  dia == 16  ||dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 11  &&    dia == 23  ||dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29  ){
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 11  &&      dia == 30  )
                    tv1.setText( "Fiscalia de Atlántida 1");



                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 12  &&dia == 7    ||  dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13    ) {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 12 &&    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20    ) {
                    tv1.setText( "Fiscalia de Atlántida 1");
                } else if (mes == 12  && dia == 21   ||dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   )   {
                    tv1.setText( "Fiscalia de Atlántida 2");
                } else if (mes == 12  &&  dia == 28 || dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de Atlántida 1");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void CdelaCosta2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {


            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 11 &&  dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11  || dia == 12 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 11 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18 ||dia == 19) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 11 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25||dia == 26  ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 11 &&   dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("F. Ciudad de la Costa 2º");

                break;

            case 12:
                if (dia == 1 ||dia == 2||dia == 3 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10  ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ||dia == 17)  {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if ( dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ||dia == 24) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 3º");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }









    public void CdelaCosta2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if ( dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if ( dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if ( dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if ( dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 2º");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 2 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 2 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 2 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 2 &&  dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("F. Ciudad de la Costa 3º");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 3 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 3 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 3 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 3 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 1º");
                break;
            case 4:
                if (mes == 4 && dia == 1  ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 4 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 4 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 4 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 4 &&  dia == 30)
                    tv1.setText("F. Ciudad de la Costa 3º");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 5 &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 5 &&  dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 5 &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia ==  26 || dia == 27 ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 5 &&  dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 1º");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 6 &&  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 6 &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 6 &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 6 &&  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("F. Ciudad de la Costa 2º");
                break;
            case 7:
                if (mes == 7 && dia == 1 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 7 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 7 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 7 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21||dia == 22 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 7 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 7 &&  dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 1º");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 8 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 8 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 8 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ||dia == 26) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 8 &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 2º");
                break;

            case 9:
                if (mes == 9 && dia == 1||dia == 2 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 9 &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ||dia == 9) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 9 &&  dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 9 &&  dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 9 &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("F. Ciudad de la Costa 3º");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 10 &&  dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 10 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||  dia == 21) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 10 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 10 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 2º");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 11 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 11 &&  dia == 12  || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 11 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 ) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 11 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("F. Ciudad de la Costa 3º");

                break;

            case 12:
                if (dia == 1 ||dia == 2) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16)  {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)  {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if ( dia == 31)
                    tv1.setText("F. Ciudad de la Costa 1º");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }

    public void CdelaCosta2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 3º");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 2 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 2 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 2 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 2 && dia == 25 || dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("F. Ciudad de la Costa 1º");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 3 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 3 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 3 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 3 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 2º");
                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 4 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 4 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 4 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 4 && dia == 29 || dia == 30)
                    tv1.setText("F. Ciudad de la Costa 1º");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 5 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 5 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 5 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 5 && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 2º");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 6 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 6 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 6 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 6 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("F. Ciudad de la Costa 3º");
                break;
            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 7 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 7 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 7 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 2º");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 8 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 8 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 8 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 8 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 3º");
                break;

            case 9:
                if (mes == 9 && dia == 1) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 9 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 9 && dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 9 && dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 9 && dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 9 && dia == 30)
                    tv1.setText("F. Ciudad de la Costa 2º");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 10 && dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 10 && dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 10 && dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 10 && dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 3º");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 11 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (mes == 11 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (mes == 11 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (mes == 11 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("F. Ciudad de la Costa 1º");

                break;

            case 12:
                if (dia == 1) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("F. Ciudad de la Costa 3º");
                } else if (dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("F. Ciudad de la Costa 1º");
                } else if (dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("F. Ciudad de la Costa 2º");
                } else if (dia == 30 || dia == 31)
                    tv1.setText("F. Ciudad de la Costa 3º");
                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }









    public void CdelaCosta2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "F. de Ciudad de la Costa 3");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "F. de Ciudad de la Costa 1");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "F. de Ciudad de la Costa 2 ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "F. de Ciudad de la Costa 3 ");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "F. de Ciudad de la Costa  1 ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText( "F. de Ciudad de la Costa 1");
                break;

            case 3:

                if (mes == 3 && dia == 1   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 3  &&    dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 3  &&  dia == 9 || dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 3  &&   dia == 16 || dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22  ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 3  &&dia == 23 || dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29   ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                }  else if (mes == 3  &&  dia == 30 || dia == 31   )
                    tv1.setText( "F. de Ciudad de la Costa 3");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 4 &&dia == 6 || dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 4  && dia == 13 || dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 4  && dia == 20 || dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 4  && dia == 27 || dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "F. de Ciudad de la Costa 1");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 5  &&   dia == 4 || dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 5  &&   dia == 11 || dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 5  &&   dia == 18 || dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 5  &&dia == 25 || dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "F. de Ciudad de la Costa 2");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 6 &&   dia ==  15 || dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 6  &&    dia == 22 || dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 6  &&   dia == 29 || dia == 30  )
                    tv1.setText( "F. de Ciudad de la Costa 1");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 7 && dia == 6 || dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 7  && dia == 13 || dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 7  && dia == 20 || dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 7  &&dia == 27 || dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "F. de Ciudad de la Costa 2");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 8  &&  dia == 3 || dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 8  &&   dia == 10 || dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 8  && dia == 17 || dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 8  && dia == 24  || dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 8  &&    dia == 31 )
                    tv1.setText( "F. de Ciudad de la Costa 1");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 9  &&   dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13    ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 9 &&    dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20     ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 9  &&    dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 9  &&     dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "F. de Ciudad de la Costa 2");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4     ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 10  &&   dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 10  && dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 10  &&    dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 10  &&   dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "F. de Ciudad de la Costa 3");

                break;

            case 11:

                if (mes == 11 && dia == 1    ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 11  &&  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 11  &&  dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 11  &&    dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29   ){
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 11  &&    dia == 30   )
                    tv1.setText( "F. de Ciudad de la Costa 2");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 12  &&    dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 12 &&      dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 12  &&   dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 )   {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 12  &&   dia == 28 ||  dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "F. de Ciudad de la Costa 3");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }










    public void CdelaCosta2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "F. de Ciudad de la Costa 3");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "F. de Ciudad de la Costa 1");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "F. de Ciudad de la Costa 2 ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "F. de Ciudad de la Costa 3 ");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "F. de Ciudad de la Costa  1 ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "F. de Ciudad de la Costa 2");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 3  &&    dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 3  && dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ||  dia == 16 ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 3  && dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 3  && dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29  ||  dia == 30 ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                }  else if (mes == 3  &&  dia == 31   )
                    tv1.setText( "F. de Ciudad de la Costa 1");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 4 && dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13  ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 4  &&  dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 4  && dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 4  && dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "F. de Ciudad de la Costa 2");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ||dia == 4 ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 5  &&    dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10|| dia == 11  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 5  &&    dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||dia == 25  ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 5  && dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "F. de Ciudad de la Costa 3");




                break;
            case 6:
                if (mes == 6 && dia == 1  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 6  &&    dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 6  &&   dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 6 &&    dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 6  &&     dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28|| dia == 29  ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "F. de Ciudad de la Costa 2");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ||dia == 6   ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 7 &&  dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 7  && dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20 ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 7  &&  dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 7  && dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "F. de Ciudad de la Costa 3");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3  ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 8  &&   dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  || dia == 10) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 8  &&    dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   || dia == 17 ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 8  &&  dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  || dia == 24   ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 8  &&  dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText( "F. de Ciudad de la Costa 1");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7 ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 9  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||dia == 14 ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 9 &&    dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||dia ==  28   ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 9  &&   dia == 29 || dia == 30   )
                    tv1.setText( "F. de Ciudad de la Costa 3");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 10  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19  ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 10  &&     dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "F. de Ciudad de la Costa 1");

                break;

            case 11:

                if (mes == 11 && dia == 1 ||  dia == 2) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ||dia == 16 ) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 )
                    tv1.setText( "F. de Ciudad de la Costa 2");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||  dia == 7) {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 12  &&    dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ||  dia == 14   ) {
                    tv1.setText( "F. de Ciudad de la Costa 1");
                } else if (mes == 12 &&     dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20|| dia == 21    ) {
                    tv1.setText( "F. de Ciudad de la Costa 2");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27|| dia == 28   )   {
                    tv1.setText( "F. de Ciudad de la Costa 3");
                } else if (mes == 12  &&   dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "F. de Ciudad de la Costa 1");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }






    public void CdelaCosta2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();

        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de 1º. Turno");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "Fiscalia de 2º. Turno");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "Fiscalia de 3º. Turno ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "Fiscalia de 1º. Turno ");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de 2º. Turno ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de 3º. Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 3  &&    dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 3  && dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ||  dia == 16 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 3  && dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 3  && dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29  ||  dia == 30 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                }  else if (mes == 3  &&  dia == 31   )
                    tv1.setText( "Fiscalia de 2º. Turno");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 4 && dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 4  &&  dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 4  && dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 4  && dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de 3º. Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ||dia == 4 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 5  &&    dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10|| dia == 11  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 5  &&    dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||dia == 25  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 5  && dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 1º. Turno");




                break;
            case 6:
                if (mes == 6 && dia == 1  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 6  &&    dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 6  &&   dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 6 &&    dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 6  &&     dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28|| dia == 29  ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "Fiscalia de 3º. Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ||dia == 6   ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 7 &&  dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 7  && dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 7  &&  dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 7  && dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de 1º. Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 8  &&   dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  || dia == 10) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 8  &&    dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   || dia == 17 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 8  &&  dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  || dia == 24   ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 8  &&  dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText( "Fiscalia de 2º. Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 9  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||dia == 14 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 9 &&    dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||dia ==  28   ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 9  &&   dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de 1º. Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 10  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 10  &&     dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 2º. Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1 ||  dia == 2) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ||dia == 16 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 )
                    tv1.setText( "Fiscalia de 3º. Turno");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||  dia == 7) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 12  &&    dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 12 &&     dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20|| dia == 21    ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27|| dia == 28   )   {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 12  &&   dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de 2º. Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }






    public void DobleTurno2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {


            case 11:

                if (mes == 11 && dia == 1  || dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 11  &&   dia == 8  || dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 11  &&  dia == 15   || dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 11  &&  dia == 22 || dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 ||  dia ==  28  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 11  &&   dia == 29 ||  dia == 30    )
                    tv1.setText( "Fiscalia  de 1º Turno");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4  || dia == 5  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 12  &&   dia == 6 || dia == 7 || dia == 8  || dia == 9 || dia == 10 || dia == 11  || dia == 12  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 12 &&    dia == 13 ||  dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 12  &&     dia ==20  || dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 )   {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 12  &&  dia == 25 ||  dia == 26 || dia == 27|| dia == 28 ||  dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia  de 1º Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }














    public void DobleTurno2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 1 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 2do. Turno ");


                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia de 2do  . Turno");
                } else if (mes == 2 && dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11||dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 2 &&  dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia de 2do  . Turno");
                } else if (mes == 2 &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25|| dia == 26 || dia == 27 ) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 2 && dia == 28 )
                    tv1.setText("Fiscalia de 2do  . Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1 || dia == 2 || dia == 3|| dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia de1er. Turno");
                } else if (mes == 3 && dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 3 &&  dia == 14 || dia == 15 || dia == 16 || dia == 17||dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia de 2do  . Turno");
                } else if (mes == 3 &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 3 &&  dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 2do  . Turno");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia de 2dor . Turno");
                } else if (mes == 4 && dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 || dia == 9 || dia == 10 ) {
                    tv1.setText("Fiscalia de  1er  . Turno");
                } else if (mes == 4 && dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15 || dia == 16 || dia == 17 ) {
                    tv1.setText("Fiscalia de 2do . Turno");
                } else if (mes == 4 &&dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText("Fiscalia de 1er  . Turno");
                } else if (mes == 4 && dia == 25 || dia == 26 || dia == 27 || dia == 28 ||dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de 2do . Turno");

                break;

            case 5:

                if (mes == 5 && dia == 1) {
                    tv1.setText("Fiscalia de 2do . Turno");
                } else if (mes == 5 &&  dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 5 && dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 5 && dia == 16 || dia == 17 || dia == 18 || dia == 19|| dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 5 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26||dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 5 &&   dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 1er . Turno");


                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 ||dia == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 6 &&  dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia de 2do  . Turno");
                } else if (mes == 6 && dia == 13 || dia == 14 || dia == 15 || dia == 16 ||dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 6 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23|| dia == 24 || dia == 25 || dia == 26 ) {
                    tv1.setText("Fiscalia de 2do  . Turno");
                } else if (mes == 6 && dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de 1er . Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15) {
                    tv1.setText("Fiscalia de 2do . Turno");
                } else if (mes == 7 &&  dia == 16 || dia == 17  ) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 7 &&dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22|| dia == 23 || dia == 24 ) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 7 && dia == 25 || dia == 26 || dia == 27 || dia == 28 ||dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 1er. Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia de 2do  . Turno");
                } else if (mes == 8 && dia == 8 || dia == 9 || dia == 10 || dia == 11 ||dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 8 &&  dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia de 2do  . Turno");
                } else if (mes == 8 &&  dia == 22 || dia == 23 || dia == 24 || dia == 25 ||dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 8 &&  dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 2do  . Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 ||dia == 2 ||dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 9 &&   dia == 5 || dia == 6 || dia == 7 || dia == 8  ||dia == 9 ||dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 9 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 9 &&dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia de 1er . Turno");
                } else if (mes == 9 && dia == 26 || dia == 27 || dia == 28 || dia == 29  || dia == 30 )
                    tv1.setText("Fiscalia de 2do. Turno");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de 1er . Turno");
                } else if (mes == 10  &&  dia == 3 || dia == 4  ||  dia == 5 || dia == 6 ||  dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText( "Fiscalia de 2do  . Turno");
                } else if (mes == 10  &&  dia == 10  || dia == 11   ||  dia == 12 ||  dia == 13  ||dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de 1er . Turno");
                } else if (mes == 10  && dia == 17 || dia == 18  ||  dia == 19 || dia == 20 ||  dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia de 2do  . Turno");
                } else if (mes == 10  &&  dia == 24  || dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30  ){
                    tv1.setText( "Fiscalia de 1er . Turno");
                } else if (mes == 10  &&   dia == 31 )
                    tv1.setText( "Fiscalia de 1er . Turno");


                break;

            case 11:

                if (mes == 11 && dia == 1   ||   dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText( "Fiscalia de 1er . Turno");
                } else if (mes == 11  && dia == 7 || dia == 8   ||  dia == 9 || dia == 10||dia == 11 || dia == 12 || dia == 13   ) {
                    tv1.setText( "Fiscalia de 2do  . Turno");
                } else if (mes == 11  &&   dia == 14 || dia == 15   || dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText( "Fiscalia de 1er . Turno");
                } else if (mes == 11  &&  dia == 21 ||dia == 22 || dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de 2do  . Turno");
                } else if (mes == 11  &&    dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText( "Fiscalia de 1er . Turno");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de 1er . Turno");
                } else if (mes == 12  &&    dia == 5 || dia == 6  || dia == 7 || dia == 8   ||dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText( "Fiscalia de 1ro. Turno");
                } else if (mes == 12 &&   dia == 12 || dia == 13  ||     dia == 14  || dia ==  15 ||dia == 16 ||  dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de 1er . Turno");
                } else if (mes == 12  &&    dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 || dia == 23 ||   dia == 24 )   {
                    tv1.setText( "Fiscalia de 2do  . Turno");
                } else if (mes == 12  &&dia == 25 ||  dia == 26 || dia == 27  || dia == 28 ||  dia == 29  || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de 1er . Turno");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }




    public void DobleTurno2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 1 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 1er Turno");


                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 2 &&  dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11||dia == 12 ) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 2 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18||dia == 19 ) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 2 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25  ||dia == 26) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 2 && dia == 27 || dia == 28 )
                    tv1.setText("Fiscalia de 2do Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1 || dia == 2 || dia == 3|| dia == 4 || dia == 5 ) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 3 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 3 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 ||dia == 18 || dia == 19) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 3 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 || dia == 26 ) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 3 &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 2do Turno");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 ) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 4 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 || dia == 9 ) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 4 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 4 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 4 &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ||dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de 2do Turno");

                break;

            case 5:

                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ||dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 5 &&  dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 5 &&  dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 5 &&  dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 5 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 1er Turno");


                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 ||dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 6 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 6 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 || dia == 18  ) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 6 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 6 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de 1er Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14  || dia == 15) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 7 &&dia == 16 ) {
                    tv1.setText("Fiscalia de 1ro Turno");
                } else if (mes == 7 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21|| dia == 22 || dia == 23 ) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 7 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ||dia == 29 || dia == 30 ){
                    tv1.setText("Fiscalia de 1ro Turno");
                } else if (mes == 7 &&  dia == 31)
                    tv1.setText("Fiscalia de 2do Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 8 &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ||dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 8 && dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia de 2do Turno");
                } else if (mes == 8 && dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ||dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 8 &&  dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 2do Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1||dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 9 &&  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8||dia == 9 || dia == 10 ) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 9 &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 9 &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia de 1er Turno");
                } else if (mes == 9 &&  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29  || dia == 30  )
                    tv1.setText("Fiscalia de 2do. Turno");



                break;

            case 10:
                if (mes == 10 && dia == 1    ) {
                    tv1.setText( "Fiscalia de 2do Turno");
                }  else if (mes == 10 &&  dia == 2 || dia == 3 || dia == 4  ||  dia == 5 || dia == 6  || dia == 7 || dia == 8 ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 10  &&   dia == 9 || dia == 10  || dia == 11   ||  dia == 12 ||  dia == 13 ||dia == 14 || dia  ==  15) {
                    tv1.setText( "Fiscalia de 2do Turno");
                } else if (mes == 10  &&   dia == 16 || dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22 ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 10  &&   dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29  ) {
                    tv1.setText( "Fiscalia de 2do Turno");
                } else if (mes == 10  &&  dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 1er Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||   dia == 2 || dia == 3  || dia == 4 || dia == 5) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 11  &&dia == 6 || dia == 7 || dia == 8   ||  dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                    tv1.setText( "Fiscalia de 2do Turno");
                } else if (mes == 11  &&  dia == 13 || dia == 14 || dia == 15   || dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 11  && dia == 20 || dia == 21 ||dia == 22 || dia == 23 || dia == 24  || dia == 25 ||  dia == 26 ) {
                    tv1.setText( "Fiscalia de 2do Turno");
                } else if (mes == 11  &&   dia == 27 || dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText( "Fiscalia de 1er Turno");


                break;

            case 12:

                if (mes == 12 && dia == 1    || dia == 2 || dia  == 3) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 12  &&   dia == 4 || dia == 5 || dia == 6  || dia == 7 || dia == 8  || dia == 9 || dia == 10 ) {
                    tv1.setText( "Fiscalia de 1ro. Turno");
                } else if (mes == 12 &&   dia == 11 || dia == 12 || dia == 13  ||     dia == 14  || dia ==  15 || dia == 16 ||  dia == 17  ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 12  &&   dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22  || dia == 23 || dia == 24)   {
                    tv1.setText( "Fiscalia de 2do Turno");
                } else if (mes == 12  &&  dia == 25 ||  dia == 26 || dia == 27  || dia == 28 ||  dia == 29||dia == 30 || dia == 31 ) {

                }
                tv1.setText( "Fiscalia de 1er Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }








    public void DobleTurno2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 1 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 2do. Turno ");


                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 2 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 2 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 2 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 2 && dia == 26 || dia == 27 || dia == 28 || dia == 29)
                    tv1.setText("Fiscalia de 1er. Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia de1er. Turno");
                } else if (mes == 3 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 3 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 3 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 3 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 1er. Turno");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 4 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 4 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 4 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 4 && dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de 2do. Turno");

                break;

            case 5:

                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 5 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 5 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 5 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 5 && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 2do. Turno");


                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 6 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 6 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 6 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 6 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de 2do. Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 7 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 7 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 7 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 1er. Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 8 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 8 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia de 1er. Turno");
                } else if (mes == 8 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 8 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de 1er. Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1) {
                    tv1.setText("Fiscalia de 1ro. Turno");
                } else if (mes == 9 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 9 && dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia de 1ro. Turno");
                } else if (mes == 9 && dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia de 2do. Turno");
                } else if (mes == 9 && dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ){
                    tv1.setText("Fiscalia de 1roo. Turno");
                }  else if (mes == 9  &&   dia == 30   )
                    tv1.setText( "Fiscalia de 2do. Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4  ||  dia == 5 || dia == 6    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 10  &&  dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11   ||  dia == 12 ||  dia == 13) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 10  &&  dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  ||  dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 10  &&   dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 10  &&   dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||   dia == 2 || dia == 3) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 11  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ||  dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15   || dia == 16 || dia == 17) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 11  && dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&    dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText( "Fiscalia de 2do. Turno");


                break;

            case 12:

                if (mes == 12 && dia == 1  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 12  &&    dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de 1ro. Turno");
                } else if (mes == 12 &&   dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ||     dia == 14  || dia ==  15  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 12  &&   dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22  )   {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 12  &&dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27  || dia == 28 ||  dia == 29  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 12  && dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de 1er. Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }







    public void DobleTurno2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de 1er. Turno");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "Fiscalia de 2do. Turno");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "Fiscalia de 1er. Turno ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "Fiscalia de 2do. Turno");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de 1er. Turno ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de 1er. Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 3  &&    dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8||dia == 9    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 3  &&  dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 3  &&   dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ||  dia == 23 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 3  &&dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                }  else if (mes == 3  &&  dia == 31   )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 4 && dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12  || dia == 13 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 4  &&dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 4  &&  dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 4  &&  dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3   || dia == 4 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 5  &&  dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ||dia == 11 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 5  &&   dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 5  &&dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 2do. Turno");




                break;
            case 6:
                if (mes == 6 && dia == 1  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 6  &&   dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 6  &&   dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 6 &&    dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21  || dia == 22) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 6  &&   dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  ||  dia == 29 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 6  &&  dia == 30  )
                    tv1.setText( "Fiscalia de 1er. Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 7 && dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||dia == 13 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 7  && dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19|| dia == 20 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 7  &&  dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 7  && dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de 1er. Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 8  &&  dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9|| dia == 10   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 8  &&   dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16 ||dia == 17    ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 8  && dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||dia == 24   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 8  &&  dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31   )
                    tv1.setText( "Fiscalia de 1er. Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||  dia == 7 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 9  &&  dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13   ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 9 &&   dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20    || dia == 21   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 9  &&    dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||  dia ==  28) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 9  &&     dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de 2do. Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4   ||  dia == 5  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 10  &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  ||  dia == 12  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 10  && dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 10  &&     dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25  || dia == 26   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 10  &&  dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1  ||  dia == 2   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 11  && dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ||  dia == 9 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  || dia == 16) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&     dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29||   dia == 30  )
                    tv1.setText( "Fiscalia de 2do. Turno");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 12  &&     dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13   || dia == 14  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 12 &&     dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 12  &&    dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27||dia == 28    )   {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 12  &&   dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de 1er. Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void DobleTurno2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4  ) {
                tv1.setText( "Fiscalia de 1er. Turno");
            } else if (mes == 1  &&  dia == 5  ||dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11  ) {
                tv1.setText( "Fiscalia de 2do. Turno");
            } else if (mes == 1  &&  dia == 12   ||dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18  ) {
                tv1.setText( "Fiscalia de 1er. Turno ");
            } else if (mes == 1  &&   dia == 19 ||dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25    ) {
                tv1.setText( "Fiscalia de 2do. Turno");
            } else if (mes == 1  &&  dia == 26|| dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de 1er. Turno ");

                break;

            case 2:

                if (mes == 2 && dia == 1   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 2  &&   dia == 2 ||dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 2  &&  dia == 9 ||dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 2  && dia == 16  ||dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 2  && dia == 23  || dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de 1er. Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 3  &&    dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 3  &&dia == 9 ||   dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 3  &&   dia == 16|| dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 3  &&  dia == 23 ||dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                }  else if (mes == 3  &&  dia == 30  || dia == 31   )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 4 && dia == 6 ||dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 4  &&  dia == 13 ||dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 4  &&  dia == 20 ||dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 4  &&  dia == 27 ||dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 5  &&  dia == 4|| dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 5  &&  dia == 11|| dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 5  &&   dia == 18  || dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 5  &&dia == 25|| dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 2do. Turno");




                break;
            case 6:
                if (mes == 6 && dia == 1  ||dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 6  &&    dia == 8|| dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 6 &&  dia ==  15  || dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 6  &&  dia == 22 || dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 6  &&   dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de 1er. Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 7 && dia == 6  || dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 7  &&  dia == 13 ||dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 7  && dia == 20 || dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 7  &&dia == 27 ||  dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de 1er. Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 8  &&  dia == 3 ||dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 8  && dia == 10 ||  dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16    ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 8  &&dia == 17 || dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 8  && dia == 24 || dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31 ){
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 8  &&   dia == 31   )
                    tv1.setText( "Fiscalia de 2do. Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 9  &&  dia == 7  || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13     ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 9 && dia == 14   ||  dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20       ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 9  &&   dia == 21  ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 9  &&     dia ==  28  || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de 2do. Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 10  &&   dia == 5  || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 10  && dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 10  && dia == 19   ||   dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25     ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 10  &&dia == 26  || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 11  && dia == 2  ||  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&   dia == 9  ||dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 11  &&  dia == 16  ||dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&    dia == 23  ||dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29  ){
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 11  &&      dia == 30  )
                    tv1.setText( "Fiscalia de 1er. Turno");



                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 12  &&dia == 7    ||  dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 12 &&    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20    ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 12  && dia == 21   ||dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27   )   {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 12  &&  dia == 28 || dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de 1er. Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }





    public void TripleTurno2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {


            case 11:

                if (mes == 11 && dia == 1  || dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 11  &&   dia == 8  || dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 11  &&  dia == 15   || dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 11  &&  dia == 22 || dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 ||  dia ==  28  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 11  &&   dia == 29 ||  dia == 30    )
                    tv1.setText( "Fiscalia  de 2º Turno");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4  || dia == 5  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 12  &&   dia == 6 || dia == 7 || dia == 8  || dia == 9 || dia == 10 || dia == 11  || dia == 12  ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 12 &&    dia == 13 ||  dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 12  &&     dia ==20  || dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 )   {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 12  &&  dia == 25 ||  dia == 26 || dia == 27|| dia == 28 ||  dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia  de 1º Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }









    public void TripleTurno2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                tv1.setText( "Fiscalia  de 1º Turno");
            } else if (mes == 1  && dia == 6 ||dia == 7 || dia == 8 || dia == 9 ||dia == 10 || dia == 11 || dia == 12 || dia == 13 ||dia == 14 || dia == 15 || dia == 16|| dia == 17 || dia == 18  ){
                tv1.setText( "Fiscalia  de 2º Turno");
            } else if (mes == 1  &&   dia == 19 ||dia == 20 ||dia == 21 || dia == 22 || dia == 23  || dia == 24 || dia == 25 || dia == 26 ||dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                tv1.setText( "Fiscalia  de 3º Turno");



                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ||  dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 2  &&  dia == 7 || dia == 8 || dia == 9  ||   dia == 10 ||   dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 2  &&dia == 14 || dia == 15 || dia == 16   ||  dia == 17||   dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 2  && dia == 21 || dia == 22 || dia == 23||  dia == 24|| dia == 25 || dia == 26 || dia == 27  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 2  &&   dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia  de 3º Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1 || dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6   ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 3  &&    dia == 7 || dia == 8 ||  dia == 9 || dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 3  &&  dia == 14 || dia == 15 || dia == 16 || dia == 17 ||  dia == 18|| dia == 19 || dia == 20) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 3  &&    dia == 21 || dia == 22 || dia == 23 || dia == 24 ||  dia == 25 || dia == 26 || dia == 27 ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 3  && dia ==  28 || dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia  de 1º Turno");


                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3   ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 4 && dia == 4 || dia == 5|| dia == 6 || dia == 7   ||  dia == 8 ||dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 4  &&  dia == 11 || dia == 12||dia == 13 || dia == 14 ||   dia ==  15 || dia == 16 || dia == 17  ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 4  &&  dia == 18 || dia == 19||dia == 20 || dia == 21  ||  dia == 22 ||dia == 23 || dia == 24    ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 4  &&  dia == 25 || dia == 26||dia == 27 || dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia  de 2º Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 5  &&   dia == 2 || dia == 3||  dia == 4 || dia == 5  ||dia == 6 ||dia == 7  || dia == 8) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 5  &&    dia == 9 || dia == 10|| dia == 11 || dia == 12  ||  dia == 13 || dia == 14|| dia ==  15  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 5  &&  dia == 16 || dia == 17  || dia == 18 || dia == 19  ||  dia == 20 ||dia == 21|| dia == 22    ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 5  && dia == 23 || dia == 24||dia == 25 || dia == 26 ||  dia == 27|| dia ==  28 || dia == 29  ){
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 5  &&  dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia  de 1º Turno");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 6  && dia == 6 || dia == 7  ||  dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 6 &&  dia == 13 || dia == 14 || dia ==  15 || dia == 16  || dia == 17 ||  dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 6  &&   dia == 20 || dia == 21 || dia == 22 || dia == 23   ||  dia == 24 ||dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 6  && dia == 27 || dia ==  28 ||   dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia  de 2º Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3  || dia == 4 || dia == 5||  dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 7 &&  dia == 8 || dia == 9 || dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 ||   dia ==  15  ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 7  &&  dia == 16 || dia == 17  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 7  &&  dia == 18 || dia == 19||dia == 20 || dia == 21 || dia == 22 ||  dia == 23 || dia == 24   ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 7  && dia == 25 || dia == 26|| dia == 27 || dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia  de 3º Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3 || dia == 4  ||  dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 8  &&   dia == 8 || dia == 9 ||dia == 10 || dia == 11 ||  dia == 12 || dia == 13 || dia == 14  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 8  &&    dia  ==  15 || dia == 16  || dia == 17 || dia == 18  ||   dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 8  &&  dia == 22 || dia == 23   ||  dia == 24  || dia == 25  ||   dia == 26 || dia == 27 || dia ==  28) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 8  && dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia  de 2º Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3   || dia == 4 ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 9  &&   dia == 5 || dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 9 &&    dia == 12 ||dia == 13 || dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 9  &&    dia == 19 || dia == 20  || dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 9  &&   dia == 26 || dia == 27  ||  dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia  de 3º Turno");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2     ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 10  &&  dia == 3 || dia == 4  || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 10  &&  dia == 10  || dia == 11 || dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 10  &&   dia == 17 || dia == 18  || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 10  &&  dia == 24  || dia == 25  || dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 10  &&   dia == 31 )
                    tv1.setText( "Fiscalia  de 2º Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1  || dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 11  &&   dia == 7 || dia == 8  || dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 11  &&   dia == 14 || dia == 15   || dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 11  &&  dia == 21 ||dia == 22 || dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27  ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 11  &&    dia ==  28 || dia == 29 ||  dia == 30    )
                    tv1.setText( "Fiscalia  de 3º Turno");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4  ) {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 12  &&    dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText( "Fiscalia  de 2º Turno");
                } else if (mes == 12 &&      dia == 12 || dia == 13 ||  dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia  de 1º Turno");
                } else if (mes == 12  &&  dia == 19 || dia == 20  || dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24  )   {
                    tv1.setText( "Fiscalia  de 3º Turno");
                } else if (mes == 12  &&  dia == 25 ||  dia == 26 || dia == 27|| dia == 28 ||  dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia  de 2º Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }







    public void TripleTurno2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 ||  dia == 2 ||dia == 3 || dia == 4 || dia == 5  ) {
                tv1.setText("Fiscalia de 2º Turno");
            } else if (mes == 1  &&dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia == 15  || dia == 16 || dia == 17 || dia == 18) {
                tv1.setText("Fiscalia de 3º Turno");
            } else if (mes == 1  &&  dia == 19   ||  dia == 20 || dia == 21|| dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29  || dia == 30 || dia == 31  )
                tv1.setText("Fiscalia de 1º Turno");


                break;




            case 2:

                if (mes == 2 && dia == 1 || dia == 2  || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia de  1º Turno");
                } else if (mes == 2  &&  dia == 6  ||dia == 7 || dia == 8 || dia == 9 || dia == 10 ||  dia == 11  || dia == 12  ) {
                    tv1.setText( "Fiscalia de 2º Turno");
                } else if (mes == 2  &&   dia == 13|| dia == 14 || dia == 15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia de 3º Turno");
                } else if (mes == 2  &&  dia == 20  ||dia == 21 || dia == 22 || dia == 23  ||  dia == 24 || dia == 25 ||dia == 26)  {
                    tv1.setText("Fiscalia de 1º Turno");
                } else if (mes == 2  && dia == 27  || dia ==  28   )
                    tv1.setText("Fiscalia de  2º Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||   dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia de 2º Turno");
                } else if (mes == 3  && dia == 6 || dia == 7 || dia == 8  ||  dia == 9 || dia == 10 || dia == 11  ||  dia == 12) {
                    tv1.setText( "Fiscalia de  3º Turno");
                } else if (mes == 3  &&    dia == 13|| dia == 14 || dia == 15  ||   dia == 16 || dia == 17||dia == 18|| dia == 19   ) {
                    tv1.setText("Fiscalia de 1º Turno");
                } else if (mes == 3  && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26  ) {
                    tv1.setText("Fiscalia de 2º Turno");
                } else if (mes == 3  && dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText("Fiscalia de  3º Turno");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2  ) {
                    tv1.setText("Fiscalia de 3º Turno");
                } else if (mes == 4 && dia == 3  ||dia == 4 || dia == 5  || dia == 6 || dia == 7   || dia == 8 ||dia == 9  ) {
                    tv1.setText("Fiscalia de  1º Turno");
                } else if (mes == 4  &&   dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16) {
                    tv1.setText("Fiscalia de 2º Turno");
                } else if (mes == 4  &&   dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ||  dia == 22 ||dia == 23  ) {
                    tv1.setText( "Fiscalia de  3ºTurno");
                } else if (mes == 4  &&  dia == 24 ||dia == 25 || dia == 26  || dia == 27 || dia ==  28    ||dia == 29 ||dia == 30  )
                    tv1.setText("Fiscalia de 1º Turno");
                break;

            case 5:
                if (mes == 5  &&  dia == 1  ||  dia == 2 || dia == 3  || dia == 4 || dia == 5 ||dia == 6 ||dia == 7    ) {
                    tv1.setText("Fiscalia de  2º Turno");
                } else if (mes == 5  && dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia de  3º Turno");
                } else if (mes == 5  &&  dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19   || dia == 20 ||dia == 21  ) {
                    tv1.setText( "Fiscalia de  1º Turno");
                } else if (mes == 5  && dia == 22  ||dia == 23 || dia == 24  ||   dia == 25 || dia == 26 || dia == 27|| dia ==  28   ){
                    tv1.setText("Fiscalia de 2º Turno");
                } else if (mes == 5  && dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 3º Turno");
                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2   || dia  == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia de 3º Turno");
                } else if (mes == 6  &&   dia == 5||dia == 6 || dia == 7 ||  dia == 8 || dia == 9   ||  dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia de 1º Turno");
                } else if (mes == 6 &&  dia == 12||dia == 13 || dia == 14 || dia ==  15 || dia == 16|| dia == 17 ||  dia == 18  ) {
                    tv1.setText( "Fiscalia de 2ºTurno");
                } else if (mes == 6  && dia == 19 ||dia == 20 || dia == 21   ||  dia == 22 || dia == 23 ||  dia == 24 ||dia == 25     ) {
                    tv1.setText("Fiscalia de 3º Turno");
                } else if (mes == 6  &&  dia == 26|| dia == 27 || dia ==  28  || dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia de 1º Turno");
                break;

            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia de 3º Turno");
                } else if (mes == 7 &&   dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ||  dia == 13 || dia == 14 || dia ==  15  ) {
                    tv1.setText("Fiscalia de 1º Turno");
                } else if (mes == 7  &&    dia == 16 ) {
                    tv1.setText( "Fiscalia de 2ºTurno");
                } else if (mes == 7  &&    dia == 17||dia == 18 || dia == 19|| dia == 20 || dia == 21 ||dia == 22 ||  dia == 23    ) {
                    tv1.setText( "Fiscalia de  3ºTurno");
                } else if (mes == 7  &&   dia == 24 ||dia == 25 || dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30   ){
                    tv1.setText("Fiscalia de 1º Turno");
                } else if (mes == 7  &&    dia == 31 )
                    tv1.setText("Fiscalia de 2º Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2  || dia == 3 || dia == 4 ||dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia de 2º Turno");
                } else if (mes == 8  &&    dia == 7  ||  dia == 8 || dia == 9   || dia == 10 || dia == 11  ||dia == 12 || dia == 13  ) {
                    tv1.setText("Fiscalia de 3º Turno");
                } else if (mes == 8  &&   dia == 14 || dia  ==  15 || dia == 16||   dia == 17 || dia == 18 ||  dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de 1º Turno");
                } else if (mes == 8  &&   dia == 21 ||  dia == 22 || dia == 23  ||  dia == 24  || dia == 25  || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de 2º Turno");
                } else if (mes == 8  &&    dia ==  28  ||dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText("Fiscalia de 3º Turno");
                break;

            case 9:
                if (mes == 9 && dia == 1  || dia == 2  || dia  == 3 ) {
                    tv1.setText("Fiscalia de 3º Turno");
                } else if (mes == 9  &&     dia == 4 ||dia == 5 || dia == 6 ||dia == 7 || dia == 8 ||  dia == 9 || dia == 10   ) {
                    tv1.setText( "Fiscalia de 1º Turno");
                } else if (mes == 9 &&      dia == 11||  dia == 12 ||dia == 13|| dia == 14  || dia ==  15  ||   dia == 16 || dia == 17   ) {
                    tv1.setText( "Fiscalia de 2ºTurno");
                } else if (mes == 9  &&  dia == 18 || dia == 19 || dia == 20  ||dia == 21 ||  dia == 22 ||  dia == 23 || dia == 24    ) {
                    tv1.setText("Fiscalia de 3º Turno");
                } else if (mes == 9  &&   dia == 25||  dia == 26 || dia == 27 ||  dia ==  28 || dia == 29 ||   dia == 30   )
                    tv1.setText("Fiscalia de 1º Turno");



                break;

            case 10:
                if (mes == 10 && dia == 1   ) {
                    tv1.setText("Fiscalia de 1º Turno");
                } else if (mes == 10  &&   dia == 2 || dia == 3 || dia == 4   ||  dia == 5 || dia == 6 ||dia == 7 || dia == 8     ) {
                    tv1.setText( "Fiscalia de 2º Turno");
                } else if (mes == 10  &&dia == 9  ||  dia == 10  || dia == 11 ||  dia == 12 ||  dia == 13||dia == 14 || dia  ==  15  ) {
                    tv1.setText("Fiscalia de 3 ºTurno");
                } else if (mes == 10  &&   dia == 16||dia == 17 || dia == 18  ||  dia == 19 || dia == 20  || dia == 21 || dia == 22 ){
                    tv1.setText("Fiscalia de  1º Turno");
                } else if (mes == 10  &&  dia == 23 || dia == 24  || dia == 25 ||  dia == 26 || dia == 27|| dia ==  28 || dia == 29   ){
                    tv1.setText("Fiscalia de 2º Turno");
                } else if (mes == 10  &&  dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia de 3º Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1   ||  dia == 2 || dia == 3 ||dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia de 3º Turno");
                } else if (mes == 11  &&  dia == 6||dia == 7 || dia == 8  ||dia == 9 || dia == 10 ||  dia == 11 || dia == 12  ) {
                    tv1.setText("Fiscalia de 1º Turno");
                } else if (mes == 11  &&    dia == 13 || dia == 14 || dia == 15||  dia == 16 || dia == 17||dia == 18 || dia == 19   ) {
                    tv1.setText( "Fiscalia de 2º Turno");
                } else if (mes == 11  &&  dia == 20 || dia == 21 ||dia == 22 ||dia == 23 || dia == 24  || dia == 25 ||  dia == 26  ) {
                    tv1.setText("Fiscalia de  3º Turno");
                } else if (mes == 11  &&   dia == 27  ||dia ==  28 || dia == 29 ||  dia == 30  )
                    tv1.setText("Fiscalia de  1º Turno");


                break;

            case 12:

                if (mes == 12 && dia == 1  || dia == 2 || dia  == 3  ) {
                    tv1.setText( "Fiscalia de 1º Turno");
                } else if (mes == 12  && dia == 4   || dia == 5 || dia == 6||   dia == 7 || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de  2ºTurno");
                } else if (mes == 12 &&  dia == 11  || dia == 12 || dia == 13  ||    dia == 14  || dia ==  15 || dia == 16 ||  dia == 17  ) {
                    tv1.setText( "Fiscalia de 3º Turno");
                } else if (mes == 12  &&    dia == 18 || dia == 19 || dia == 20 ||dia == 21 ||  dia == 22  ||dia == 23 ||   dia == 24  ) {
                    tv1.setText("Fiscalia de  1º Turno");
                } else if (mes == 12  &&dia == 25 ||  dia == 26 || dia == 27   || dia == 28  || dia == 29 || dia == 30  || dia == 31  )
                    tv1.setText( "Fiscalia de 3º Turno");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }








    public void TripleTurno2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de 3er Turno");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  || dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                tv1.setText( "Fiscalia de 1er Turno");
            } else if (mes == 1  &&   dia == 19 || dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31  )
                tv1.setText( "Fiscalia de  2do Turno");


                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4  ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 2  &&   dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 ||   dia == 10 ||   dia == 11  ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 2  && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17||   dia == 18  ) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 2  &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24|| dia == 25  ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 2  &&   dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia de 1er Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 3  &&  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ||dia == 9 || dia == 10 ) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 3  &&   dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16 || dia == 17 ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 3  &&     dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24    ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 3  &&dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||  dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de  2do Turno");
                break;

            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7    ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 4 && dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ||   dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 4  && dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ||  dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 4  &&  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 || dia ==  28 ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 4  &&   dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de 1er Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3   || dia == 4 || dia == 5 ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 5  &&  dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 5  &&    dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17   ||  dia == 18 || dia == 19   ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 5  && dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 ||  dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 5  &&dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de  2do Turno");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 6  &&   dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||  dia == 8 || dia == 9 ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 6 &&     dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14||dia ==  15 || dia == 16)  {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 6  &&   dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 6  &&   dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  ||  dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia de 1er Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  || dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 7 &&  dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ||  dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 7  &&  dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19  || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 7  && dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  ||  dia == 27 || dia ==  28) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 7  && dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de  2do Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2  ||  dia == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 8  &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ||dia == 10 || dia == 11  ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 8  &&    dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16  || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 8  &&    dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ||   dia == 24  || dia == 25  ) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 8  &&  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 || dia == 31   )
                    tv1.setText( "Fiscalia de 3er Turno");
                break;


            case 9:
                if (mes == 9 && dia == 1  ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 9  &&    dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 9  &&    dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13  ||  dia == 14  || dia ==  15  ) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 9 &&   dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20  ||  dia == 21 ||  dia == 22   ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 9  &&   dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27  ||  dia ==  28 || dia == 29 ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 9  &&     dia == 30   )
                    tv1.setText( "Fiscalia de  2do Turno");
                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4  ||   dia == 5 || dia == 6   ) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 10  &&  dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11  ||  dia == 12 ||  dia == 13 ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 10  &&  dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  ||    dia == 19 || dia == 20) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 10  &&   dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25   ||   dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 10  && dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 3er Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1    || dia == 2 || dia == 3 ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 11  && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ||  dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 11  &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ||  dia == 16 || dia == 17) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 11  && dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ||  dia == 23 || dia == 24 ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 11  &&  dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 ||    dia == 30  )
                    tv1.setText( "Fiscalia de 1er Turno");
                break;

            case 12:

                if (mes == 12 && dia == 1  ) {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 12  &&   dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||   dia == 7 || dia == 8 ){
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 12  &&   dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13   || dia == 14  || dia ==  15 ) {
                    tv1.setText( "Fiscalia de 3er Turno");
                } else if (mes == 12 &&      dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ||  dia == 21 ||  dia == 22) {
                    tv1.setText( "Fiscalia de 1er Turno");
                } else if (mes == 12  &&  dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia == 28 ||  dia == 29 )   {
                    tv1.setText( "Fiscalia de  2do Turno");
                } else if (mes == 12  &&   dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de 3er Turno");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }



    public void TripleTurno2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();

        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de 3er. Turno");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "Fiscalia de 1er. Turno");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "Fiscalia de 2do. Turno ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "Fiscalia de 3er. Turno ");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "F. de Ciudad de la Costa  1 ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de 2do. Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 3  &&    dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 3  && dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ||  dia == 16 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 3  && dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 3  && dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29  ||  dia == 30 ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                }  else if (mes == 3  &&  dia == 31   )
                    tv1.setText( "Fiscalia de 1er. Turno");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 4 && dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 4  &&  dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 4  && dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 4  && dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ||dia == 4 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 5  &&    dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10|| dia == 11  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 5  &&    dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||dia == 25  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 5  && dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 3er. Turno");




                break;
            case 6:
                if (mes == 6 && dia == 1  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 6  &&    dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 6  &&   dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 6 &&    dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 6  &&     dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28|| dia == 29  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ||dia == 6   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 7 &&  dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 7  && dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 7  &&  dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 7  && dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de 3er. Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 8  &&   dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  || dia == 10) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 8  &&    dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   || dia == 17 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 8  &&  dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  || dia == 24   ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 8  &&  dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText( "Fiscalia de 1er. Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 9  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||dia == 14 ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 9 &&    dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||dia ==  28   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 9  &&   dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de 3er. Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 10  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 10  &&     dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 1er. Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1 ||  dia == 2) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ||dia == 16 ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||  dia == 7) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 12  &&    dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 12 &&     dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20|| dia == 21    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27|| dia == 28   )   {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 12  &&   dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de 1er. Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }






    public void TripleTurno2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();

        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de 1º. Turno");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "Fiscalia de 2º. Turno");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "Fiscalia de 3º. Turno ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "Fiscalia de 1º. Turno ");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de 2º. Turno ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de 3º. Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 3  &&    dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 3  && dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ||  dia == 16 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 3  && dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 3  && dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29  ||  dia == 30 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                }  else if (mes == 3  &&  dia == 31   )
                    tv1.setText( "Fiscalia de 2º. Turno");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 4 && dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 4  &&  dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 4  && dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 4  && dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de 3º. Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ||dia == 4 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 5  &&    dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10|| dia == 11  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 5  &&    dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||dia == 25  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 5  && dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 1º. Turno");




                break;
            case 6:
                if (mes == 6 && dia == 1  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 6  &&    dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 6  &&   dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 6 &&    dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 6  &&     dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28|| dia == 29  ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "Fiscalia de 3º. Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ||dia == 6   ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 7 &&  dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 7  && dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 7  &&  dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 7  && dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de 1º. Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 8  &&   dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  || dia == 10) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 8  &&    dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   || dia == 17 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 8  &&  dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  || dia == 24   ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 8  &&  dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText( "Fiscalia de 2º. Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 9  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||dia == 14 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 9 &&    dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||dia ==  28   ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 9  &&   dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de 1º. Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 10  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 10  &&     dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 2º. Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1 ||  dia == 2) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ||dia == 16 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 )
                    tv1.setText( "Fiscalia de 3º. Turno");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||  dia == 7) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 12  &&    dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 12 &&     dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20|| dia == 21    ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27|| dia == 28   )   {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 12  &&   dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de 2º. Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }












    public void PandoYToledo2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {


            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 11 &&  dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11  || dia == 12 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 11 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18 ||dia == 19) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 11 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25||dia == 26  ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 11 &&   dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText( "Fiscalia de  Toledo");

                break;

            case 12:
                if (dia == 1 ||dia == 2||dia == 3 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10  ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ||dia == 17)  {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if ( dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ||dia == 24) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Pando 1º");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }




    public void PandoYToledo2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if ( dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if ( dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if ( dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if ( dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Toledo");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 2 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 2 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 2 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 2 &&  dia == 26 || dia == 27 || dia == 28)
                    tv1.setText( "Fiscalia de  Pando 1º");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 3 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 3 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 3 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 3 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de  Pando 2º");
                break;
            case 4:
                if (mes == 4 && dia == 1  ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 4 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 4 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 4 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 4 &&  dia == 30)
                    tv1.setText( "Fiscalia de  Pando 1º");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 5 &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 5 &&  dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 5 &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia ==  26 || dia == 27 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 5 &&  dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de  Pando 2º");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 6 &&  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 6 &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 6 &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 6 &&  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText( "Fiscalia de  Toledo");
                break;
            case 7:
                if (mes == 7 && dia == 1 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 7 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 7 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 7 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21||dia == 22 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 7 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 7 &&  dia == 30 || dia == 31)
                    tv1.setText("Fiscalia de  Pando 2º");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 8 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 8 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 8 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ||dia == 26) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 8 &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Toledo");
                break;

            case 9:
                if (mes == 9 && dia == 1||dia == 2 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 9 &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ||dia == 9) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 9 &&  dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 9 &&  dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 9 &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText( "Fiscalia de  Pando 1º");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 10 &&  dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 10 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||  dia == 21) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 10 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 10 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Toledo");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 11 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 11 &&  dia == 12  || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 11 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 11 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText( "Fiscalia de  Pando 1º");

                break;

            case 12:
                if (dia == 1 ||dia == 2) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16)  {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)  {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if ( dia == 31)
                    tv1.setText("Fiscalia de  Pando 2º");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }

    public void PandoYToledo2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Pando 1º");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 2 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 2 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 2 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 2 && dia == 25 || dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia de  Pando 2º");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 3 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 3 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 3 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 3 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Toledo");
                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 4 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 4 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 4 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 4 && dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de  Pando 2º");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 5 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 5 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 5 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 5 && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Toledo");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 6 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 6 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 6 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 6 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText( "Fiscalia de  Pando 1º");
                break;
            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 7 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 7 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 7 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Toledo");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 8 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 8 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 8 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 8 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Pando 1º");
                break;

            case 9:
                if (mes == 9 && dia == 1) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 9 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 9 && dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 9 && dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 9 && dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 9 && dia == 30)
                    tv1.setText( "Fiscalia de  Toledo");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 10 && dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 10 && dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 10 && dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 10 && dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Pando 1º");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 11 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (mes == 11 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 11 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 11 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia de  Pando 2º");

                break;

            case 12:
                if (dia == 1) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia de  Pando 2º");
                } else if (dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (dia == 30 || dia == 31)
                    tv1.setText( "Fiscalia de  Pando 1º");
                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }








    public void PandoYToledo2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de  Toledo");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  || dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                tv1.setText( "Fiscalia de  Pando 1º");
            } else if (mes == 1  &&   dia == 19 || dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31  )
                tv1.setText( "Fiscalia de  Pando 2º");


                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia de  Pando 1º");
                break;

            case 3:

                if (mes == 3 && dia == 1   ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 3  &&    dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 3  &&  dia == 9 || dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 3  &&   dia == 16 || dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22  ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 3  &&dia == 23 || dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29   ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                }  else if (mes == 3  &&  dia == 30 || dia == 31   )
                    tv1.setText( "Fiscalia de  Toledo");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 4 &&dia == 6 || dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 4  && dia == 13 || dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 4  && dia == 20 || dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 4  && dia == 27 || dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de  Pando 1º");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 5  &&   dia == 4 || dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 5  &&   dia == 11 || dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 5  &&   dia == 18 || dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24   ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 5  &&dia == 25 || dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de  Pando 2º");

                break;

            case 6:
                if (mes == 6 && dia == 1 || dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 6 &&   dia ==  15 || dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 6  &&    dia == 22 || dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 6  &&   dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia de  Pando 1º");

                break;


            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 7 && dia == 6 || dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 7  && dia == 13 || dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 7  && dia == 20 || dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 7  &&dia == 27 || dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de  Pando 2º");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 8  &&  dia == 3 || dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 8  &&   dia == 10 || dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 8  && dia == 17 || dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 8  && dia == 24  || dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 8  &&    dia == 31 )
                    tv1.setText( "Fiscalia de  Pando 1º");
                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 9  &&   dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13    ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 9 &&    dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20     ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 9  &&    dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 9  &&     dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de  Pando 2º");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4     ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 10  &&   dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 10  && dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 10  &&    dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 10  &&   dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de  Toledo");

                break;

            case 11:

                if (mes == 11 && dia == 1    ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 11  &&  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 11  &&  dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 11  &&    dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29   ){
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 11  &&    dia == 30   )
                    tv1.setText( "Fiscalia de  Pando 2º");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 12  &&    dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia de  Toledo");
                } else if (mes == 12 &&      dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia de  Pando 1º");
                } else if (mes == 12  &&   dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 )   {
                    tv1.setText( "Fiscalia de  Pando 2º");
                } else if (mes == 12  &&   dia == 28 ||  dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de  Toledo");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }





    public void PandoYToledo2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de 3er. Turno");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "Fiscalia de 1er. Turno");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "Fiscalia de 2do. Turno ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "Fiscalia de 3er. Turno ");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "F. de Ciudad de la Costa  1 ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de 2do. Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 3  &&    dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 3  && dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ||  dia == 16 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 3  && dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 3  && dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29  ||  dia == 30 ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                }  else if (mes == 3  &&  dia == 31   )
                    tv1.setText( "Fiscalia de 1er. Turno");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 4 && dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 4  &&  dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 4  && dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 4  && dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ||dia == 4 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 5  &&    dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10|| dia == 11  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 5  &&    dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||dia == 25  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 5  && dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 3er. Turno");




                break;
            case 6:
                if (mes == 6 && dia == 1  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 6  &&    dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 6  &&   dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 6 &&    dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 6  &&     dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28|| dia == 29  ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ||dia == 6   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 7 &&  dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 7  && dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 7  &&  dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 7  && dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de 3er. Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 8  &&   dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  || dia == 10) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 8  &&    dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   || dia == 17 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 8  &&  dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  || dia == 24   ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 8  &&  dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText( "Fiscalia de 1er. Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7 ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 9  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||dia == 14 ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 9 &&    dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||dia ==  28   ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 9  &&   dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de 3er. Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 10  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19  ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 10  &&     dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 1er. Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1 ||  dia == 2) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ||dia == 16 ) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 )
                    tv1.setText( "Fiscalia de 2do. Turno");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||  dia == 7) {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 12  &&    dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de 1er. Turno");
                } else if (mes == 12 &&     dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20|| dia == 21    ) {
                    tv1.setText( "Fiscalia de 2do. Turno");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27|| dia == 28   )   {
                    tv1.setText( "Fiscalia de 3er. Turno");
                } else if (mes == 12  &&   dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de 1er. Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }


    public void PandoYToledo2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();

        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia de 1º. Turno");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText( "Fiscalia de 2º. Turno");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText( "Fiscalia de 3º. Turno ");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText( "Fiscalia de 1º. Turno ");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText( "Fiscalia de 2º. Turno ");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText( "Fiscalia de 3º. Turno");
                break;

            case 3:

                if (mes == 3 && dia == 1  ||  dia == 2 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 3  &&    dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  || dia == 9  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 3  && dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15  ||  dia == 16 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 3  && dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 3  && dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29  ||  dia == 30 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                }  else if (mes == 3  &&  dia == 31   )
                    tv1.setText( "Fiscalia de 2º. Turno");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 4 && dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12||dia == 13  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 4  &&  dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 4  && dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 4  && dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia de 3º. Turno");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ||dia == 4 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 5  &&    dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10|| dia == 11  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 5  &&    dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24  ||dia == 25  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 5  && dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 1º. Turno");




                break;
            case 6:
                if (mes == 6 && dia == 1  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 6  &&    dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 6  &&   dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia ==  15) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 6 &&    dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 6  &&     dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28|| dia == 29  ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 6  &&    dia == 30  )
                    tv1.setText( "Fiscalia de 3º. Turno");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ||dia == 6   ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 7 &&  dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 7  && dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ||dia == 20 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 7  &&  dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  || dia == 27) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 7  && dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia de 1º. Turno");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 8  &&   dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  || dia == 10) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 8  &&    dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   || dia == 17 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 8  &&  dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  || dia == 24   ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 8  &&  dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 ||  dia == 31  )
                    tv1.setText( "Fiscalia de 2º. Turno");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  || dia == 7 ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 9  &&   dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13 ||dia == 14 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 9 &&    dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 9  &&     dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27 ||dia ==  28   ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 9  &&   dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia de 1º. Turno");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 10  &&    dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11 || dia == 12) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 10  &&   dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18  || dia == 19  ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 10  &&     dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25 || dia == 26   ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 10  &&    dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia de 2º. Turno");

                break;

            case 11:

                if (mes == 11 && dia == 1 ||  dia == 2) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 11  &&  dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 11  &&  dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ||dia == 16 ) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 11  &&   dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 || dia == 23 ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 11  &&  dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30 )
                    tv1.setText( "Fiscalia de 3º. Turno");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ||  dia == 7) {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 12  &&    dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ||  dia == 14   ) {
                    tv1.setText( "Fiscalia de 2º. Turno");
                } else if (mes == 12 &&     dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20|| dia == 21    ) {
                    tv1.setText( "Fiscalia de 3º. Turno");
                } else if (mes == 12  &&   dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27|| dia == 28   )   {
                    tv1.setText( "Fiscalia de 1º. Turno");
                } else if (mes == 12  &&   dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText( "Fiscalia de 2º. Turno");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }





    //Método para el botón Anterior
    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

}