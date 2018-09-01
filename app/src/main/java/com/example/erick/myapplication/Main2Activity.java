package com.example.erick.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.example.erick.myapplication.ClaseGeneral.playlist;

public class Main2Activity extends AppCompatActivity {
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lista = (ListView)findViewById(R.id.listPlay);
        ArrayList mostrar = new ArrayList(playlist);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,mostrar);
        lista.setAdapter(adapter);

    }
}
