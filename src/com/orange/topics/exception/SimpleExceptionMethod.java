package com.orange.topics.exception;

public class SimpleExceptionMethod {

    void m1() throws CheckedCustomException {
        System.out.println("in m1");
        throw new CheckedCustomException("Exceptie aruncata in m1");

    }
}
