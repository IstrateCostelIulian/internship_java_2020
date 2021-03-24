package com.orange.students.bajenaru.adrian.java_exercises_2;

import java.util.Arrays;

/*
     * Se da array-ul String-uri : "F", "W", "A", "C", "B"
     * Creati un nou array in care sa ordonati minusculele literelor din array.
     * indicatii : folositi loops si metoda din obiectul String.
 */


public class Ex_3 {




    public static void main(String[] args) {


        String[] litere = {"F", "W", "A", "C", "B"};
        System.out.println("Litere care trebuie scrise cu minuscule:");
        System.out.println("");
        System.out.println(Arrays.toString(litere));
        System.out.println("");

        String[] litereMinuscule = new String[litere.length];
        for (int i = 0; i < litere.length; i++) {
            litereMinuscule[i] = litere[i].toLowerCase();
        }

        System.out.println("Litere scrise cu minuscule si ordonate alfabetic:");
        System.out.println("");

        Arrays.sort(litereMinuscule);

        for (String litera : litereMinuscule) {

            System.out.print(litera + " ");
        }


    }

}


