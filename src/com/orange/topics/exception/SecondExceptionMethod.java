package com.orange.topics.exception;

import java.io.File;
import java.io.IOException;

public class SecondExceptionMethod {

    void m2() {
        SimpleExceptionMethod simpleExceptionMethod = new SimpleExceptionMethod();
        System.out.println("in m2");

        try {
            simpleExceptionMethod.m1();

            File myObj = new File("C:\\Program Files\\filename2.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException exception) {
            System.out.println("An error occurred.");
            System.out.println(exception.getMessage());

            exception.printStackTrace();
        } catch (CheckedCustomException e) {

        }
    }
}

