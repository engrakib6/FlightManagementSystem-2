package com.dxctraining.sm.dto;

import javax.validation.constraints.NotBlank;

public class CreateSchedule {
    private long arrivalTime;

    private long departureTime;
    @NotBlank
    private String sourceAirport;
    @NotBlank
    private String destinationAirport;
    @NotBlank
    private String airportCode;

    public long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(long departureTime) {
        this.departureTime = departureTime;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportId(String airportCode) {
        this.airportCode = airportCode;
    }
}
