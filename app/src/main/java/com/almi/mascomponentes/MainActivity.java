package com.almi.mascomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView lblEdad;
    TextView lblPosicion;
    TextView lblMedia;
    TextView lblPrecio;
    Spinner lstJugadores;
    ImageView imagenes;
    static Jugador oLimpiar = new Jugador(R.drawable.cartavacia);
    static Jugador oMartial = new Jugador(25,"DC","81",1000.0,R.drawable.martial );
    static Jugador oFekir = new Jugador(28,"MC0","86",96000.0,R.drawable.fekir);
    static Jugador oSaintMaximin = new Jugador(24,"MI","79",3900.0, R.drawable.saintmaximin);
    static Jugador oGabrielJesus = new Jugador(24,"DC","83",1100.0,R.drawable.gabrieljesus);
    static Jugador oCourtois = new Jugador(30,"GK","89",35000.0,R.drawable.courtois);
    static Jugador oReguilon = new Jugador(24,"LI","81",750.0,R.drawable.reguilon);
    static ArrayList <Jugador> oJugadores = new ArrayList<Jugador>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarJugadores();
        lstJugadores = findViewById(R.id.listaJugadores);
        lblEdad = findViewById(R.id.lblEdad);
        lblPosicion = findViewById(R.id.lblPosicion);
        lblMedia = findViewById(R.id.lblMedia);
        lblPrecio = findViewById(R.id.lblPrecio);
        imagenes = (ImageView) findViewById(R.id.imagenxDefecto);

        lstJugadores.setSelection(6);
            lstJugadores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int iPosition, long l) {

                        lblEdad.setText(getString(R.string.lblEdad,oJugadores.get(iPosition).getiEdad()));
                        lblMedia.setText(getString(R.string.lblMedia,oJugadores.get(iPosition).getsMedia()));
                        lblPosicion.setText(getString(R.string.lblPosicion,oJugadores.get(iPosition).getsPosicion()));
                        lblPrecio.setText(getString(R.string.lblPrecio,oJugadores.get(iPosition).getdPrecio()));
                        imagenes.setImageResource(oJugadores.get(iPosition).getiImagen());

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    System.out.println("No has seleccionado ningun item");
                }
            });


    }
    public static void cargarJugadores(){
            oJugadores.add(oMartial);
            oJugadores.add(oFekir);
            oJugadores.add(oSaintMaximin);
            oJugadores.add(oGabrielJesus);
            oJugadores.add(oCourtois);
            oJugadores.add(oReguilon);
            oJugadores.add(oLimpiar);

    }


}
