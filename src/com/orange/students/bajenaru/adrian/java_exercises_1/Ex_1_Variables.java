package com.orange.students.bajenaru.adrian.java_exercises_1;
/**
        creati 5 variabile primitive
        creati 5 variabile pe care sa faceti "boxing" folosind primele 5 varibile
        afisati valorile celor 10 varibile, iar pentru obiecte folositi metoda mostenita (toString())
 **/
public class Ex_1_Variables {
     public static void main(String[] args) {

        int varInt = 10;
        long varLong = 900000000L;
        float varFloat = 8.8F;
        double varDouble = 1.3333;
        boolean varBool = true;

        System.out.println(varInt);
        System.out.println(varLong);
        System.out.println(varFloat);
        System.out.println(varDouble);
        System.out.println(varBool);

        System.out.println("-------------------------");

        Integer boxInt = varInt;
        System.out.println(boxInt.toString());

        Long boxLong = varLong;
        System.out.println(boxLong.toString());

        Double boxDouble = varDouble;
        System.out.println(boxDouble.toString());

        Float boxVal = varFloat;
        System.out.println(boxVal.toString());

        Boolean boxBool = varBool;
        System.out.println(boxBool.toString());
    }

}