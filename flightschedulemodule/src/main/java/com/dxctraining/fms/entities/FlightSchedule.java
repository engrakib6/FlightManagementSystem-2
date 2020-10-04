package com.dxctraining.fms.entities;

import javax.persistence.*;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Objects;

@Entity
public class FlightSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger scheduleFlightId;
    private Integer availableSeats;
    private Integer scheduleId;
    private BigInteger flightNum;

    public FlightSchedule(Integer availableSeats, Integer scheduleId, BigInteger flightNum) {
        this.availableSeats = availableSeats;
        this.scheduleId = scheduleId;
        this.flightNum = flightNum;
    }
    public FlightSchedule()
    {

    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public BigInteger getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(BigInteger flightNum) {
        this.flightNum = flightNum;
    }

    public BigInteger getScheduleFlightId() {
        return scheduleFlightId;
    }

    public void setScheduleFlightId(BigInteger scheduleFlightId) {
        this.scheduleFlightId = scheduleFlightId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightSchedule that = (FlightSchedule) o;
        return scheduleFlightId.equals(that.scheduleFlightId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleFlightId);
    }
}
