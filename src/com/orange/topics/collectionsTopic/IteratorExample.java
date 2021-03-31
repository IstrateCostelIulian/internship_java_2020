package com.orange.topics.collectionsTopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String [] args){
        List<String> luniVara = new ArrayList<>();
        luniVara.add("Iunie");
        luniVara.add("Iulie");
        luniVara.add("August");

        System.out.println(luniVara.get(2));


        luniVara.add(2, "Test");

        //DACA FACI MODIFICARE DE COMPONENTA LA NIVEL DE LISTA IN TIMPUL PARCURGERII ARUNCA :
        //Exception in thread "main" java.util.ConcurrentModificationException
        for (String lunaVara : luniVara) {
            System.out.println(lunaVara);
            //luniVara.add(2, "Test");
        }

        System.out.println("------------------------------------");

        Iterator<String> luniIterator = luniVara.iterator();
        while (luniIterator.hasNext()) {

            System.out.println(luniIterator.next());
            //luniVara.remove(0);

        }
    }
}
