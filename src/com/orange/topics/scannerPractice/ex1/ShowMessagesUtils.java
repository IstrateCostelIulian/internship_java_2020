package com.orange.topics.scannerPractice.ex1;

import java.util.ArrayList;
import java.util.List;

public class ShowMessagesUtils {

    public static List<String> myMenu() {
        List<String> menu = new ArrayList<>();
        menu.add("1. Adunare");
        menu.add("2. Scadere");
        menu.add("3. Inmultire");
        menu.add("4. Impartire");
        return menu;
    }

    public static void showMenu() {
        for (String menuElement : myMenu()) {
            System.out.println(menuElement);
        }
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }

    public static void showMessageForOperation(String tipulOperatiei, double rezultatulOperatiei) {
        showMessage("Rezultatul operatie de " + tipulOperatiei + " este :  " + rezultatulOperatiei);
    }
}
