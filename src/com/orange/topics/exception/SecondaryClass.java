package com.orange.topics.exception;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SecondaryClass {

    static int divideAandB(int a, int b) throws SecondCheckedCustomException {
        int result = 0;
        //try {
        result = a / b;
        //} catch (ArithmeticException ae) {
        //  System.out.println("ArithmeticException in divideAandB");
        //}
        return result;
    }

    static String getFirstLetter(String str) throws CheckedCustomException {
        if (str == null) {
            throw new CheckedCustomException("Parametrul de tipul String este NULL");
        }
        ///
        ///
        ///
        return str.substring(0, 1);
    }

    static int divideABException(int a, int b) throws ArithmeticException {
        return a / b;
    }

    static boolean createFile(String filename) throws IOException {
        File myObj = new File("c://test//" + filename);
        return myObj.createNewFile();
    }
}
