package com.trainee.schedulemodule.dao;

import com.trainee.schedulemodule.entities.Airport;

import java.util.List;

public interface IAirportDao {
	Airport findByCode(String code);
	Airport addAirport(Airport airport);
	Airport updateAirport(Airport arpt);
	void removeAirport(String code);
	List<Airport> listAll();
}
