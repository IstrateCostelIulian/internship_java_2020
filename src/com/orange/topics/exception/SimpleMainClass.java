package com.orange.topics.exception;

public class SimpleMainClass {

    public static void main(String[] args) {

        try {
            //dechizi conexiune DB
            //efectuezi query
            //inchizi conexiune
        } finally {
            //verifici conexiunea daca e deschisa
            //inchizi conexiune
        }

        try{

        } catch (Exception ex ){

        }



        try {
            SecondaryClass.createFile("test");
        } catch (Exception e) {

        } finally {

        }


        try {
            int result = SecondaryClass.divideAandB(8, 2);
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Finally 1");
        }

        try {
            int result2 = SecondaryClass.divideAandB(7, 0);
            System.out.println(result2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Finally 2");
        }

        System.out.println("------------");

        try {
            System.out.println(SecondaryClass.getFirstLetter(null));
            int result2 = SecondaryClass.divideAandB(7, 0);
            System.out.println(result2);
        } catch (CheckedCustomException cce) {
            System.out.println(cce.getMessage());
            cce.printStackTrace();
        } finally {
            System.out.println("Finally 3 ");
        }
/*
        try{
            SecondaryClass.divideABException(1,0);
        }finally {
            System.out.println("Finally 4 ");
        }


        SecondaryClass.divideABException(1,0);
*/
    }
}
