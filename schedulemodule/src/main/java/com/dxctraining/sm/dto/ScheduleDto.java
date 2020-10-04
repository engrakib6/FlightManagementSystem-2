package com.dxctraining.sm.dto;

public class ScheduleDto {
    private Integer scheduleId;
    private String fromAirport;
    private String toAirport;
    private Long arrivalTime;
    private Long departureTime;
    private String airportCode;
    private String airportLocation;
    private String airportName;

    public ScheduleDto(Integer scheduleId, String fromAirport, String toAirport, Long arrivalTime, Long departureTime, String airportCode, String airportLocation, String airportName) {
        this.scheduleId = scheduleId;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.airportCode = airportCode;
        this.airportLocation = airportLocation;
        this.airportName = airportName;
    }

    public ScheduleDto()
    {

    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public Long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Long departureTime) {
        this.departureTime = departureTime;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportLocation() {
        return airportLocation;
    }

    public void setAirportLocation(String airportLocation) {
        this.airportLocation = airportLocation;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
