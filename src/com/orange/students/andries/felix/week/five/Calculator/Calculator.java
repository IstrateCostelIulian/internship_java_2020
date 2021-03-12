package com.orange.students.andries.felix.week.five.Calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {
 //calculeze perimetrul unui patrat
    public String perimetruPatrat(int latura){
        int perimetruPatrat = latura * 4;
        return " Perimetrul patratului cu latura de " + latura + " este de " + perimetruPatrat;
    }

//calculeze perimetrul unui cerc

    public String perimetruCerc(double diametru){
        double circumferintaCerc = diametru * 3.14;
        return  "Circumferinta cercului cu diametru de  " + diametru + " este de " + circumferintaCerc;

    }
//sa verifice intre 3 numere care este cel mai mare si sa-l returneze

    public String celMaiMareNr(int num1, int num2, int num3) {

        if(num1 >= num2 && num1 >= num3){
            return "Numarul cel mai mare este " + num1;
        }else if (num2 >= num1 && num2 >= num3){
            return "Numarul cel mai mare este " + num2;
        } else {
           return  "Numarul cel mai mare este " + num3;
        }

    }
 // sa verifice daca un array are elemente si sa intoarca adevarat sau fals.

    public String arrayElement(int searchedNumber) {
        int[] intArray = new int[] {15, 30, 45, 4, 10};
        boolean found = false;

        for(int x : intArray){
            if(x == searchedNumber){
                found = true;
                break;
            }
        }

        return "" + found;

    }


    //sa verifice daca un array are numar par de elemente
    public String evenNumbers() {

        int[] myArray = {50, 60, 25, 32, 15, 35};
        int numerePare;

        for (int j : myArray) {

            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

     return " ";

    }


    // * sa verifice daca un array are numar impar de elemente
    public String oddNumbers() {
        int[] myArray = { 50, 60, 25, 32, 15, 35};

        for (int j : myArray){

            if (j % 2 != 0){
                System.out.println(j);
            }
        }
        return " ";

    }




}
