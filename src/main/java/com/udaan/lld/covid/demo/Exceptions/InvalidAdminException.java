package com.udaan.lld.covid.demo.Exceptions;

public class InvalidAdminException extends CovidTrackerException{
    public InvalidAdminException(String message) {
        super(message);
    }

    public InvalidAdminException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAdminException(Throwable cause) {
        super(cause);
    }
}
