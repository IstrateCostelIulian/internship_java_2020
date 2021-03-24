package com.orange.students.bajenaru.adrian.java_exercises_2;

/* 7)	Se da array-ul de String-uri : "ab", "cc", "gg", "a" , "kg", "ert"
        Afisati doar elementele cu 2 caractere.
        indicatii : folositi loop si metoda din obiectul String
*/


public class Ex_7 {

    public static void main(String[] args) {

        String[] matrice = {"ab", "cc", "gg", "a", "kg", "ert"};
        for (String string : matrice)
        {
            if (string.length() <=1 && >=3 ) {
                System.out.println(string);
            }
        }
    }
}


