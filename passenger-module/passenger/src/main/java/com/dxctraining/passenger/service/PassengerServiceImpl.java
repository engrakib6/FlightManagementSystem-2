package com.dxctraining.passenger.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.passenger.dao.IPassengerDao;
import com.dxctraining.passenger.entities.Passenger;
import com.dxctraining.passenger.exception.InvalidArgumentException;
import com.dxctraining.passenger.exception.PassengerNotFoundException;

@Transactional
@Service
public class PassengerServiceImpl implements IPassengerService {
	
	@Autowired
	IPassengerDao dao;

	@Override
	public List<Passenger> viewAllPassengers() {
		return dao.findAll();
	}

	@Override
	public Passenger addPassenger(Passenger passenger) {
		validate(passenger);
		return dao.save(passenger);
	}

	@Override
	public Passenger viewByPassengerNum(BigInteger passengerNum) {
		Optional<Passenger> optional = dao.findById(passengerNum);
		if (!optional.isPresent()) {
			throw new PassengerNotFoundException("passenger not found for the given passenger number=" + passengerNum);
		}
		Passenger passenger = optional.get();
		return passenger;
	}

	@Override
	public void deletePassenger(BigInteger passengerNum) {
		validate(passengerNum);
		dao.deleteById(passengerNum);		
	}
	@Override
	public void validate(Object obj) {
		if (obj == null) {
			throw new InvalidArgumentException("given argument is not valid");
		}
		
	}

}
