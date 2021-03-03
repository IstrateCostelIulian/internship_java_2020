package com.orange.students.calarasu.marius.restaurant;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Food> foodSelections = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        do {
            Menu.displayMenuOptions();
            int choice = scanner.nextInt();
            if (choice == 1) {
                Menu.displayStarterMenu();
                int in = scanner.nextInt();
                foodSelections.add(Menu.starterMenuItems().get(in));
            } else if (choice == 2) {
                Menu.displayMainCourseMenu();
                int in = scanner.nextInt();
                foodSelections.add(Menu.mainCourseMenuItems().get(in));
            } else if (choice == 3) {
                Menu.displayDesertMenu();
                int in = scanner.nextInt();
                foodSelections.add(Menu.desertMenuItems().get(in));
            } else {
                System.out.println("Ai ales o optiune gresita");
            }
            System.out.println("Apasati Y pentru a continua sau sau orice tasta pentru a calcula nota");
        }
        while (scanner.next().equalsIgnoreCase("Y"));
        Menu.bill(foodSelections);
    }
}
