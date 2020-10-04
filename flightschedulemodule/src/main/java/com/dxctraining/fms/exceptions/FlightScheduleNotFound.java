package com.dxctraining.fms.exceptions;

public class FlightScheduleNotFound extends RuntimeException{
    public  FlightScheduleNotFound(String msg)
    {
        super(msg);
    }
}
