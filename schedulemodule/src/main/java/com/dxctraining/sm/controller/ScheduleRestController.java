package com.dxctraining.sm.controller;

import com.dxctraining.sm.dto.AirportDetails;
import com.dxctraining.sm.dto.CreateSchedule;
import com.dxctraining.sm.dto.ScheduleDto;
import com.dxctraining.sm.entities.Schedule;
import com.dxctraining.sm.service.IScheduleService;
import com.dxctraining.sm.utility.DateTimeUtil;
import com.dxctraining.sm.utility.ScheduleUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleRestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DateTimeUtil timeUtil;
    @Autowired
    private ScheduleUtility scheduleUtility;
    @Autowired
    private IScheduleService scheduleService;

    @PostMapping("/add")
    public ScheduleDto saveSchedule(@RequestBody CreateSchedule data)
    {
        long aT=data.getArrivalTime();
        long dT=data.getDepartureTime();
        LocalDateTime dTime=timeUtil.toDateTime(aT);
        LocalDateTime aTime=timeUtil.toDateTime(dT);
        Schedule schedule=new Schedule();
        schedule.setArrivalTime(aTime);
        schedule.setDepartureTime(dTime);
        schedule.setFromAirport(data.getFromAirport());
        schedule.setToAirport(data.getToAirport());
        schedule.setAirportCode(data.getAirportCode());
        schedule=scheduleService.addSchedule(schedule);
        AirportDetails airportDetails=findAirportById(data.getAirportCode());
        ScheduleDto res=scheduleUtility.dto(schedule,airportDetails);
        return  res;
    }

    private AirportDetails findAirportById(String airportCode) {
        String airporturl="http://airportapp/airports/get"+airportCode;
        AirportDetails details=restTemplate.getForObject(airporturl,AirportDetails.class);
        return details;
    }
    @DeleteMapping("/remove/{id}")
    public void removeSchedule(@PathVariable("id")Integer id)
    {
        scheduleService.removeSchedule(id);
    }
    @GetMapping
    public List<ScheduleDto> getAllSchedules()
    {
        List<Schedule> scheduleList=scheduleService.getAllSchedules();
        List<ScheduleDto> scheduleDtos=new ArrayList<>();
        for(Schedule s:scheduleList) {
            String aCode = s.getAirportCode();
            AirportDetails details=findAirportById(aCode);
            ScheduleDto scheduleDto=scheduleUtility.dto(s,details);
            scheduleDtos.add(scheduleDto);
        }
        return scheduleDtos;
    }

    @GetMapping("/get/{id}")
    public ScheduleDto findById(@PathVariable("id") Integer id)
    {
        Schedule schedule=scheduleService.findById(id);
        String aCode = schedule.getAirportCode();
        AirportDetails details=findAirportById(aCode);
        ScheduleDto scheduleDto=scheduleUtility.dto(schedule,details);
        return  scheduleDto;
    }
}


