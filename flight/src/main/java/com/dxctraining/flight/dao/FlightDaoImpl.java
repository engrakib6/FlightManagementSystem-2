package com.dxctraining.flight.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;

import com.dxctraining.flight.entities.Flight;
import com.dxctraining.flight.exception.FlightNotFoundException;
@Repository
public class FlightDaoImpl implements IFlightDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Flight addFlight(Flight flight) {
		entityManager.persist(flight);
		return flight;
	}

	@Override
	public Flight viewByFlightNum(BigInteger flightNum) {

		Flight flight = entityManager.find(Flight.class, flightNum);
		if (flight == null) {
			throw new FlightNotFoundException("flight not found for the given flight number" +flightNum);
		}
		return flight;	}

	@Override
	public List<Flight> viewAllFlights() {
		 String jpaQuery = "from flight";
	       TypedQuery<Flight>flightquery= entityManager.createQuery(jpaQuery, Flight.class);
	        List<Flight> resultList = flightquery.getResultList();
	        return resultList;
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		entityManager.merge(flight);
		return flight;
		}

	
			@Override
	public void delete(BigInteger flightNum) {
		Flight flight=viewByFlightNum(flightNum);
		entityManager.remove(flight);
		
	}

}
