package com.orange.topics.scannerPractice.ex2;

import com.orange.topics.scannerPractice.ex1.ShowMessagesUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RestaurantExample {

    private static List<Mancare> mancareaAleasa = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ShowMessagesUtils.showMessage("Alegeti meniul: ");

        ShowMessagesUtils.showMessage("Felul I");
        alegeElementDinMeniu(scanner, MenuItems.meniuObiectFelulI());

        ShowMessagesUtils.showMessage("Felul II");
        alegeElementDinMeniu(scanner, MenuItems.meniuObiectFelulII());

        ShowMessagesUtils.showMessage("Desert");
        alegeElementDinMeniu(scanner, MenuItems.meniuObiectDesert());

        showChoises();
    }

    private static void alegeElementDinMeniu(Scanner scanner, Map<Integer, Mancare> meniu) {
        int indexMenu;
        do {
            for (Map.Entry<Integer, Mancare> entry : meniu.entrySet()) {
                System.out.println(
                        entry.getKey() + ". " + entry.getValue().getNume() + ", " + entry.getValue().getPret() + " RON");
            }

            indexMenu = scanner.nextInt();
        } while (indexMenu > meniu.size());
        mancareaAleasa.add(meniu.get(indexMenu));
    }

    private static void showChoises() {
        double total = 0.0;
        for (Mancare mancare : mancareaAleasa) {
            ShowMessagesUtils.showMessage(mancare.getNume() + " , " + mancare.getPret() + " RON");
            total += mancare.getPret();
        }
        ShowMessagesUtils.showMessage("Total : " + total);

    }


}
