package com.dxctraining.fms.dto;

import java.math.BigInteger;

public class FlightScheduleDto {

    private String sourceAirport;
    private String destinationAirport;
    private String carrierName;
    private Integer seatsCapacity;
    private long arrivalTime;
    private long departureTime;
    private BigInteger flightNum;
    private Integer scheduleId;
    private Integer seatsAvailable;
    private BigInteger scheduleFlightId;
    private String flightModel;

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

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public Integer getSeatsCapacity() {
        return seatsCapacity;
    }

    public void setSeatsCapacity(Integer seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
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

    public BigInteger getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(BigInteger flightNum) {
        this.flightNum = flightNum;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(Integer seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public BigInteger getScheduleFlightId() {
        return scheduleFlightId;
    }

    public void setScheduleFlightId(BigInteger scheduleFlightId) {
        this.scheduleFlightId = scheduleFlightId;
    }

    public String getFlightModel() {
        return flightModel;
    }

    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }
}
