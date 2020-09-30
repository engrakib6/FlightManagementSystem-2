package com.dxctraining.airportmgt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.dxctraining.airportmgt.entities.Airport;
import com.dxctraining.airportmgt.exceptions.AirportNullException;

@Repository
public class AirportDaoImpl implements IAirportDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Airport findByCode(String code) {
		Airport airport = em.find(Airport.class, code);
		if(airport == null) {
			throw new AirportNullException("Airport is null");
		}
		return airport;
	}

	@Override
	public Airport addAirport(Airport airport) {
		em.persist(airport);
		return airport;
	}

	@Override
	public Airport updateAirport(Airport arpt) {
		em.merge(arpt);
		return arpt;
	}

	@Override
	public void removeAirport(String code) {
		Airport airport = findByCode(code);
		em.remove(airport);
		
	}

	@Override
	public List<Airport> listAll() {
		String jpaql = "from Airport";
		TypedQuery<Airport>query=em.createQuery(jpaql, Airport.class);
		List<Airport>listAll=query.getResultList();
		return listAll;
	}


}
