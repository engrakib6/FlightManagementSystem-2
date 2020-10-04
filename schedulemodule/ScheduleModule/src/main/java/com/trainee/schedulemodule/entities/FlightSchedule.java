package com.trainee.schedulemodule.entities;

import javax.persistence.*;

@Entity
public class FlightSchedule {

    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    private Flight flight;
    private Integer availableSeats;
    @OneToOne(cascade = CascadeType.ALL)
    private Schedule schedule;

    public FlightSchedule(Flight flight, Integer availableSeats, Schedule schedule) {
        this.flight = flight;
        this.availableSeats = availableSeats;
        this.schedule = schedule;
    }
    public FlightSchedule()
    {

    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
