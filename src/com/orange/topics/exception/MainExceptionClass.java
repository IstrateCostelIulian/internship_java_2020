package com.orange.topics.exception;

import java.io.IOException;

public class MainExceptionClass {

    public static void main(String[] args) {
        SimpleExceptionMethod sem = new SimpleExceptionMethod();
        SecondExceptionMethod secM = new SecondExceptionMethod();

        try {
            sem.m1();
            secM.m2();
        } catch (Exception ex) {

            System.out.println("Exceptie prinsa");
            System.out.println(ex.getMessage());

        }

        finally {
            System.out.println("in finally");
        }


    }
}
