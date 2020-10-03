package com.trainee.schedulemodule.service;

import com.trainee.schedulemodule.dao.IFlightScheduleDao;
import com.trainee.schedulemodule.entities.Flight;
import com.trainee.schedulemodule.entities.FlightSchedule;
import com.trainee.schedulemodule.entities.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class FlightScheduleImp implements IFlightScheduleService{


    @Autowired
    private IFlightScheduleDao flightScheduleDao;


    @Override
    public FlightSchedule addFlightSchedule(FlightSchedule flightSchedule) {
        flightSchedule=flightScheduleDao.save(flightSchedule);
        return flightSchedule;
    }

    @Override
    public List<FlightSchedule> viewFlightSchedules() {
        List<FlightSchedule>scheduleList=flightScheduleDao.findAll();
        return scheduleList;
    }

    @Override
    public void deleteScheduleFlight(Integer scheduleId) {
        flightScheduleDao.deleteById(scheduleId);
    }

    @Override
    public FlightSchedule updateFlightSchedule(Flight flight, Schedule schedule, Integer id) {
        Optional check=flightScheduleDao.findById(id);
        if(check.isPresent())
        {
            FlightSchedule flightSchedule=flightScheduleDao.findById(id).get();
            flightSchedule.setFlight(flight);
            flightSchedule.setSchedule(schedule);
            flightScheduleDao.save(flightSchedule);
            return flightSchedule;
        }
        return null;
    }
}
