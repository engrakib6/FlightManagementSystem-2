package com.dxctraining.flight.controllers;

import java.math.BigInteger;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.dxctraining.flight.dto.CreateFlightRequest;
import com.dxctraining.flight.dto.FlightDto;
import com.dxctraining.flight.entities.Flight;
import com.dxctraining.flight.exception.FlightNotFoundException;
import com.dxctraining.flight.service.IFlightService;
import com.dxctraining.flight.util.FlightUtil;

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
	
	@GetMapping(value = "/list")
	@ResponseStatus(HttpStatus.OK)
    public List<Flight> viewAllFlights(){
        return service.viewAllFlights();
    }
		@PutMapping("/modify")
	public FlightDto modify(@RequestBody CreateFlightRequest requestData) {
			Flight flight = new Flight();
			flight.setFlightModel(requestData.getFlightModel());
			flight.setCarrierName(requestData.getCarrierName());
			flight.setSeatCapacity(requestData.getSeatCapacity());
		flight = service.modifyFlight(flight);
		FlightDto response=util.flightDto(flight);
		if (flight == null) {
			throw new FlightNotFoundException("Update Operation Unsuccessful");
		} else {
			return response;
		}
	}

	  @DeleteMapping(value = "/delete/{flightNum}")
	    private void delete(@PathVariable(value = "flightNum")BigInteger flightNum){
	    	service.delete(flightNum);
	    }
}
