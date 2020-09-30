package com.dxctraining.flight.dao;

import java.math.BigInteger;
import java.util.List;
import com.dxctraining.flight.entities.Flight;

public interface IFlightDao {
	Flight addFlight(Flight flight);
	Flight modifyFlight(Flight flight);
	Flight viewByFlightNum(BigInteger flightNum);
	List<Flight> viewAllFlights();
	void delete(BigInteger flightNum);
	}

