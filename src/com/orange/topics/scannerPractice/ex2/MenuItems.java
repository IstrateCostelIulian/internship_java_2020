package com.orange.topics.scannerPractice.ex2;

import java.util.HashMap;
import java.util.Map;

public class MenuItems {

    public static Map<String, Double>  meniuFelulI() {
        Map<String, Double> menu = new HashMap<>();
        menu.put("Supa pui", 10.9);
        menu.put("Supa radauteana", 11.2);
        menu.put("Ciorba fasole", 10.7);
        return menu;
    }

    public static Map<String, Double> meniuFelulII() {
        Map<String, Double> menu = new HashMap<>();
        menu.put("Ceafa de porc", 11.7);
        menu.put("Costita de porc", 15.2);
        menu.put("Carnaciori", 10.2);
        return menu;
    }

    public static  Map<String, Double>  meniuDesert() {
        Map<String, Double> menu = new HashMap<>();
        menu.put("Papanasi", 9.4);
        menu.put("Clatite", 7.6);
        menu.put("Inghetata", 5.6);
        return menu;
    }

    public static Map<Integer , Mancare> meniuObiectFelulI (){
        Map<Integer, Mancare > menu = new HashMap<>();
        menu.put(1, new Mancare("Supa pui", 10.9));

        return menu;

    }
}
