package com.trainee.schedulemodule.controllers;

import java.math.BigInteger;

import com.trainee.schedulemodule.dto.CreateFlightRequest;
import com.trainee.schedulemodule.dto.FlightDto;
import com.trainee.schedulemodule.entities.Flight;
import com.trainee.schedulemodule.service.IFlightService;
import com.trainee.schedulemodule.utility.FlightUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/flights")
public class FlightController {

	@Autowired
	private IFlightService service;

	@Autowired
	private FlightUtil util;

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public FlightDto create(@RequestBody CreateFlightRequest requestData) {
		Flight flight = new Flight();
		flight.setFlightModel(requestData.getFlightModel());
		flight.setCarrierName(requestData.getCarrierName());
		flight.setSeatCapacity(requestData.getSeatCapacity());
		flight = service.addFlight(flight);
		FlightDto response = util.flightDto(flight);
		return response;
	}

	@GetMapping("/get/{flightNum}")
	@ResponseStatus(HttpStatus.OK)
	public FlightDto viewBy(@PathVariable("flightNum") BigInteger flightNum) {
		Flight flight = service.viewByFlightNum(flightNum);
		FlightDto response = util.flightDto(flight);
		return response;
	}

}
