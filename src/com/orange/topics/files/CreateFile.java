package com.orange.topics.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
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
        }
    }
}
