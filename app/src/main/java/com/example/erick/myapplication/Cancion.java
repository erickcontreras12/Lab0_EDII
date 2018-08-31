package com.example.erick.myapplication;


public class Cancion {
    public String title;
    public int duration; //seconds

    public Cancion(int n, String t){
        duration = n;
        title = t;
    }

    public String getNombre(){
        return title;
    }
}
