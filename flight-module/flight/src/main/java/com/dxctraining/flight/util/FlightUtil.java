package com.dxctraining.flight.util;

import org.springframework.stereotype.Component;

import com.dxctraining.flight.dto.FlightDto;
import com.dxctraining.flight.entities.Flight;

@Component
public class FlightUtil {
	public FlightDto flightDto(Flight flight) {
		FlightDto dto=new FlightDto(flight.getFlightNum(),flight.getFlightModel(),flight.getCarrierName(),flight.getSeatCapacity());
		return dto;
	}
}
