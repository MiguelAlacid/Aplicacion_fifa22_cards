package com.almi.mascomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner lstColores = findViewById(R.id.listaColores);


        lstColores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int iPosition, long l) {
                String item = parent.getItemAtPosition(iPosition).toString();

                System.out.println("Position: " + iPosition);
                System.out.println("Texto   :" +  item);
                if (item.equals("Martial")){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                System.out.println("No has seleccionado ningun item");
            }
        });
    }
}