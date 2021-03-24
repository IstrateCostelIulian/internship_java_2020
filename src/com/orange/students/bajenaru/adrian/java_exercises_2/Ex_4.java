package com.orange.students.bajenaru.adrian.java_exercises_2;


import java.util.Arrays;

/* Se da array-ul : 1,8,5,3,4,9,5,3
 * Afisati pe rand fiecare numar, mai putin primul si al 3lea numar impar din array
 * indicatii : folositi loops si operatorul %
 */

public class Ex_4 {


    public static void main(String[] args) {
        int numarator = 0;
        int[] matriceNumere = {1, 8, 5, 3, 4, 9, 5, 3};

            for (int i = 0; i < matriceNumere.length; i++) {

                numarator++;
                    if (numarator == matriceNumere[0] || numarator == matriceNumere[2])
                        continue;

                System.out.println(matriceNumere[i]);
            }
        }
    }

