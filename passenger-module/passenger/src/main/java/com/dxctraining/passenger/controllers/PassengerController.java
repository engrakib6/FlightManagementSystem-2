package com.dxctraining.passenger.controllers;

import java.math.BigInteger;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.dxctraining.passenger.dto.CreatePassengerRequest;
import com.dxctraining.passenger.dto.PassengerDto;
import com.dxctraining.passenger.entities.Passenger;
import com.dxctraining.passenger.service.IPassengerService;
import com.dxctraining.passenger.util.PassengerUtil;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

	@Autowired
	private IPassengerService service;

	@Autowired
	private PassengerUtil util;

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public PassengerDto create(@RequestBody CreatePassengerRequest requestData) {
		Passenger passenger= new Passenger();
		passenger.setPassengerName(requestData.getPassengerName());
		passenger.setPassengerUIN(requestData.getPassengerUIN());
		passenger.setPassengerAge(requestData.getPassengerAge());
		passenger.setLuggage(requestData.getLuggage());
		passenger =service.addPassenger(passenger);
		PassengerDto response=util.passengerDto(passenger);
		return response;
			}

	@GetMapping
    public List<PassengerDto> fetchAll() {
        List<Passenger> list = service.viewAllPassengers();
        List<PassengerDto>response=new ArrayList<>();
        for (Passenger passenger:list){
            PassengerDto dto= util.passengerDto(passenger);
            response.add(dto);
        }
        return response;
    }

	  @DeleteMapping(value = "/delete/{passengerNum}")
	    private void delete(@PathVariable(value = "passengerNum")BigInteger passengerNum){
	    	service.deletePassenger(passengerNum);
	    }
}
