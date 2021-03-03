package com.orange.students.calarasu.marius.restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Menu {

    protected static void displayMenuOptions() {
        System.out.println("For Starter menu press      1");
        System.out.println("For Main course menu press  2");
        System.out.println("For Desert menu press       3");
    }

    protected static void displayStarterMenu() {
        System.out.println("1.Supa pui          10.90 ron");
        System.out.println("2.Supa radaureana   11.20 ron ");
        System.out.println("3.Ciorba de fasole  10.70 ron");
    }

    protected static void displayMainCourseMenu() {
        System.out.println("1.Ceafa de porc    11.70 ron");
        System.out.println("2.Costita de porc  15.00 ron");
        System.out.println("3.Carnaciori       10.20 ron");
    }

    protected static void displayDesertMenu() {
        System.out.println("Papanasi   9.40 ron");
        System.out.println("Clatite    7.60 ron");
        System.out.println("Inghetata  5.60 ron");
    }

    protected static Map<Integer, Food> starterMenuItems() {
        Map<Integer, Food> menu = new HashMap<>();
        menu.put(1, new Food("Supa pui", 10.90));
        menu.put(2, new Food("Supa radaureana", 11.20));
        menu.put(3, new Food("Ciorba de fasole", 10.70));
        return menu;
    }

    protected static Map<Integer, Food> mainCourseMenuItems() {
        Map<Integer, Food> menu = new HashMap<>();
        menu.put(1, new Food("Ceafa de porc", 11.70));
        menu.put(2, new Food("Costita de porc ", 15.22));
        menu.put(3, new Food("Carnaciori", 10.20));
        return menu;
    }

    protected static Map<Integer, Food> desertMenuItems() {
        Map<Integer, Food> menu = new HashMap<>();
        menu.put(1, new Food("Papanasi", 9.40));
        menu.put(2, new Food("Clatite", 8.20));
        menu.put(3, new Food("Inghetata", 5.30));
        return menu;
    }

    protected static void bill(Set<Food> foodOrder) {
        double total = 0;
        for (Food food : foodOrder) {
            System.out.println(food);
            total += food.getPrice();
        }
        System.out.println("Total de plata : " + total);
    }
}
  