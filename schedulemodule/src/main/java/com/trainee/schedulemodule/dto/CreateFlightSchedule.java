package com.trainee.schedulemodule.dto;

import com.trainee.schedulemodule.entities.Flight;
import com.trainee.schedulemodule.entities.Schedule;

public class CreateFlightSchedule {
    private Flight flight;
    private Integer availableSeats;
    private Schedule schedule;
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

}
