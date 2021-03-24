package com.orange.students.bajenaru.adrian.java_exercises_2;

import java.util.Arrays;

/*Se da array-ul String-uri : "a", "b", "c", "d" , "f"
        Creati un nou array in care sa adaugati majusculele literelor din array.
        indicatii : folositi for loop si metoda din obiectul String
        */

public class Ex_2 {

    public static void main(String[] args) {


        String[] litere = {"a", "b", "c", "d", "f"};
        System.out.println("Litere care trebuie scrise de tipar:");
        System.out.println("");
        System.out.println(Arrays.toString(litere));
        System.out.println("");

        String[] litereDeTipar = new String[litere.length];
        for (int i = 0; i < litere.length; i++) {
            litereDeTipar[i] = litere[i].toUpperCase();
        }

        System.out.println("Litere de tipar:");
        System.out.println("");

        for (String litera : litereDeTipar) {

            System.out.print(litera + " ");
        }
    }

}

