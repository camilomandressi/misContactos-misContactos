package com.camilo.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    private RecyclerView listaContactos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaContactos = (RecyclerView) findViewById(R.id.rvContactos);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        GridLayoutManager glm = new GridLayoutManager(this,2);
        listaContactos.setLayoutManager(glm);
        inicializarListaDeContactos();
        inicializarAdaptador();
    }


    public ContactoAdaptador adaptador;
    private void inicializarAdaptador(){
        adaptador = new ContactoAdaptador(contactos, this);
        listaContactos.setAdapter(adaptador);
    }

    private void setSupportActionBar(Toolbar miActionBar) {
    }

    public void inicializarListaDeContactos(){
        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto(R.drawable.perro6,"Puppy", "1"));
        contactos.add(new Contacto(R.drawable.perro2,"Ragnar", "0"));
        contactos.add(new Contacto(R.drawable.perro3,"Laika", "5"));
        contactos.add(new Contacto(R.drawable.perro4,"Scooby", "3"));
        contactos.add(new Contacto(R.drawable.perro5,"Rambo", "2"));
        contactos.add(new Contacto(R.drawable.perro7,"Floky", "6"));
    }

    public void getList(View v){
        Intent intent = new Intent(MainActivity.this, Favoritos.class);
        startActivity(intent);
    }

}
