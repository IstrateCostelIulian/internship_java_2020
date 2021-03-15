package com.orange.students.munteanu.andrei.exercitii02;

/*
5)	Se da array-ul : 10,12,8,6,9,4,5,11
Afisati numelere pare.
idnciatii : folositi loops si operatorul %
 */

public class Ex5 {
    public static void main(String[] args){

        int[] a = {10,12,8,6,9,4,5,11};

        //for (int i = 0; i<a.length; i++){
        //if (a[i] %2 == 0)

        for (int i : a) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
