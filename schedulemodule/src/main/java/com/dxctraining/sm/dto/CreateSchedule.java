package com.dxctraining.sm.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CreateSchedule {

    private String airportCode;
    private String toAirport;
    private String fromAirport;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone =JsonFormat.DEFAULT_TIMEZONE, locale =JsonFormat.DEFAULT_LOCALE)
    private long arrivalTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone =JsonFormat.DEFAULT_TIMEZONE, locale =JsonFormat.DEFAULT_LOCALE)
    private long departureTime;

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

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
}
