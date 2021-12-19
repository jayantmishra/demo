package com.udaan.lld.covid.demo.Exceptions;

public class CovidTrackerException extends RuntimeException{

    public CovidTrackerException(String message) {
        super(message);
    }

    public CovidTrackerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CovidTrackerException(Throwable cause) {
        super(cause);
    }
}
