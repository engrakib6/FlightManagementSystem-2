package com.dxctraining.flight.service;

import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.flight.dao.IFlightDao;
import com.dxctraining.flight.entities.Flight;
import com.dxctraining.flight.exception.InvalidArgumentException;

@Transactional
@Service
public class FlightServiceImpl implements IFlightService {
	@Autowired
	IFlightDao dao;
	@Override
	public Flight addFlight(Flight flight) {
		validate(flight);
		return dao.addFlight(flight);
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		return dao.modifyFlight(flight);
		
	}

	@Override
	public Flight viewByFlightNum(BigInteger flightNum) {
		validate(flightNum);
		return dao.viewByFlightNum(flightNum);
	}

	
	@Override
	public List<Flight> viewAllFlights() {
				return dao.viewAllFlights();
	}

	@Override
	public void delete(BigInteger flightNum) {
		validate(flightNum);
		dao.delete(flightNum);	
	}

	@Override
	public void validate(Object obj) {
		if (obj == null) {
			throw new InvalidArgumentException("given argument is not valid");
		}
		
	}

}
