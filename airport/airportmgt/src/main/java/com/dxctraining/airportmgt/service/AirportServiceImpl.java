package com.dxctraining.airportmgt.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.airportmgt.dao.IAirportDao;
import com.dxctraining.airportmgt.entities.Airport;
import com.dxctraining.airportmgt.exceptions.InvalidAirportCodeException;
import com.dxctraining.airportmgt.exceptions.AirportNotFoundException;
import com.dxctraining.airportmgt.exceptions.AirportNullException;

@Transactional
@Service
public class AirportServiceImpl implements IAirportService {

	@Autowired
	private IAirportDao dao;

	@Override
	public Airport findByCode(String code) {
		validateCode(code);
		Optional<Airport> optional = dao.findById(code);
		if (!optional.isPresent()) {
			throw new AirportNotFoundException("Airport not found");

		}
		Airport airport = optional.get();
		return airport;
	}
	

	private void validateCode(String code) {
		if (code == null) {
			throw new InvalidAirportCodeException("airport code cannot be null");
		}

	}

	@Override
	public Airport addAirport(Airport airport) {
		validateAirport(airport);
		String id = generateId();
		String sub = locationSubstring(airport);
		String generate = sub.concat(id);
		airport.setCode(generate);
		airport=dao.save(airport);
		return airport;
	}

	private String generateId() {
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			int randNum = random.nextInt(21);
			builder.append(randNum);
		}
		String id = builder.toString();
		return id;
	}

	private void validateAirport(Airport arpt) {
		if (arpt == null) {
			throw new AirportNullException("Airport is null");
		}

	}

	@Override
	public void removeAirport(String code) {
		validateCode(code);
		dao.existsById(code);

	}

	@Override
	public List<Airport> listAll() {
		List<Airport> listAll = dao.findAll();
		return listAll;
	}

	public String locationSubstring(Airport airport) {
		String loc = airport.getLocation();
		String sub = loc.substring(0, 3);
		return sub;
	}
}
