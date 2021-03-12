package com.orange.students.andries.felix.week.five.Student;

public class Main {
    public static void main(String[] args) {

        Elev elev1 = new Elev();
        elev1.seteazaNumele("Daniel");
        System.out.println("Numele elevului este " + elev1.nume);


        elev1.seteazaVarsta(22);
        System.out.println("Varsta elevului este de " + elev1.varsta + " ani");


        elev1.arePrezenta(true);
        System.out.println("Prezenta: " + elev1.prezenta);


        elev1.medie(9.50);
        System.out.println("Media finala este: " + elev1.mediaFinala);

    }



}
