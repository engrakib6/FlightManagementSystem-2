package com.dxctraining.flight.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.flight.dao.IFlightDao;
import com.dxctraining.flight.entities.Flight;
import com.dxctraining.flight.exception.FlightNotFoundException;
import com.dxctraining.flight.exception.InvalidArgumentException;

@Transactional
@Service
public class FlightServiceImpl implements IFlightService {
	@Autowired
	IFlightDao dao;
	@Override
	public Flight addFlight(Flight flight) {
		validate(flight);
		flight= dao.save(flight);
		return flight;
	}

	@Override
	public Flight viewByFlightNum(BigInteger flightNum) {
		Optional<Flight> optional = dao.findById(flightNum);
		if (!optional.isPresent()) {
			throw new FlightNotFoundException("Flight not found for the given flight Number");
		}
		Flight flight = optional.get();
		return flight;
		
	}

	
	@Override
	public List<Flight> viewAllFlights() {
				return dao.findAll();
	}

	@Override
	public void delete(BigInteger flightNum) {
		validate(flightNum);
		dao.deleteById(flightNum);	
	}

	@Override
	public void validate(Object obj) {
		if (obj == null) {
			throw new InvalidArgumentException("given argument is not valid");
		}
		
	}

}
