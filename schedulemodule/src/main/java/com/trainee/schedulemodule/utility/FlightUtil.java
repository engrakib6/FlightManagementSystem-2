package com.trainee.schedulemodule.utility;

import com.trainee.schedulemodule.dto.FlightDto;
import com.trainee.schedulemodule.entities.Flight;
import org.springframework.stereotype.Component;

@Component
public class FlightUtil {
	public FlightDto flightDto(Flight flight) {
		FlightDto dto=new FlightDto(flight.getFlightNum(),flight.getFlightModel(),flight.getCarrierName(),flight.getSeatCapacity());
		return dto;
	}
}
