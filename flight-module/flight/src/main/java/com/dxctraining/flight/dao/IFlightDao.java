package com.dxctraining.flight.dao;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dxctraining.flight.entities.Flight;

public interface IFlightDao extends JpaRepository<Flight, BigInteger> {
	
	}

