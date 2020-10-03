package com.trainee.schedulemodule.controllers;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.trainee.schedulemodule.dto.AirportDetails;
import com.trainee.schedulemodule.dto.CreateAirportRequest;
import com.trainee.schedulemodule.dto.UpdateAirportRequest;
import com.trainee.schedulemodule.entities.Airport;
import com.trainee.schedulemodule.service.IAirportService;
import com.trainee.schedulemodule.utility.AirportUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@Validated
@RestController
@RequestMapping("/airports")
public class AirportRestController {
	
	@Autowired
	private IAirportService service;

    @Autowired
    private AirportUtil airportUtil;

    @Autowired
    private RestTemplate restTemplate;
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public AirportDetails createAirport(@Valid @NotNull @RequestBody CreateAirportRequest airport) {
		String name=airport.getName();
		String location=airport.getLocation();
		Airport s1 = new Airport(name,location);
		s1 = service.addAirport(s1);
		 AirportDetails response = airportUtil.airportDto(s1);
	     return response;
	}
	
	@GetMapping("/get/{code}")
	@ResponseStatus(HttpStatus.OK)
	public AirportDetails getAirport(@NotBlank @Size(min=6) @PathVariable("code")String code) {
		Airport s1 = service.findByCode(code);
		AirportDetails response = airportUtil.airportDto(s1);
	    return response;
	}
	
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public AirportDetails updateAirport(@Valid @NotNull @RequestBody UpdateAirportRequest uar) {
		Airport s1 = new Airport(uar.getName(),uar.getLocation());
		s1 = service.updateAirport(s1);
		 AirportDetails response = airportUtil.airportDto(s1);
	    return response;

	}
	
	@DeleteMapping("/delete/{code}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteAirport(@NotBlank @Size(min=6)@PathVariable("code")String code)
	{
	        service.removeAirport(code);
	
	}

}
