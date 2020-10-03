package com.dxctraining.airportmgt.dao;

import java.util.List;

import com.dxctraining.airportmgt.entities.Airport;

public interface IAirportDao {
	Airport findByCode(String code);

	Airport addAirport(Airport airport);

	void removeAirport(String code);

	List<Airport> listAll();
}
