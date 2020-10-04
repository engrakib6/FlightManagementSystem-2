package com.trainee.schedulemodule.service;

import com.trainee.schedulemodule.entities.Airport;
import com.trainee.schedulemodule.entities.Flight;
import com.trainee.schedulemodule.entities.FlightSchedule;
import com.trainee.schedulemodule.entities.Schedule;

import java.util.Date;
import java.util.List;

public interface IFlightScheduleService {
    FlightSchedule addFlightSchedule(FlightSchedule flightSchedule);

    List<FlightSchedule> viewFlightSchedules();

    void deleteScheduleFlight(Integer scheduleId);

    FlightSchedule updateFlightSchedule(Flight flight, Schedule schedule, Integer id);

//    List<FlightSchedule> viewFlights(Airport source, Airport destination, Date date);

}
