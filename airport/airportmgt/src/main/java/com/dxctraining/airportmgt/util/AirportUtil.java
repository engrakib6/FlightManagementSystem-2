package com.dxctraining.airportmgt.util;

import org.springframework.stereotype.Component;

import com.dxctraining.airportmgt.dto.AirportDetails;
import com.dxctraining.airportmgt.entities.Airport;

@Component
public class AirportUtil {

	public AirportDetails airportDto(Airport airport) {
		AirportDetails details = new AirportDetails(airport.getCode(), airport.getName(), airport.getLocation());
		return details;
	}

}
