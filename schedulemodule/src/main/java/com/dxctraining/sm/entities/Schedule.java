package com.dxctraining.sm.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

@Entity
public class Schedule {

    @Id
    @GeneratedValue
    private Integer scheduleId;
    private String fromAirport;
    private String toAirport;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone =JsonFormat.DEFAULT_TIMEZONE, locale =JsonFormat.DEFAULT_LOCALE)
    private LocalDateTime arrivalTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone =JsonFormat.DEFAULT_TIMEZONE, locale =JsonFormat.DEFAULT_LOCALE)
    private LocalDateTime departureTime;
    private String airportCode;

    public Schedule(String fromAirport, String toAirport, LocalDateTime arrivalTime, LocalDateTime departureTime, String airportCode) {
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.airportCode = airportCode;
    }

    public Schedule() {
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

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return scheduleId.equals(schedule.scheduleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleId);
    }
}
