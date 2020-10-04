/*
@author RV
 */
package com.dxctraining.fms.dto;
import java.math.BigInteger;

public class CreateFlightSchedule {
    private Integer availableSeats;
    private BigInteger flightNum;
    private Integer scheduleId;

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
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
}
