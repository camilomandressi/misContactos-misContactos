package com.camilo.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {
    private RecyclerView listaMascotas;
    private ImageButton atras;
    ArrayList<Mascota> mascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritos);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvFavoritos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        initMascotas();
        inicializarAdaptador();

        atras = (ImageButton) findViewById(R.id.atras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setSupportActionBar(Toolbar miActionBar) {
    }

    private void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }


    public void initMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(1,"Puppy",R.drawable.perro6, "1"));
        mascotas.add(new Mascota(1,"Laika",R.drawable.perro3, "5"));
        mascotas.add(new Mascota(1,"Scooby",R.drawable.perro4, "3"));
        mascotas.add(new Mascota(1,"Rambo",R.drawable.perro5, "2"));
        mascotas.add(new Mascota(1,"Floky",R.drawable.perro7, "6"));

    }
}
