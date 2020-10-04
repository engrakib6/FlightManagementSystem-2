package com.dxctraining.fms.exceptions;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class CentralizedException {

    @ExceptionHandler(InvalidArgumentException.class)
    public String handleInvalidArgumentException(InvalidArgumentException exception)
  {
    return exception.getMessage();
    }
    @ExceptionHandler(FlightScheduleNotFound.class)
    public String handleFlightNotFound(FlightScheduleNotFound flightScheduleNotFound)
    {
        return flightScheduleNotFound.getMessage();
    }
}
