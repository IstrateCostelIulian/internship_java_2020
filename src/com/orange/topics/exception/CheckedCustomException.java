package com.orange.topics.exception;

public class CheckedCustomException extends Exception{

    public CheckedCustomException() {
        super();
    }

    public CheckedCustomException(String message) {
        super(message);
    }

    public CheckedCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckedCustomException(Throwable cause) {
        super(cause);
    }

    protected CheckedCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
