package com.bridgelabz.exceptions;


public class InputMismatchException extends Exception {

    public ExceptionType exceptionType;
    public String message;

    public enum ExceptionType {
        NOT_NUMBER
    }

    public InputMismatchException(String message, ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
        this.message = message;
    }

    public InputMismatchException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return  message ;
    }
}