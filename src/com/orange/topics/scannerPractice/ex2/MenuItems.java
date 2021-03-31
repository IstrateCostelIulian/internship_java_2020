package com.orange.topics.scannerPractice.ex2;

import java.util.HashMap;
import java.util.Map;

public class MenuItems {

    public static Map<Integer , Mancare> meniuObiectFelulI (){
        Map<Integer, Mancare > menu = new HashMap<>();

        menu.put(1, new Mancare("Supa pui", 10.9));
        menu.put(2, new Mancare("Supa radauteana", 11.2));
        menu.put(3, new Mancare("Ciorba fasole", 10.7));

        return menu;
    }

    public static Map<Integer , Mancare> meniuObiectFelulII (){
        Map<Integer, Mancare > menu = new HashMap<>();

        menu.put(1, new Mancare("Ceafa de porc", 11.7));
        menu.put(2, new Mancare("Costita de porc", 15.2));
        menu.put(3, new Mancare("Carnaciori", 10.2));

        return menu;
    }

    public static Map<Integer , Mancare> meniuObiectDesert (){
        Map<Integer, Mancare > menu = new HashMap<>();

        menu.put(1, new Mancare("Papanasi", 9.4));
        menu.put(2, new Mancare("Clatite", 7.6));
        menu.put(3, new Mancare("Inghetata", 5.6));

        return menu;
    }



}
