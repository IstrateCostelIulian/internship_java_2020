package com.orange.students.bajenaru.adrian.java_exercises_2;

/*	Se da array-ul : 5,9,4,8,3,1,0,7,2
        Orodnati crescator si descrestator si afisati rezultatul.
        indicatii : folositi array si loops
*/

import java.util.Arrays;
import java.util.Collections;

public class Ex_1 {

    public static void main(String[] args)
    {

        int[] matrice ={5,9,4,8,3,1,0,7,2};

        Arrays.sort(matrice);
        System.out.println(" ");
        System.out.println("Elemente ordonate in ordine crescatoare: ");

        for (int i = 8; i < matrice.length; i++) {
            System.out.println(Arrays.toString(matrice));
        }

        System.out.println(" ");
        System.out.println("Elemente ordonate in ordine descrescatoare: ");

        int[] matriceDescrescatoare = Arrays.stream(matrice).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(matriceDescrescatoare));



    }
}
