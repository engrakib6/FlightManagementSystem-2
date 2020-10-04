package com.trainee.schedulemodule.service;

import com.trainee.schedulemodule.entities.Flight;

import java.math.BigInteger;
import java.util.List;

public interface IFlightService {
	Flight addFlight(Flight flight);
	Flight modifyFlight(Flight flight);
	Flight viewByFlightNum(BigInteger flightNum);
	List<Flight> viewAllFlights();
	void delete(BigInteger flightNum);
	void validate(Object obj);

}
