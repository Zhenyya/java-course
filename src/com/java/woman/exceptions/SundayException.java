package com.java.woman.exceptions;

public class SundayException extends RuntimeException {

    public SundayException(String message) {
        super(message);
    }

    public SundayException(Exception e) {
        super(e);
    }
}
