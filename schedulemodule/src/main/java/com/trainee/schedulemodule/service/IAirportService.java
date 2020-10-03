package com.trainee.schedulemodule.service;

import com.trainee.schedulemodule.entities.Airport;

import java.util.List;

public interface IAirportService {
	Airport findByCode(String code);
	Airport addAirport(Airport airport);
	Airport updateAirport(Airport arpt);
	void removeAirport(String code);
	List<Airport> listAll();
}
