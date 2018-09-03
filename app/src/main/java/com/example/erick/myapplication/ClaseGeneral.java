package com.example.erick.myapplication;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ClaseGeneral{
    public static HashMap<String, Cancion> canciones = new HashMap<>();
    //public static HashMap<String, Cancion> playlist = new HashMap<>();
    public static ArrayList<Cancion> playlist = new ArrayList<>();

    //Canciones
    Cancion cancion1 = new Cancion(122,"We Will Rock You");
    Cancion cancion2 = new Cancion(216,"Summer Of 69");
    Cancion cancion3 = new Cancion(166, "Paranoid");
    Cancion cancion4 = new Cancion(224,"Paint It Black");
    Cancion cancion5 = new Cancion(168, "The Middle");
    Cancion cancion6 = new Cancion(249,"Livin On A Prayer");
    Cancion cancion7 = new Cancion(243, "Let It Be");
    Cancion cancion8 = new Cancion(336,"Knockin On Heaven's Door");
    Cancion cancion9 = new Cancion(179,"I Wanna Rock");
    Cancion cancion10 = new Cancion(160,"Have You Ever Seen The Rain?");
    Cancion cancion11 = new Cancion(253,"Every Breath You Take");
    Cancion cancion12 = new Cancion(206,"Dust in the Wind");
    Cancion cancion13 = new Cancion(248,"Don't Stop Believin");
    Cancion cancion14 = new Cancion(177,"Cotton Fields");
    Cancion cancion15 = new Cancion(218,"Come As You Are");
    Cancion cancion16 = new Cancion(323,"Carry on Wayward Son");
    Cancion cancion17 = new Cancion(201,"Any Way You Want It");
    Cancion cancion18 = new Cancion(354,"Bohemian Rhapsody");
    Cancion cancion19 = new Cancion(174,"ABC");
    Cancion cancion20 = new Cancion(315,"Born On The Bayou");

    public ClaseGeneral(){
        canciones.put(cancion1.getNombre(),cancion1);
        canciones.put(cancion2.getNombre(),cancion2);
        canciones.put(cancion3.getNombre(),cancion3);
        canciones.put(cancion4.getNombre(),cancion4);
        canciones.put(cancion5.getNombre(),cancion5);
        canciones.put(cancion6.getNombre(),cancion6);
        canciones.put(cancion7.getNombre(),cancion7);
        canciones.put(cancion8.getNombre(),cancion8);
        canciones.put(cancion9.getNombre(),cancion9);
        canciones.put(cancion10.getNombre(),cancion10);
        canciones.put(cancion11.getNombre(),cancion11);
        canciones.put(cancion12.getNombre(),cancion12);
        canciones.put(cancion13.getNombre(),cancion13);
        canciones.put(cancion14.getNombre(),cancion14);
        canciones.put(cancion15.getNombre(),cancion15);
        canciones.put(cancion16.getNombre(),cancion16);
        canciones.put(cancion17.getNombre(),cancion17);
        canciones.put(cancion18.getNombre(),cancion18);
        canciones.put(cancion19.getNombre(),cancion19);
        canciones.put(cancion20.getNombre(),cancion20);
    }

}
