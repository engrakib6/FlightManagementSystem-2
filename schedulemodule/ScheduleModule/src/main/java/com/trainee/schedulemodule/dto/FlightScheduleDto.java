package com.trainee.schedulemodule.dto;
import com.trainee.schedulemodule.entities.Flight;
import com.trainee.schedulemodule.entities.Schedule;
public class FlightScheduleDto {
    private Integer id;
    private Flight flight;
    private Integer availableSeats;
    private Schedule schedule;

    public FlightScheduleDto(Integer id, Flight flight, Integer availableSeats, Schedule schedule) {
        this.id = id;
        this.flight = flight;
        this.availableSeats = availableSeats;
        this.schedule = schedule;
    }
    public FlightScheduleDto()
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
