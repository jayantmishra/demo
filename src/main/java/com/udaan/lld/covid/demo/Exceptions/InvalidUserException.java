package com.udaan.lld.covid.demo.Exceptions;

public class InvalidUserException extends CovidTrackerException{
    public InvalidUserException(String message) {
        super(message);
    }

    public InvalidUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUserException(Throwable cause) {
        super(cause);
    }
}
