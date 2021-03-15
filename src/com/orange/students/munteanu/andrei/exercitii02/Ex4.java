package com.orange.students.munteanu.andrei.exercitii02;
/*
Se da array-ul : 1,8,5,3,4,9,5,3
Afisati pe rand fiecare numar, mai putin primul si al 3lea numar impar din array
indicatii : folositi loops si operatorul %
 */
public class Ex4 {
    public static void main(String[] args){
        int[] a = {1,8,5,3,4,9,5,3};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0){
                i++;
            }
            System.out.println(a[i]);
        }

    }
}
