package com.orange.students.bajenaru.adrian.java_exercises_1;

/**
     VariabileCasting
     * creati 5 variabile si sa le valorizati
     * creati cateva variabile noi si sa faceti Widening Casting si Narrowing Casting pe cele 5 variabile
     apoi sa afisati rezultatele
 **/

    public class Ex_2_VariabileCasting {

        public static void main(String[] args) {

            int intVar = 1;
            double doubleVar = intVar;
            double doubleVarCast = 3.33;
            short shortVar = (short) intVar;
            int intValue = (int) doubleVarCast;
            float floatVar = (float) doubleVarCast;
            double doubleVarCastToFloat = (float) doubleVarCast;

            System.out.println(doubleVar);
            System.out.println(shortVar);
            System.out.println(intValue);
            System.out.println(floatVar);
            System.out.println(doubleVarCastToFloat);

        }
    }


