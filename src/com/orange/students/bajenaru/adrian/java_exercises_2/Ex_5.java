package com.orange.students.bajenaru.adrian.java_exercises_2;


/* Se da array-ul : 10,12,8,6,9,4,5,11
        Afisati numelere pare.
        idnciatii : folositi loops si operatorul %
*/

public class Ex_5 {

    public static void main(String[] args) {


        int[] matriceNumere = {10,12,8,6,9,4,5,11};

        for (int i = 0; i < matriceNumere.length; i++) {

            if (matriceNumere[i] % 2 != 0)
                continue;

            System.out.println(matriceNumere[i]);
        }
    }
}
