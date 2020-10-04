package com.dxctraining.fms.service;

import com.dxctraining.fms.dao.IFlightScheduleDao;
import com.dxctraining.fms.entities.FlightSchedule;
import com.dxctraining.fms.exceptions.FlightScheduleNotFound;
import com.dxctraining.fms.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FlightSchedulesServiceImplementation implements IFlightScheduleService{

@Autowired
private IFlightScheduleDao flightScheduleDao;

    @Override
    public FlightSchedule addFlightSchedule(FlightSchedule flightSchedule) {
        validate(flightSchedule);
        flightSchedule=flightScheduleDao.save(flightSchedule);
        return flightSchedule;
    }

    private void validate(FlightSchedule flightSchedule) {
        if(flightSchedule==null)
        {
            throw  new InvalidArgumentException("Flight schedule cant be null");
        }
    }

    @Override
    public FlightSchedule findByScheduleId(BigInteger id) {
        Optional<FlightSchedule>exists=flightScheduleDao.findById(id);
        if(!exists.isPresent())
        {
            throw new FlightScheduleNotFound("flight schedule didnt exist "+id);
        }
        FlightSchedule flightSchedule=exists.get();
        return flightSchedule;
    }

    @Override
    public List<FlightSchedule> getAllFlightSchedules() {
        List<FlightSchedule>flightScheduleList=flightScheduleDao.findAll();
        return flightScheduleList;
    }

    @Override
    public void deleteFlightSchedule(BigInteger id) {
       flightScheduleDao.deleteById(id);
    }
}
