package com.trainee.schedulemodule.exceptions;

public class InvalidAirportCodeException extends RuntimeException{
    public InvalidAirportCodeException(String msg)
    {
        super(msg);
    }
}
