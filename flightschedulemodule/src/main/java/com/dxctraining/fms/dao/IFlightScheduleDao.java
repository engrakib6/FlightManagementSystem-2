package com.dxctraining.fms.dao;

import com.dxctraining.fms.entities.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface IFlightScheduleDao extends JpaRepository<FlightSchedule,BigInteger> {
}
