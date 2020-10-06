package com.dxctraining.sm.dto;

public class ScheduleDto {
    private Integer scheduleId;

    private long arrivalTime;

    private long departureTime;

    private String sourceAirport;

    private String destinationAirport;

    private String airportCode;

    private String airportName;

    private String airportLocation;

    public ScheduleDto() {

    }

    public ScheduleDto(Integer scheduleId, long arrivalTime, long departureTime, String sourceAirport, String destinationAirport) {
        this.scheduleId = scheduleId;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.sourceAirport = sourceAirport;
        this.destinationAirport = destinationAirport;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
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

    public String getSourceAirport(String toAirport) {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public String getDestinationAirport(String toAirport) {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportLocation() {
        return airportLocation;
    }

    public void setAirportLocation(String airportLocation) {
        this.airportLocation = airportLocation;
    }
}
