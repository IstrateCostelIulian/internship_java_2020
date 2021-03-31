package com.orange.topics.collectionsTopic;



import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> al = new TreeSet<String>();
        System.out.println(al.add("Ravi"));
        System.out.println(al.add("Vijay"));
        System.out.println(al.add("Ravi"));
        System.out.println(al.add("Ajay"));

        System.out.println(al.size());

        CustomGiraffe customGiraffe1 = new CustomGiraffe(10, 2.7f, "galbena");
        CustomGiraffe customGiraffe2 = new CustomGiraffe(11, 2.9f, "galbena");
        CustomGiraffe customGiraffe3 = new CustomGiraffe(9, 2.6f, "maro");

        Set<CustomGiraffe> setOfGiraffes = new TreeSet<>();
        setOfGiraffes.add(customGiraffe3);
        setOfGiraffes.add(customGiraffe2);
        setOfGiraffes.add(customGiraffe1);


        for(CustomGiraffe giraffe : setOfGiraffes){
            System.out.println(giraffe.toString());
        }

    }
}
