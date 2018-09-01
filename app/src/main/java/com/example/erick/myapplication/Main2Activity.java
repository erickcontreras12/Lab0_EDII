package com.example.erick.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static android.widget.Toast.makeText;
import static com.example.erick.myapplication.ClaseGeneral.canciones;
import static com.example.erick.myapplication.ClaseGeneral.playlist;

public class Main2Activity extends AppCompatActivity {
    ListView lista; Button volver; Switch orden;
    ArrayAdapter adapter; ArrayList mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        volver = (Button)findViewById(R.id.btnVolver);
        lista = (ListView)findViewById(R.id.listPlay);
        orden = (Switch)findViewById(R.id.sOrden);
        mostrar = new ArrayList(playlist.keySet());

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actividad = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(actividad);
            }
        });


        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,mostrar);
        lista.setAdapter(adapter);


        orden.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                   Collections.sort((List<Cancion>) playlist, new Comparator<Cancion>() {
                       @Override
                       public int compare(Cancion o1, Cancion o2) {
                           return new Integer(o1.getDuracion()).compareTo(new Integer(o2.getDuracion()));
                       }
                   });

                }else {
                    Collections.sort((List<Cancion>) playlist, new Comparator<Cancion>() {
                        @Override
                        public int compare(Cancion o1, Cancion o2) {
                            return o1.getNombre().compareTo(o2.getNombre());
                        }
                    });
                }

                mostrar = new ArrayList(playlist.keySet());
            }
        });


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                makeText(adapter.getContext(),"Listo", Toast.LENGTH_LONG);
                Cancion eliminar = canciones.get(parent.getItemAtPosition(position).toString());
                playlist.remove(eliminar.getNombre());

                Intent cargar = new Intent(Main2Activity.this, Main2Activity.class);
                startActivity(cargar);
            }
        });

    }}

