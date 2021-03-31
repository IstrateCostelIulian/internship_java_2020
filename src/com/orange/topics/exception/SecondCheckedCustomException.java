package com.orange.topics.exception;

public class SecondCheckedCustomException extends  CheckedCustomException{
    public SecondCheckedCustomException() {
    }

    public SecondCheckedCustomException(String message) {
        super(message);
    }

    public SecondCheckedCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecondCheckedCustomException(Throwable cause) {
        super(cause);
    }

    public SecondCheckedCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
