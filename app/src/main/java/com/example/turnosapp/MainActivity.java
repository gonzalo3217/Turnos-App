package com.example.turnosapp;

import android.content.Intent;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Método el botón Siguiente
    public void Siguiete(View view){
        Intent siguiente = new Intent(this, MainActivity6.class);
        startActivity(siguiente);
    }

    //Método el botón Siguiente
    public void Siguiete1(View view){
        Intent siguiente1 = new Intent(this, MainActivity2.class);
        startActivity(siguiente1);
    }
    //Método el botón Siguiente
    public void Siguiete2(View view){
        Intent siguiente2 = new Intent(this, MainActivity3.class);
        startActivity(siguiente2);
    }

    //Método el botón Siguiente
    public void Siguiete3(View view){
        Intent siguiente3 = new Intent(this, MainActivity5.class);
        startActivity(siguiente3);
    }

    //Método el botón Siguiente
    public void Siguiete4(View view){
        Intent siguiente4 = new Intent(this, MainActivity4.class);
        startActivity(siguiente4);
    }
}
