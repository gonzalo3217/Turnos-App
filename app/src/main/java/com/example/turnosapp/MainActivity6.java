package com.example.turnosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        tv1 = (TextView) findViewById(R.id.tv1);
    }

    public void ViolenciaDom2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {


            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4||dia == 5 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 11 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ||dia == 12  ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 11 &&   dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18||dia == 19 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 11 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 ||dia == 26 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 11 &&   dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 2");

                break;

            case 12:
                if (dia == 1 ||dia == 2||dia == 3 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if ( dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 )  {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if ( dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 ||dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 2");

                break;
            default:
                tv1.setText("Invalido");
                break;
        }
    }

    public void ViolenciaDom2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if ( dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if ( dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if ( dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if ( dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 3");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 2 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 2 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 2 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 2 &&  dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia Violencia Domestica 3");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 3 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 3 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 3 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 3 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 3");
                break;
            case 4:
                if (mes == 4 && dia == 1  ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 4 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 4 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 4 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 4 &&  dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 7");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 5 &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 5 &&  dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 5 &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia ==  26 || dia == 27 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 5 &&  dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 7");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 6 &&  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 6 &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 6 &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 6 &&  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 7");
                break;
            case 7:
                if (mes == 7 && dia == 1 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 7 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 7 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 7 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21||dia == 22 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 7 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 7 &&  dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 1");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 8 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 8 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 8 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ||dia == 26) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 8 &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 1");
                break;

            case 9:
                if (mes == 9 && dia == 1||dia == 2 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 9 &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ||dia == 9) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 9 &&  dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 9 &&  dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 9 &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 1");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6||dia == 7  ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 10 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13||dia == 14  ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 10 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 10 &&  dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 10 &&  dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 2");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 11 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 11 &&  dia == 12  || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 11 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 11 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 2");

                break;

            case 12:
                if (dia == 1 ||dia == 2) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16)  {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)  {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (dia == 31 )
                    tv1.setText("Fiscalia Violencia Domestica 3");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }

    public void ViolenciaDom2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 3");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 2 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 2 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 2 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 2 && dia == 25 || dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia Violencia Domestica 3");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 3 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 3 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 3 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 3 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 3");
                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 4 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 4 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 4 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 4 && dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 7");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 5 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 5 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 5 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 5 && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 7");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 6 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 6 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 6 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 6 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 7");
                break;
            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 7 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 7 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 7 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 1");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 8 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 8 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 8 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 8 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 1");
                break;

            case 9:
                if (mes == 9 && dia == 1) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 9 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 9 && dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 9 && dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 9 && dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 9 && dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 2");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 10 && dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 10 && dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 10 && dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 10 && dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 2");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 11 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 11 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 11 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 11 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 2");

                break;

            case 12:
                if (dia == 1) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 3");
                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }



    public void ViolenciaDom2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia Violencia Domestica 3");
            } else if (mes == 1  &&  dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia Violencia Domestica 7");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ) {
                tv1.setText( "Fiscalia Violencia Domestica 1");
            } else if (mes == 1  && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26  ) {
                tv1.setText( "Fiscalia Violencia Domestica 2");
            } else if (mes == 1  && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia Violencia Domestica 3");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 2  &&   dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 2  && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 2  &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                break;

            case 3:

                if (mes == 3 && dia == 1    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 3  && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 3  &&  dia == 9 || dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 3  &&  dia == 16 || dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 3  &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 3  &&  dia == 30 || dia == 31  );
                tv1.setText( "Fiscalia Violencia Domestica 7");




                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 4 &&   dia == 6 || dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 4  &&   dia == 13 || dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 4  &&  dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 4  &&   dia == 27 || dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia Violencia Domestica 7");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 5  &&    dia == 4 || dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 5  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 5  &&   dia == 18 || dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 5  &&  dia == 25 || dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia Violencia Domestica 7");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 6 &&  dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 6  &&    dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 6  &&    dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia Violencia Domestica 1");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 7 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 7  &&   dia == 13 || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 7  &&  dia == 20 || dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 7  &&  dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia Violencia Domestica 1");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 8  &&   dia == 3 || dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 8  &&    dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 8  &&   dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 8  && dia == 24  || dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 8  && dia == 31     )
                    tv1.setText( "Fiscalia Violencia Domestica 1");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 9  &&   dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 9 &&    dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 9  &&    dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 9  &&     dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia Violencia Domestica 1");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 10  &&   dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 10  && dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 10  &&    dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 10  &&   dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia Violencia Domestica 1");

                break;

            case 11:

                if (mes == 11 && dia == 1    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 11  &&  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 11  &&  dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 11  &&    dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29   ){
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 11  &&    dia == 30   )
                    tv1.setText( "Fiscalia Violencia Domestica 2");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 12  &&    dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 12 &&      dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 12  &&   dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||  dia == 25 ||dia == 26 ||   dia == 27  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 12  &&   dia == 28 ||  dia == 29 ||dia == 30 ||   dia == 31   )
                    tv1.setText( "Fiscalia Violencia Domestica 2");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }




    public void ViolenciaDom2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 1 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 1 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 1 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 1 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 2");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 2 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 2 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 2 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia Violencia Domestica 2");

                break;

            case 3:

                if ( dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if ( dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if ( dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (dia == 29 || dia == 30 || dia == 31)
                tv1.setText("Fiscalia Violencia Domestica 3");


                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 4 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 4 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 4 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 4 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 3");

                break;

            case 5:

                if (mes == 5 && dia == 1 || dia == 2) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 5 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 5 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 5 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 5 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 ){
                    tv1.setText("Fiscalia Violencia Domestica 3");
        } else if (mes == 5  &&   dia == 31 )
            tv1.setText( "Fiscalia Violencia Domestica 7");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 6  &&   dia == 7 ||dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 6 &&  dia == 14 ||dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 6  &&   dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 6  &&    dia ==  28|| dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia Violencia Domestica 7");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 7 &&  dia == 5  ||dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 7  &&   dia == 12 ||dia == 13 || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 7  && dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 7  &&  dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia Violencia Domestica 7");

                break;

            case 8:

                if (mes == 8 && dia == 1   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 8  &&   dia == 2||  dia == 3 || dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 8  &&   dia == 9  || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 8  &&  dia == 16 || dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 8  && dia == 23 ||dia == 24  || dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 8  &&  dia == 30 ||dia == 31     )
                    tv1.setText( "Fiscalia Violencia Domestica 1");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 9  &&  dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 9 &&    dia == 13||  dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19      ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 9  &&    dia == 20|| dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 9  &&     dia == 27|| dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia Violencia Domestica 1");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 10  &&   dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 10  &&  dia == 11 ||dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 10  &&    dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 10  &&  dia == 25  ||dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia Violencia Domestica 1");

                break;

            case 11:

                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 11  &&   dia == 8  || dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 11  &&   dia == 15 || dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 11  &&  dia == 22 ||dia == 23 || dia == 24 ||dia == 25||  dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 11  &&     dia == 29  ||  dia == 30)
                    tv1.setText( "Fiscalia Violencia Domestica 2");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 12  &&   dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 12 &&     dia == 13 || dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 12  &&   dia == 20|| dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||  dia == 25 ||dia == 26   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 12  &&    dia == 27  ||dia == 28 ||  dia == 29 ||dia == 30 ||   dia == 31   )
                    tv1.setText( "Fiscalia Violencia Domestica 2");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }




    public void ViolenciaDom2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 1 &&  dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 1 &&  dia == 10||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 1 &&  dia == 17||dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 1 && dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 1 &&  dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 7");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 2 && dia == 7|| dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 2 && dia == 14|| dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 2 &&  dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28){
                    tv1.setText("Fiscalia Violencia Domestica 2");
                }  else if (mes == 2 &&   dia == 28)
                    tv1.setText("Fiscalia Violencia Domestica 3");

                break;

            case 3:

                if ( dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (  dia == 7 ||dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (  dia == 14||dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if ( dia == 21 ||dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if ( dia == 28 ||dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Violencia Domestica 3");


                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 4 &&dia ==  4 ||dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 4 && dia == 11|| dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 4 &&dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 4 &&  dia == 25||dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Violencia Domestica 3");

                break;

            case 5:

                if (mes == 5 && dia == 1 ) {
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 5 && dia == 2|| dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText("Fiscalia Violencia Domestica 7");
                } else if (mes == 5 &&dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("Fiscalia Violencia Domestica 1");
                } else if (mes == 5 && dia == 16 ||dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("Fiscalia Violencia Domestica 2");
                } else if (mes == 5 &&dia == 23||  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29  ){
                    tv1.setText("Fiscalia Violencia Domestica 3");
                } else if (mes == 5  &&  dia == 30  ||dia == 31 )
                    tv1.setText( "Fiscalia Violencia Domestica 7");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia  == 3 || dia == 4 || dia == 5    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 6  && dia == 6 ||  dia == 7 ||dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 6 && dia == 13  || dia == 14 ||dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 6  && dia == 20   || dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 6  &&  dia == 27  ||  dia ==  28|| dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia Violencia Domestica 7");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 7 && dia == 4  || dia == 5  ||dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 7  &&  dia == 11   ||  dia == 12 ||dia == 13 || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 7  &&dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||  dia == 23 || dia == 24    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 7  &&dia == 25  ||  dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia Violencia Domestica 7");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2||  dia == 3 || dia == 4 ||  dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 8  &&   dia == 8  || dia == 9  || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 8  &&  dia  ==  15 ||  dia == 16 || dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21      ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 8  &&  dia == 22||dia == 23 ||dia == 24  || dia == 25 ||   dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 8  &&  dia == 29 ||  dia == 30 ||dia == 31     )
                    tv1.setText( "Fiscalia Violencia Domestica 1");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 9  &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 9 &&   dia == 12 ||  dia == 13||  dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18       ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 9  &&   dia == 19 || dia == 20|| dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 9  &&    dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia Violencia Domestica 1");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 10  &&   dia == 3  ||  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 10  &&   dia == 10  || dia == 11 ||dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 10  &&   dia == 17||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23     ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 10  &&   dia == 24 ||dia == 25  ||dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 ){
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 10  &&    dia == 31 )
                    tv1.setText( "Fiscalia Violencia Domestica 2");

                break;

            case 11:

                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 11  &&  dia == 7 || dia == 8  || dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 11  &&   dia == 14 ||dia == 15 || dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 11  && dia == 21|| dia == 22 ||dia == 23 || dia == 24 ||dia == 25||  dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 11  &&    dia ==  28 || dia == 29  ||  dia == 30)
                    tv1.setText( "Fiscalia Violencia Domestica 2");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 2");
                } else if (mes == 12  &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 3");
                } else if (mes == 12 &&   dia == 12  || dia == 13 || dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia Violencia Domestica 7");
                } else if (mes == 12  &&   dia == 19 || dia == 20|| dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||  dia == 25    ) {
                    tv1.setText( "Fiscalia Violencia Domestica 1");
                } else if (mes == 12  &&  dia == 26 || dia == 27  ||dia == 28 ||  dia == 29 ||dia == 30 ||   dia == 31   )
                    tv1.setText( "Fiscalia Violencia Domestica 2");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }





    public void Sex2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {


            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4||dia == 5 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 11 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ||dia == 12  ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 11 &&   dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18||dia == 19 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 11 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 ||dia == 26 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 11 &&   dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");

                break;

            case 12:
                if (dia == 1 ||dia == 2||dia == 3 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if ( dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 )  {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if ( dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 ||dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");

                break;
            default:
                tv1.setText("Invalido");
                break;
        }
    }

    public void Sex2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if ( dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if ( dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if ( dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if ( dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 2 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 2 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 2 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 2 &&  dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 3 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 3 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 3 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 3 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                break;
            case 4:
                if (mes == 4 && dia == 1  ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 4 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 4 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 4 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 4 &&  dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 5 &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 5 &&  dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 5 &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia ==  26 || dia == 27 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 5 &&  dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 6 &&  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 6 &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 6 &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 6 &&  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                break;
            case 7:
                if (mes == 7 && dia == 1 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 7 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 7 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 7 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21||dia == 22 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 7 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 7 &&  dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 8 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 8 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 8 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ||dia == 26) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 8 &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                break;

            case 9:
                if (mes == 9 && dia == 1||dia == 2 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 9 &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ||dia == 9) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 9 &&  dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 9 &&  dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 9 &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6||dia == 7  ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 10 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13||dia == 14  ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 10 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||dia == 21) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 10 &&  dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 10 &&  dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 11 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 11 &&  dia == 12  || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 11 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 11 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");

                break;

            case 12:
                if (dia == 1 ||dia == 2) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16)  {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)  {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (dia == 31 )
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }

    public void Sex2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 2 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 2 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 2 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 2 && dia == 25 || dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 3 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 3 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 3 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 3 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 4 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 4 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 4 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 4 && dia == 29 || dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 5 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 5 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 5 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 5 && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 6 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 6 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 6 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 6 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                break;
            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 7 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 7 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 7 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 8 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 8 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 8 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 8 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                break;

            case 9:
                if (mes == 9 && dia == 1) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 9 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 9 && dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 9 && dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 9 && dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 9 && dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 10 && dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 10 && dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 10 && dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 10 && dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 11 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 11 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 11 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 11 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");

                break;

            case 12:
                if (dia == 1) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                break;
            default:
                tv1.setText("Invalido");
                break;

        }
    }



    public void Sex2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
            } else if (mes == 1  &&  dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12  ) {
                tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
            } else if (mes == 1  &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19   ) {
                tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
            } else if (mes == 1  && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26  ) {
                tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
            } else if (mes == 1  && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31 )
                tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 2  &&   dia == 10 ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 2  && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 2  &&  dia == 24 || dia == 25 || dia == 26 || dia == 27   ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 2  &&  dia ==  28 || dia ==  29  )
                tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                break;

            case 3:

                if (mes == 3 && dia == 1    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 3  && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 3  &&  dia == 9 || dia == 10 || dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 3  &&  dia == 16 || dia == 17 || dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 3  &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 3  &&  dia == 30 || dia == 31  );
                tv1.setText( "Fiscalia V.D.y SEXUALES 5º");




                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 4 &&   dia == 6 || dia == 7 || dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 4  &&   dia == 13 || dia == 14 || dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 4  &&  dia == 20 || dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 4  &&   dia == 27 || dia ==  28 || dia == 29 ||dia == 30  )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 5  &&    dia == 4 || dia == 5|| dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 5  &&   dia == 11 || dia == 12 || dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 5  &&   dia == 18 || dia == 19 ||   dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 5  &&  dia == 25 || dia == 26 || dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 6 &&  dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 6  &&    dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 6  &&    dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 7 &&   dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 7  &&   dia == 13 || dia == 14 || dia ==  15  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 7  &&   dia == 16 || dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 7  && dia == 20 || dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26   ){
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
               } else if (mes == 7  &&  dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
        tv1.setText( "Fiscalia V.D.y SEXUALES 8º");

                break;

            case 8:

                if (mes == 8 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 8  &&   dia == 3 || dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 8  &&    dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 8  &&   dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 8  && dia == 24  || dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 8  && dia == 31     )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 9  &&   dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 9 &&    dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 9  &&    dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 9  &&     dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 10  &&   dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 10  && dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 10  &&    dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 10  &&   dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");

                break;

            case 11:

                if (mes == 11 && dia == 1    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 11  &&  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 11  &&  dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 11  &&    dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29   ){
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 11  &&    dia == 30   )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 12  &&    dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 12 &&      dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 12  &&   dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||  dia == 25 ||dia == 26 ||   dia == 27  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 12  &&   dia == 28 ||  dia == 29 ||dia == 30 ||   dia == 31   )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }




    public void Sex2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 1 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 1 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 1 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 1 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 2 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 2 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 2 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");

                break;

            case 3:

                if ( dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if ( dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if ( dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if ( dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (dia == 29 || dia == 30 || dia == 31)
                tv1.setText("Fiscalia V.D.y SEXUALES 6º");


                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 4 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 4 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 4 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 4 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");

                break;

            case 5:

                if (mes == 5 && dia == 1 || dia == 2) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 5 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 5 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 5 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 5 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 ){
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 5  &&   dia == 31 )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 6  &&   dia == 7 ||dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 6 &&  dia == 14 ||dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 6  &&   dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26 || dia == 27     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 6  &&    dia ==  28|| dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 7 &&  dia == 5  ||dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 7  &&   dia == 12 ||dia == 13 || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 7  && dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||  dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 7  &&  dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");

                break;

            case 8:

                if (mes == 8 && dia == 1   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 8  &&   dia == 2||  dia == 3 || dia == 4 ||  dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 8  &&   dia == 9  || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia  ==  15     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 8  &&  dia == 16 || dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21 || dia == 22     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 8  && dia == 23 ||dia == 24  || dia == 25 ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 8  &&  dia == 30 ||dia == 31     )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 9  &&  dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 9 &&    dia == 13||  dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19      ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 9  &&    dia == 20|| dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 9  &&     dia == 27|| dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 10  &&   dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 10  &&  dia == 11 ||dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 10  &&    dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 10  &&  dia == 25  ||dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");

                break;

            case 11:

                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 11  &&   dia == 8  || dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 11  &&   dia == 15 || dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 11  &&  dia == 22 ||dia == 23 || dia == 24 ||dia == 25||  dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 11  &&     dia == 29  ||  dia == 30)
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 12  &&   dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 12 &&     dia == 13 || dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 12  &&   dia == 20|| dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||  dia == 25 ||dia == 26   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 12  &&    dia == 27  ||dia == 28 ||  dia == 29 ||dia == 30 ||   dia == 31   )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }





    public void Sex2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 1 &&  dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 1 &&  dia == 10||dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 1 &&  dia == 17||dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 1 && dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
               } else if (mes == 1 &&  dia == 31)
            tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 2 && dia == 7|| dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 2 && dia == 14|| dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 2 &&  dia == 21||dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28){
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
            }  else if (mes == 2 &&   dia == 28)
            tv1.setText("Fiscalia V.D.y SEXUALES 6º");

                break;

            case 3:

                if ( dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (  dia == 7 ||dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (  dia == 14||dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if ( dia == 21 ||dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if ( dia == 28 ||dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");


                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 4 &&dia ==  4 ||dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 4 && dia == 11|| dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 4 &&dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 4 &&  dia == 25||dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");

                break;

            case 5:

                if (mes == 5 && dia == 1 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 5 && dia == 2|| dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 5 &&dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 5 && dia == 16 ||dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 5 &&dia == 23||  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29  ){
                    tv1.setText("Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 5  &&  dia == 30  ||dia == 31 )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia  == 3 || dia == 4 || dia == 5    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 6  && dia == 6 ||  dia == 7 ||dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 6 && dia == 13  || dia == 14 ||dia ==  15 || dia == 16 || dia == 17 ||  dia == 18 || dia == 19  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 6  && dia == 20   || dia == 21 || dia == 22 || dia == 23 || dia == 24 ||dia == 25 || dia == 26     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 6  &&  dia == 27  ||  dia ==  28|| dia == 29 || dia == 30  )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 7 && dia == 4  || dia == 5  ||dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 7  &&  dia == 11   ||  dia == 12 ||dia == 13 || dia == 14 || dia ==  15  ||  dia == 16 || dia == 17  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 7  &&dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22 ||  dia == 23 || dia == 24    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 7  &&dia == 25  ||  dia == 26|| dia == 27 || dia ==  28 ||dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2||  dia == 3 || dia == 4 ||  dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 8  &&   dia == 8  || dia == 9  || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 8  &&  dia  ==  15 ||  dia == 16 || dia == 17 || dia == 18 ||  dia == 19 || dia == 20 || dia == 21      ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 8  &&  dia == 22||dia == 23 ||dia == 24  || dia == 25 ||   dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 8  &&  dia == 29 ||  dia == 30 ||dia == 31     )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 9  &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 9 &&   dia == 12 ||  dia == 13||  dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18       ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 9  &&   dia == 19 || dia == 20|| dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 9  &&    dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 10  &&   dia == 3  ||  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 10  &&   dia == 10  || dia == 11 ||dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 10  &&   dia == 17||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23     ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 10  &&   dia == 24 ||dia == 25  ||dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 ){
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
              } else if (mes == 10  &&    dia == 31 )
            tv1.setText( "Fiscalia V.D.y SEXUALES 5º");

                break;

            case 11:

                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 11  &&  dia == 7 || dia == 8  || dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 11  &&   dia == 14 ||dia == 15 || dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 11  && dia == 21|| dia == 22 ||dia == 23 || dia == 24 ||dia == 25||  dia == 26 || dia == 27   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 11  &&    dia ==  28 || dia == 29  ||  dia == 30)
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");


                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");
                } else if (mes == 12  &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 6º");
                } else if (mes == 12 &&   dia == 12  || dia == 13 || dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18   ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 8º");
                } else if (mes == 12  &&   dia == 19 || dia == 20|| dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||  dia == 25    ) {
                    tv1.setText( "Fiscalia V.D.y SEXUALES 4º");
                } else if (mes == 12  &&  dia == 26 || dia == 27  ||dia == 28 ||  dia == 29 ||dia == 30 ||   dia == 31   )
                    tv1.setText( "Fiscalia V.D.y SEXUALES 5º");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }


    public void Adolescentes2017(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {


            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ||dia == 5 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11 &&  dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11  || dia == 12 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18 ||dia == 19) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25||dia == 26  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11 &&   dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 12:
                if (dia == 1 ||dia == 2||dia == 3 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 ||dia == 17)  {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if ( dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 ||dia == 24) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");


                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }



    public void Adolescentes2018(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if ( dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if ( dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if ( dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if ( dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 2 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 2 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2 &&  dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3 || dia == 4 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 3 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3 &&  dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 3 &&  dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;
            case 4:
                if (mes == 4 && dia == 1  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4 &&  dia == 30)
                    tv1.setText("Fiscalia Adolescentes 1");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 5 &&  dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5 &&  dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 5 &&  dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia ==  26 || dia == 27 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5 &&  dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6 &&  dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9||dia == 10 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6 &&  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16||dia == 17 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6 &&  dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23||dia == 24 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6 &&  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Adolescentes 1");
                break;
            case 7:
                if (mes == 7 && dia == 1 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ||dia == 8) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7 &&  dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 ||dia == 15) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7 &&  dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21||dia == 22 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7 &&  dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7 &&  dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8 &&  dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 ||dia == 19) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8 &&  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 ||dia == 26) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8 &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 9:
                if (mes == 9 && dia == 1||dia == 2 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9 &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 ||dia == 9) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9 &&  dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 ||dia == 16) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9 &&  dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 ||dia == 23) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9 &&  dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Adolescentes 3");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 ||dia == 7) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10 &&  dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 ||  dia == 21) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 1");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11 &&  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 ||dia == 11 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11 &&  dia == 12  || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24||dia == 25 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11 &&  dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 12:
                if (dia == 1 ||dia == 2) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16)  {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)  {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if ( dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }






    public void Adolescentes2019(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);
        switch (mes) {
            case 1:
                if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 2:
                if (mes == 2 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 2 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 2 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2 && dia == 25 || dia == 26 || dia == 27 || dia == 28)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 3:
                if (mes == 3 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 3 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 3 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4 && dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Adolescentes 1");
                break;
            case 5:
                if (mes == 5 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5 && dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 5 && dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5 && dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 5 && dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 1");
                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6 && dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6 && dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6 && dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6 && dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Adolescentes 1");
                break;
            case 7:
                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7 && dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7 && dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7 && dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7 && dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 8:
                if (mes == 8 && dia == 1 || dia == 2 || dia == 3 || dia == 4) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8 && dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8 && dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8 && dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8 && dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 9:
                if (mes == 9 && dia == 1) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9 && dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9 && dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9 && dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9 && dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9 && dia == 30)
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10 && dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10 && dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10 && dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10 && dia == 28 || dia == 29 || dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 1");
                break;

            case 11:
                if (mes == 11 && dia == 1 || dia == 2 || dia == 3) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11 && dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11 && dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11 && dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11 && dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30)
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 12:
                if (dia == 1) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (dia == 30 || dia == 31)
                    tv1.setText("Fiscalia Adolescentes 3");

                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }








    public void Adolescentes2020(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);

        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 ) {
                tv1.setText("Fiscalia Adolescentes 3");
            } else if (mes == 1  &&   dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                tv1.setText("Fiscalia Adolescentes 1");
            } else if (mes == 1  &&  dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                tv1.setText("Fiscalia Adolescentes 3");
            } else if (mes == 1  &&   dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26   ) {
                tv1.setText("Fiscalia Adolescentes 1");
            } else if (mes == 1  &&  dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText("Fiscalia Adolescentes 3");

                break;

            case 2:

                if (mes == 2 && dia == 1 || dia == 2   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 2  &&  dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2  && dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15 || dia == 16   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 2  && dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2  &&  dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia ==  29  )
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 3:

                if (mes == 3 && dia == 1   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 3  &&    dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3  &&  dia == 9 || dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 || dia == 15 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 3  &&   dia == 16 || dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21 || dia == 22  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3  &&dia == 23 || dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28 || dia == 29   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                }  else if (mes == 3  &&  dia == 30 || dia == 31   )
                    tv1.setText("Fiscalia Adolescentes 1");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4 &&dia == 6 || dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4  && dia == 13 || dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4  && dia == 20 || dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4  && dia == 27 || dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5  &&   dia == 4 || dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 5  &&   dia == 11 || dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5  &&   dia == 18 || dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 5  &&dia == 25 || dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Adolescentes 1");




                break;
            case 6:
                if (mes == 6 && dia == 1 || dia == 2 ||  dia  == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6  &&   dia == 8 || dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 || dia == 14) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6 &&   dia ==  15 || dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 || dia == 21) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6  &&    dia == 22 || dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6  &&   dia == 29 || dia == 30  )
                    tv1.setText("Fiscalia Adolescentes 3");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7 && dia == 6 || dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7  && dia == 13 || dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18 || dia == 19 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7  && dia == 20 || dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25 || dia == 26  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7  &&dia == 27 || dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText("Fiscalia Adolescentes 3");

                break;

            case 8:

                if (mes == 8 && dia == 1  ||  dia == 2 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8  &&  dia == 3 || dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8  &&   dia == 10 || dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15 || dia == 16   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8  && dia == 17 || dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8  && dia == 24  || dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29 || dia == 30   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8  &&    dia == 31 )
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9  &&   dia == 7 || dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12 ||dia == 13    ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9 &&    dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20     ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9  &&    dia == 21 ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 || dia == 27   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9  &&     dia ==  28 || dia == 29 || dia == 30   )
                    tv1.setText("Fiscalia Adolescentes 1");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 || dia == 4     ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10  &&   dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10  || dia == 11    ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10  && dia == 12 ||  dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10  &&    dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24  || dia == 25   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10  &&   dia == 26 || dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 11:

                if (mes == 11 && dia == 1    ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11  &&  dia == 2 || dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11  &&  dia == 9 || dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 || dia == 15  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11  &&  dia == 16 || dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21 ||dia == 22  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11  &&    dia == 23 || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29   ){
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11  &&    dia == 30   )
                    tv1.setText("Fiscalia Adolescentes 3");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 12  &&    dia == 7 || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11 || dia == 12 || dia == 13  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 12 &&      dia == 14  || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 12  &&   dia == 21 ||  dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 )   {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 12  &&   dia == 28 ||  dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText("Fiscalia Adolescentes 3");




                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }










    public void Adolescentes2021(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);


        switch (mes) {
            case 1: if (dia == 1 || dia == 2 || dia == 3  ) {
                tv1.setText("Fiscalia Adolescentes 3");
            } else if (mes == 1  &&   dia == 4 || dia == 5 ||dia == 6 ||dia == 7 || dia == 8 || dia == 9 || dia == 10   ) {
                tv1.setText("Fiscalia Adolescentes 1");
            } else if (mes == 1  &&  dia == 11 || dia == 12 || dia == 13 ||dia == 14 || dia == 15 || dia == 16 || dia == 17 ) {
                tv1.setText("Fiscalia Adolescentes 3");
            } else if (mes == 1  && dia == 18 || dia == 19  ||  dia == 20 ||dia == 21 || dia == 22 || dia == 23 || dia == 24   ) {
                tv1.setText("Fiscalia Adolescentes 1");
            } else if (mes == 1  &&  dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31    )
                tv1.setText("Fiscalia Adolescentes 3");


                break;

            case 2:


                if (mes == 2  && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7    ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2  && dia == 8 || dia == 9 || dia == 10 ||   dia == 11 || dia == 12 || dia == 13 || dia == 14   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 2  &&  dia == 15 || dia == 16 ||dia == 17||   dia == 18 || dia == 19 || dia == 20 || dia == 21    ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2  &&  dia == 22 || dia == 23 ||dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   )
                    tv1.setText("Fiscalia Adolescentes 3");
                break;

            case 3:

                if (mes == 3  &&   dia == 1  ||  dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6 || dia == 7    ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3  &&  dia == 8 || dia == 9 || dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 3  &&dia == 15 || dia == 16   ||  dia == 17 ||  dia == 18|| dia == 19 || dia == 20 || dia == 21  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3  && dia == 22 ||  dia == 23||dia == 24 ||  dia == 25 || dia == 26 || dia == 27 || dia ==  28   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                }  else if (mes == 3  &&  dia == 29 ||  dia == 30 ||dia == 31   )
                    tv1.setText("Fiscalia Adolescentes 1");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3 || dia == 4  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4 && dia == 5  || dia == 6|| dia == 7   ||  dia == 8 ||dia == 9 || dia == 10 || dia == 11 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4  && dia == 12  || dia == 13|| dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4  &&  dia == 19 || dia == 20 ||dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  || dia == 25  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4  && dia == 26 || dia == 27 || dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 5:

                if  (mes == 5 && dia == 1 || dia == 2 || dia == 3   || dia == 4 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5  &&  dia == 5  ||dia == 6 ||dia == 7  || dia == 8 || dia == 9 || dia == 10  ||dia == 11 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 || dia == 16 || dia == 17  ||  dia == 18) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5  &&   dia == 19  ||  dia == 20 ||dia == 21|| dia == 22 || dia == 23 || dia == 24 || dia == 25 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 5  && dia == 26 ||  dia == 27|| dia ==  28 || dia == 29 || dia == 30 || dia == 31 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5  &&  dia == 31 )
                    tv1.setText("Fiscalia Adolescentes 3");




                break;
            case 6:
                if  (mes == 6  &&  dia == 1 || dia == 2 || dia  == 3 || dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6  &&  dia == 7 || dia == 8  ||dia == 9  || dia == 10 ||dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6 &&    dia == 14 || dia ==  15 ||dia == 16  || dia == 17 ||  dia == 18 || dia == 19 || dia == 20 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6  &&  dia == 21  || dia == 22  ||dia == 23   ||  dia == 24 ||dia == 25 || dia == 26 || dia == 27  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6  &&  dia ==  28  ||  dia == 29|| dia == 30  )
                    tv1.setText("Fiscalia Adolescentes 3");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3 || dia == 4  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7 &&  dia == 5  || dia == 6|| dia == 7  || dia == 8 || dia == 9 || dia == 10 || dia == 11  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7  && dia == 12  ||dia == 13 ||dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17 || dia == 18  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7  &&  dia == 19|| dia == 20 ||dia == 21 || dia == 22 ||  dia == 23 || dia == 24  || dia == 25  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7  && dia == 26 || dia == 27 ||dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText("Fiscalia Adolescentes 3");

                break;

            case 8:

                if (mes == 8 && dia == 1   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8  &&  dia == 2 || dia == 3 || dia == 4  ||  dia == 5 || dia == 6 || dia == 7 || dia == 8   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8  &&  dia == 9|| dia == 10   ||dia == 11 ||  dia == 12 || dia == 13 || dia == 14 || dia  ==  15    ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8  &&  dia == 16 ||dia == 17 ||dia == 18  ||   dia == 19 || dia == 20 || dia == 21 || dia == 22   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8  && dia == 23  ||dia == 24   ||dia == 25  ||   dia == 26 || dia == 27 || dia ==  28 || dia == 29  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8  &&    dia == 30 ||  dia == 31    )
                    tv1.setText("Fiscalia Adolescentes 1");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4 || dia == 5 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9  &&  dia == 6  ||  dia == 7  ||dia == 8 ||  dia == 9 || dia == 10 || dia == 11 || dia == 12   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9 && dia == 13   ||  dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9  &&     dia == 20    || dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25 || dia == 26 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9  &&    dia == 27 ||  dia ==  28  ||dia == 29 || dia == 30   )
                    tv1.setText("Fiscalia Adolescentes 1");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 || dia == 3 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10  &&    dia == 4   ||  dia == 5  ||dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10    ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10  && dia == 11  ||  dia == 12|| dia == 13 || dia == 14 || dia  ==  15 || dia == 16 || dia == 17  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10  &&   dia == 18  || dia == 19  ||  dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24     ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10  &&  dia == 25  || dia == 26|| dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 11:

                if (mes == 11  && dia == 1  ||  dia == 2    ||   dia == 3 ||dia == 4 || dia == 5 || dia == 6 || dia == 7 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11  &&  dia == 8  ||  dia == 9  ||dia == 10  ||  dia == 11 || dia == 12 || dia == 13 || dia == 14 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11  &&  dia == 15  || dia == 16  ||dia == 17 ||dia == 18 || dia == 19 || dia == 20 || dia == 21  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11  && dia == 22 || dia == 23   || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27 || dia ==  28 || dia == 29||   dia == 30  ) {
                    tv1.setText("Fiscalia Adolescentes 1");

                } else if (mes == 11  &&  dia == 29||   dia == 30  )
                    tv1.setText("Fiscalia Adolescentes 3");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4 || dia == 5 ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 12  &&    dia == 6  || dia == 7  || dia == 8 ||  dia == 9 || dia == 9 || dia == 10 || dia == 11    || dia == 14  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 12 &&  dia == 12 || dia == 13   || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18 || dia == 19    ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 12  &&   dia == 20 ||dia == 21 || dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25 ||  dia == 26    )   {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 12  &&  dia == 27||dia == 28  || dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText("Fiscalia Adolescentes 3");



            break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }






    public void Adolescentes2022(View view) {
        String mes_String = et1.getText().toString();
        String dia_String = et2.getText().toString();


        int mes = Integer.parseInt(mes_String);
        int dia = Integer.parseInt(dia_String);


        switch (mes) {
            case 1: if (dia == 1 || dia == 2   ) {
                tv1.setText("Fiscalia Adolescentes 3");
            } else if (mes == 1  &&   dia == 3 ||dia == 4 || dia == 5 ||dia == 6 ||dia == 7 || dia == 8 || dia == 9   ) {
                tv1.setText("Fiscalia Adolescentes 1");
            } else if (mes == 1  &&  dia == 10||  dia == 11 || dia == 12 || dia == 13 ||dia == 14 || dia == 15 || dia == 16  ) {
                tv1.setText("Fiscalia Adolescentes 3");
            } else if (mes == 1  &&  dia == 17||dia == 18 || dia == 19  ||  dia == 20 ||dia == 21 || dia == 22 || dia == 23    ) {
                tv1.setText("Fiscalia Adolescentes 1");
            } else if (mes == 1  &&   dia == 24||dia == 25 || dia == 26 || dia == 27 || dia == 28 || dia == 29 || dia == 30 || dia == 31   ) {
                tv1.setText("Fiscalia Adolescentes 3");
            } else if (mes == 1  &&  dia == 31   )
                tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 2:


                if (mes == 2  && dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6    ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2  &&  dia == 7|| dia == 8 || dia == 9 || dia == 10 ||   dia == 11 || dia == 12 || dia == 13   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 2  &&  dia == 14  ||dia == 15 || dia == 16 ||dia == 17||   dia == 18 || dia == 19 || dia == 20    ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 2  &&  dia == 21 || dia == 22 || dia == 23 ||dia == 24|| dia == 25 || dia == 26 || dia == 27 || dia ==  28   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
               } else if (mes == 2  &&   dia ==  28   )
            tv1.setText("Fiscalia Adolescentes 1");
                break;

            case 3:

                if (mes == 3  &&   dia == 1  ||  dia == 2 || dia == 3||dia == 4 || dia == 5 || dia == 6    ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3  &&   dia == 7|| dia == 8 || dia == 9 || dia == 10 ||  dia == 11  ||  dia == 12 || dia == 13  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 3  &&dia == 14|| dia == 15 || dia == 16   ||  dia == 17 ||  dia == 18|| dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 3  && dia == 21 || dia == 22 ||  dia == 23||dia == 24 ||  dia == 25 || dia == 26 || dia == 27    ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                }  else if (mes == 3  &&  dia ==  28 ||dia == 29 ||  dia == 30 ||dia == 31   )
                    tv1.setText("Fiscalia Adolescentes 1");

                break;
            case 4:
                if (mes == 4 && dia == 1 || dia == 2 || dia == 3   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4 &&  dia == 4||dia == 5  || dia == 6|| dia == 7   ||  dia == 8 ||dia == 9 || dia == 10  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4  &&  dia == 11||dia == 12  || dia == 13|| dia == 14 ||   dia ==  15 || dia == 16 || dia == 17 || dia == 18 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 4  &&  dia == 19 || dia == 20 ||dia == 21  ||  dia == 22 ||dia == 23 || dia == 24  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 4  &&  dia == 25 || dia == 26 || dia == 27 || dia ==  28  ||  dia == 29 ||dia == 30  )
                    tv1.setText("Fiscalia Adolescentes 1");

                break;

            case 5:

                if  (mes == 5 && dia == 1  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (dia == 2 || dia == 3   || dia == 4|| mes == 5  &&  dia == 5  ||dia == 6 ||dia == 7  || dia == 8  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if ( dia == 9 || dia == 10  ||dia == 11||mes == 5  &&  dia == 12  ||  dia == 13 || dia == 14|| dia ==  15 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5  &&  dia == 16 || dia == 17  ||  dia == 18  ||dia == 19  ||  dia == 20 ||dia == 21|| dia == 22  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 5  &&  dia == 23 || dia == 24 || dia == 25||dia == 26 ||  dia == 27|| dia ==  28 || dia == 29  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 5  &&  dia == 30 || dia == 31 )
                    tv1.setText("Fiscalia Adolescentes 3");




                break;
            case 6:
                if  (mes == 6  &&  dia == 1 || dia == 2 || dia  == 3 || dia == 4 || dia == 5  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6  &&   dia == 6 ||dia == 7 || dia == 8  ||dia == 9  || dia == 10 ||dia == 11 || dia == 12 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6 &&    dia == 13  ||dia == 14 || dia ==  15 ||dia == 16  || dia == 17 ||  dia == 18 || dia == 19  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 6  &&  dia == 20 ||dia == 21  || dia == 22  ||dia == 23   ||  dia == 24 ||dia == 25 || dia == 26  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 6  &&dia == 27  ||  dia ==  28  ||  dia == 29|| dia == 30  )
                    tv1.setText("Fiscalia Adolescentes 3");

                break;
            case 7:

                if (mes == 7 && dia == 1 || dia == 2 || dia == 3  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7 &&  dia == 4 || dia == 5  || dia == 6|| dia == 7  || dia == 8 || dia == 9 || dia == 10   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7  &&dia == 11 || dia == 12  ||dia == 13 ||dia == 14 ||   dia ==  15  ||  dia == 16 || dia == 17   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 7  &&  dia == 18 ||dia == 19|| dia == 20 ||dia == 21 || dia == 22 ||  dia == 23 || dia == 24   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 7  &&  dia == 25 ||dia == 26 || dia == 27 ||dia ==  28  ||  dia == 29 ||  dia == 30  || dia == 31 )
                    tv1.setText("Fiscalia Adolescentes 3");

                break;

            case 8:


                 if (mes == 8  && dia == 1 || dia == 2 || dia == 3 || dia == 4  ||  dia == 5 || dia == 6 || dia == 7   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8  &&  dia == 8  ||dia == 9|| dia == 10   ||dia == 11 ||  dia == 12 || dia == 13 || dia == 14    ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8  && dia  ==  15 ||  dia == 16 ||dia == 17 ||dia == 18  ||   dia == 19 || dia == 20 || dia == 21   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 8  &&  dia == 22 ||dia == 23  ||dia == 24   ||dia == 25  ||   dia == 26 || dia == 27 || dia ==  28  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 8  && dia == 29   ||  dia == 30 ||  dia == 31    )
                    tv1.setText("Fiscalia Adolescentes 1");


                break;

            case 9:
                if (mes == 9 && dia == 1 || dia == 2  || dia  == 3 || dia == 4  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9  && dia == 5 || dia == 6  ||  dia == 7  ||dia == 8 ||  dia == 9 || dia == 10 || dia == 11   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9 && dia == 12 || dia == 13   ||  dia == 14  || dia ==  15 ||dia == 16 || dia == 17 || dia == 18   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 9  &&  dia == 19  ||  dia == 20    || dia == 21 || dia == 22 ||dia == 23 || dia == 24  || dia == 25) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 9  &&    dia == 26 ||  dia == 27 ||  dia ==  28  ||dia == 29 || dia == 30   )
                    tv1.setText("Fiscalia Adolescentes 1");


                break;

            case 10:
                if (mes == 10 && dia == 1 || dia == 2 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10  &&   dia == 3  || dia == 4   ||  dia == 5  ||dia == 6 || dia == 7 || dia == 8 || dia == 9    ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10  && dia == 10  ||dia == 11  ||  dia == 12|| dia == 13 || dia == 14 || dia  ==  15 || dia == 16  ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 10  && dia == 17   || dia == 18  || dia == 19  ||  dia == 20 || dia == 21 || dia == 22 || dia == 23   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 10  &&  dia == 24  ||  dia == 25  || dia == 26|| dia == 27 ||dia ==  28 || dia == 29 || dia == 30 || dia == 31 ) {
                    tv1.setText("Fiscalia Adolescentes 1");

        }       else if (mes == 10  &&   dia == 31 )
            tv1.setText("Fiscalia Adolescentes 3");

                break;

            case 11:

                if (mes == 11  && dia == 1  ||  dia == 2    ||   dia == 3 ||dia == 4 || dia == 5 || dia == 6  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11  && dia == 7 || dia == 8  ||  dia == 9  ||dia == 10  ||  dia == 11 || dia == 12 || dia == 13 ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 11  && dia == 14  || dia == 15  || dia == 16  ||dia == 17 ||dia == 18 || dia == 19 || dia == 20  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 11  && dia == 21  ||dia == 22 || dia == 23   || dia == 24 ||dia == 25 ||  dia == 26 || dia == 27  ) {
                    tv1.setText("Fiscalia Adolescentes 1");

                } else if (mes == 11  && dia ==  28 || dia == 29||   dia == 30   )
                    tv1.setText("Fiscalia Adolescentes 3");

                break;

            case 12:

                if (mes == 12 && dia == 1 ||  dia == 2 || dia  == 3 || dia == 4  ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 12  &&  dia == 5  || dia == 6  || dia == 7  || dia == 8 ||   dia == 9 || dia == 10 || dia == 11   ) {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 12 &&  dia == 12 || dia == 13   || dia == 14   || dia ==  15 || dia == 16 ||  dia == 17 || dia == 18   ) {
                    tv1.setText("Fiscalia Adolescentes 3");
                } else if (mes == 12  && dia == 19   ||  dia == 20 ||dia == 21 || dia == 22 ||dia == 23 ||   dia == 24 ||dia == 25   )   {
                    tv1.setText("Fiscalia Adolescentes 1");
                } else if (mes == 12  && dia == 26   ||  dia == 27||dia == 28  || dia == 29 || dia == 30 || dia == 31  )
                    tv1.setText("Fiscalia Adolescentes 3");



                break;
            default:
                tv1.setText("Invalido");
                break;

        }

    }

}
