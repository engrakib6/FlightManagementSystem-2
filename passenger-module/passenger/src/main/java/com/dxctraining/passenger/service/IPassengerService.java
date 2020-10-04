package com.dxctraining.passenger.service;

import java.math.BigInteger;
import java.util.List;

import com.dxctraining.passenger.entities.Passenger;

public interface IPassengerService {
public List<Passenger> viewAllPassengers();
	
	public Passenger addPassenger(Passenger passenger);
	
     public	Passenger viewByPassengerNum(BigInteger passengerNum);
	public void deletePassenger(BigInteger passengerNum);
	void validate(Object obj);

}
