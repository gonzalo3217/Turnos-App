package com.example.turnosapp;



import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        et1 = (EditText) findViewById(R.id.editTextNumber2);
        et2 = (EditText) findViewById(R.id.editTexSeccional);
        tv1 = (TextView) findViewById(R.id.txt1);
    }

    public void Jurisdicciones(View view) {
        String dto_String = et1.getText().toString();
        String secc_String = et2.getText().toString();


        int dto = Integer.parseInt(dto_String);
        int secc = Integer.parseInt(secc_String);
        switch (dto) {
            case 1:
                if (secc  == 1 || secc == 2 || secc == 3 || secc == 4 || secc == 9 || secc == 10 ||secc== 11 || secc == 12 ) {
                    tv1.setText("Fiscalias Departamentales de Artigas");
                } else if (  secc == 5 || secc == 6 ||secc== 7 || secc == 8 )
                    tv1.setText("Fiscalia Departamental de Bella Unión");

                break;

            case 2:
                if (secc == 1 || secc == 2 || secc == 3 || secc == 11 || secc == 12 || secc == 13 ||secc== 15 ) {
                    tv1.setText("Fiscalias Departamentales de Canelones");
                } else if (  secc == 8 || secc == 17 ||secc== 22 || secc == 23 || secc == 24||secc== 29 ) {
                    tv1.setText("Fiscalias Departamentales de Atlantida");
                } else if (  secc == 18 || secc == 26 ||secc== 27 ) {
                    tv1.setText("Fiscalias Departamentales de Ciudad de la Costa");
                } else if (   secc == 28 ) {
                    tv1.setText(" Al Norte Pando y Tol.  Al sur C. de la Costa");
                } else if (   secc == 7 ||secc== 9 || secc == 10 || secc == 14 ||  secc == 25 ) {
                    tv1.setText("Fiscalia Departamental de  Pando  ");
                } else if (  secc == 6  ||secc== 16 || secc== 20 ) {
                    tv1.setText("Fiscalias Departamental  de Toledo");
                } else if (  secc == 4 || secc == 5 ||secc== 19 || secc == 21  )
                    tv1.setText("Fiscalia Departamental de Las Piedras");
                break;


            case 3:
                if (secc  == 1 || secc == 2 ||  secc == 4 ||secc == 5 ||secc == 6 ||secc== 7 || secc == 8 || secc == 10 ||secc== 11 || secc == 14 || secc == 15 ) {
                    tv1.setText("Fiscalias Departamentales de Cerro Largo");
                } else if (  secc == 3 ||secc == 13 || secc == 16 ||secc == 12 ) {
                    tv1.setText("Fiscalia Departamental de Rio Branco");
        } else if (  secc == 4 ||secc == 9  )
            tv1.setText("No es claro si va a C. Larg o R.Br");
                break;

            case 4:
                if ( secc == 1 || secc == 7 || secc == 14 ) {
                    tv1.setText("Fiscalia Departamental de Colonia");
                } else if (  secc == 3 || secc == 4 ||secc== 9 || secc == 10 ||secc== 11 || secc == 12 || secc == 13 ) {
                    tv1.setText("Fiscalia Departamental de Carmelo");
                } else if (  secc == 2 || secc == 5 ||secc== 6 || secc == 8 ||secc== 15 || secc == 16 || secc == 17 || secc == 18 )
                    tv1.setText("Fiscalia Departamental de Rosario");

                break;

            case 5:
                if ( secc == 1 || secc == 3 ||  secc == 5 || secc == 6 ||secc== 10 || secc == 11 ) {
                    tv1.setText("Fiscalias Departamentales de Maldonado");
                } else if (  secc == 2 || secc == 4 ||secc== 7 || secc == 8  ||secc== 9 ||  secc == 13){
                    tv1.setText("Fiscalia Departamental de San Carlos");
              } else if (   secc == 12 )
            tv1.setText("De lag del Sauce a r.104 Mal. De esta a lim. Rocha S.Carlos");
                break;

            case 6:
                if (secc == 1 || secc == 2 || secc == 3 || secc == 4 || secc == 5 || secc == 12 ) {
                    tv1.setText("Fiscalias Departamentales de Fray Bentos");
                } else if (   secc == 6 ||secc== 7 || secc == 8 || secc == 9  || secc == 10 || secc == 11)
                    tv1.setText("Fiscalia Departamental de  Young");
                break;
            case 7:
                if (secc == 2 || secc == 5 || secc == 6 || secc == 9 || secc == 13  ) {
                    tv1.setText("Fiscalias Departamentales de Chuy");
                } else if (  secc == 1 || secc == 3 || secc== 4 || secc == 7 || secc == 8 ||secc== 10 || secc == 11|| secc == 12)
                    tv1.setText("Fiscalia Departamental de Rocha");
                break;

            case 8:
                if ( secc == 1  || secc == 3 || secc == 4 || secc == 5 ||secc== 8 ||  secc == 9  ) {
                    tv1.setText("Fiscalias Departamentales de San Jose");
                } else if (  secc == 2 || secc == 6 ||secc== 7 || secc == 10 )
                    tv1.setText("Fiscalia Departamental de Libertad");
                break;

            case 9:
                if ( secc == 1 || secc == 2 || secc == 3 ||  secc == 6 || secc == 7 || secc == 8  || secc == 10 ||secc== 11 || secc == 12 ) {
                    tv1.setText("Fiscalias Departamentales de Mercedes");
                } else if (secc == 4 ||  secc == 5 || secc == 9   )
                    tv1.setText("Fiscalia Departamental de  Dolores");
                break;

            case 0:
                if ( secc == 1 || secc == 2 || secc == 5|| secc == 6 || secc == 7 || secc == 8 || secc == 10 ||secc== 12 || secc == 13 || secc == 14 ) {
                    tv1.setText("Fiscalias Departamentales de Tacuarembo");
                } else if (  secc == 3 ||secc == 4 ||  secc == 9 || secc == 11 )
                    tv1.setText("Fiscalia Departamental de Paso de los Toros");
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