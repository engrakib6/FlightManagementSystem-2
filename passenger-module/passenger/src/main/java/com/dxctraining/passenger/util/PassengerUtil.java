package com.dxctraining.passenger.util;

import org.springframework.stereotype.Component;

import com.dxctraining.passenger.dto.PassengerDto;
import com.dxctraining.passenger.entities.Passenger;

@Component
public class PassengerUtil {
	public PassengerDto passengerDto(Passenger passenger) {
		PassengerDto dto= new PassengerDto(passenger.getPassengerNum(),passenger.getPassengerName(),passenger.getPassengerAge(),passenger.getPassengerUIN(),passenger.getLuggage());
		return dto;
	}
}
