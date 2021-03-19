package com.orange.students.bajenaru.adrian.java_exercises_1;

/**
 * LoopsAndIfElseExercices
 * Creati un array de String-uri, care sa aibe 5 elemente.
 * Creati un "while" loop si for loop care sa parcurga elementele din array.
 * Folositi un for-each loop pentru a parcurge elementele din array.
 * Creati un nou "while" loop, folosind conditia "if" utilizati cuvintele cheie "continue" si "break" in interiorul while-ului
 * <p>
 * Afisati folosind un loop toate elementele din array, mai putin elementul de la mijloc
 * fara sa specificati in clar in verificare care este pozitia elementului, trebuie gasita dinamic.
 * <p>
 * Creati un exemplu de if else in care sa verificati o conditie.
 * Transformati exemplu "if else" de mai sus intr-un operator ternar (Ternary Operator).
 */


import java.util.Arrays;

public class Ex_4_LoopsAndIfElseExercices {

    public static void main(String[] args) {
        String[] phone = {"Samsung", "LG", "iPhone", "Huawei", "Oppo"};
        while (phone.length <= 5) {
            System.out.println(Arrays.toString(phone));
            break;
        }
    }

}