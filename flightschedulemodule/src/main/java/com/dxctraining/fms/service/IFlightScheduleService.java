package com.dxctraining.fms.service;

import com.dxctraining.fms.entities.FlightSchedule;

import java.math.BigInteger;
import java.util.List;

public interface IFlightScheduleService {

    FlightSchedule addFlightSchedule(FlightSchedule flightSchedule);

    FlightSchedule findByScheduleId(BigInteger id);

    List<FlightSchedule> getAllFlightSchedules();

    void deleteFlightSchedule(BigInteger id);




}
