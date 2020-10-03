package com.dxctraining.airportmgt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxctraining.airportmgt.entities.Airport;


public interface IAirportDao extends JpaRepository<Airport,String> {
	
}
