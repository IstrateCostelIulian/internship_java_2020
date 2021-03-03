package com.orange.topics.scannerPractice.ex2;

import com.orange.topics.scannerPractice.ex1.ShowMessagesUtils;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RestaurantExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShowMessagesUtils.showMessage("Alegeti meniul: ");

        ShowMessagesUtils.showMessage("Felul I");
        int indexMenu1 = alegeElementDinMeniu(scanner, MenuItems.meniuFelulI());
        System.out.println("indexMenu1 : " + indexMenu1);

        ShowMessagesUtils.showMessage("Felul II");
        int indexMenu2 = alegeElementDinMeniu(scanner, MenuItems.meniuFelulII());
        System.out.println("indexMenu2 : " + indexMenu2);

        ShowMessagesUtils.showMessage("Desert");
        int indexDesert = alegeElementDinMeniu(scanner, MenuItems.meniuDesert());
        System.out.println("indexDesert : " + indexDesert);

        /*
        for(Integer key: MenuItems.meniuObiectFelulI().keySet()){
            System.out.println(key + " . " + MenuItems.meniuObiectFelulI().get(key).getNume());
        }
        */

    }

    private static int alegeElementDinMeniu(Scanner scanner, Map<String, Double> meniu) {
        Set<String> keysMenu = meniu.keySet();
        int indexMenu;
        do {
            int i = 1;
            for (String key : keysMenu) {
                System.out.println(i + "." + key + ": " + meniu.get(key) + " RON");
                i++;
            }
            indexMenu = scanner.nextInt();
        } while (indexMenu > keysMenu.size());

        return indexMenu;
    }





}
