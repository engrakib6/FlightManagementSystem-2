package com.trainee.schedulemodule.service;

import java.util.List;
import java.util.Random;

import com.trainee.schedulemodule.dao.IAirportDao;
import com.trainee.schedulemodule.entities.Airport;
import com.trainee.schedulemodule.exceptions.AirportNullException;
import com.trainee.schedulemodule.exceptions.InvalidAirportCodeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AirportServiceImpl implements IAirportService {

    @Autowired
    private IAirportDao dao;

    @Override
    public Airport findByCode(String code) {
        validateCode(code);
        Airport airport = dao.findByCode(code);
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
        dao.addAirport(airport);
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
    public Airport updateAirport(Airport aport) {
        validateAirport(aport);
        String id = generateId();
        String sub1 = locationSubstring(aport);
        String generated = sub1.concat(id);
        aport.setCode(generated);
        dao.updateAirport(aport);
        return aport;
    }


    @Override
    public void removeAirport(String code) {
        validateCode(code);
        dao.removeAirport(code);

    }

    @Override
    public List<Airport> listAll() {
        List<Airport> listAll = dao.listAll();
        return listAll;
    }

    public String locationSubstring(Airport airport) {
        String loc = airport.getLocation();
        String sub = loc.substring(0, 3);
        return sub;
    }
}
