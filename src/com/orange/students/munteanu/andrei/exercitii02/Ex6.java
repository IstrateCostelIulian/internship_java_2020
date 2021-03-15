package com.orange.students.munteanu.andrei.exercitii02;
/*
6)	Scrieti un program in care sa faceti conversia de la mile la kilometri,
si apoi afisati ca mai jos.
 mile 	kilometri
 */
public class Ex6 {
    public static void main(String[] args) {

        Double[] mile = {10.00, 20.00, 30.00, 40.00, 50.00, 60.00, 70.00};
        System.out.println("mile  kilometers");

        for (Double miles : mile) {

            double km = miles * 1.609;
            double km2 = Math.round(km * 100.0) / 100.0;

            System.out.println(miles + "  " + km2);

        }
    }
}
