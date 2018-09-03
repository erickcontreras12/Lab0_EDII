package com.example.erick.myapplication;

import android.content.ClipData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static android.widget.Toast.*;
import static com.example.erick.myapplication.ClaseGeneral.canciones;
import static com.example.erick.myapplication.ClaseGeneral.playlist;
//import static com.example.erick.myapplication.ClaseGeneral.playlist2;

public class MainActivity extends AppCompatActivity {
    Button play; ArrayAdapter adaptador;
    ListView lista; EditText busqueda;
    ClaseGeneral inicio = new ClaseGeneral();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nombres[] = {"Erick","Eduardo","Rodrigo","Renato","Jorge","Jose"};
        play = (Button)findViewById(R.id.btnPlaylist);
        lista = (ListView)findViewById(R.id.listView1);
        busqueda = (EditText)findViewById(R.id.edText);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actividad2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(actividad2);
            }
        });

        ArrayList mostrar = new ArrayList<>(canciones.keySet());
        adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mostrar);
        lista.setAdapter(adaptador);
        busqueda.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adaptador.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                makeText(adaptador.getContext(),"Listo", Toast.LENGTH_LONG);
                Cancion agregar = canciones.get(parent.getItemAtPosition(position).toString());
                playlist.add(agregar);
            }
        });

    }
}
