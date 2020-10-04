package com.trainee.schedulemodule.dao;

import com.trainee.schedulemodule.entities.Airport;
import com.trainee.schedulemodule.entities.Flight;
import com.trainee.schedulemodule.entities.FlightSchedule;
import com.trainee.schedulemodule.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IFlightScheduleDao extends JpaRepository<FlightSchedule,Integer> {
    FlightSchedule findBySchedule(Schedule schedule);
    List<FlightSchedule> findById(Flight flight);
}
