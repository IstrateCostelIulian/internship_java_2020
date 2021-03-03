package com.orange.students.andries.felix.Tema2;

public class Exercitiu_4 {

    /* Se da array-ul : 1,8,5,3,4,9,5,3
Afisati pe rand fiecare numar, mai putin primul si al 3lea numar impar din array
indicatii : folositi loops si operatorul % */

    public static void main(String[] args) {


        int[] myNumbers =  { 1,8,5,3,4,9,5,3 };

        int numbersOdd = 0;


        for (int myNumber : myNumbers) {
            if (myNumber % 2 != 0) {
                numbersOdd++;

                if (numbersOdd == 1 || numbersOdd == 3) continue;
            }
            System.out.println(myNumber);

        }

    }
}


