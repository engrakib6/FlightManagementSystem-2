package com.dxctraining.fms.controller;

import com.dxctraining.fms.dto.CreateFlightSchedule;
import com.dxctraining.fms.dto.FlightDto;
import com.dxctraining.fms.dto.FlightScheduleDto;
import com.dxctraining.fms.dto.ScheduleDto;
import com.dxctraining.fms.entities.FlightSchedule;
import com.dxctraining.fms.service.IFlightScheduleService;
import com.dxctraining.fms.util.FlightScheduleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flightschedules")
public class FlightScheduleController {
    @Autowired
    private IFlightScheduleService flightScheduleService;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private FlightScheduleUtil flightScheduleUtil;

    @PostMapping("/add")
    public FlightScheduleDto saveFlightSchedule(@RequestBody CreateFlightSchedule create) {
        System.out.println(create.getFlightNum());
        FlightSchedule flightSchedule = new FlightSchedule(
                create.getAvailableSeats(), create.getScheduleId(), create.getFlightNum());
        flightSchedule = flightScheduleService.addFlightSchedule(flightSchedule);
        ScheduleDto scheduleDto = findById(create.getScheduleId());
        FlightDto flightDto = findByFlightNum(create.getFlightNum());
        FlightScheduleDto convert = flightScheduleUtil.flightScheduleDto(flightSchedule, scheduleDto, flightDto);
        return convert;
    }

    private FlightDto findByFlightNum(BigInteger flightNum) {
        String flighturl = "http://localhost:8080/flights/get/" + flightNum;
        FlightDto response = restTemplate.getForObject(flighturl, FlightDto.class);
        return response;
    }

    private ScheduleDto findById(Integer scheduleId) {
        String scheduleurl = "http://localhost:8085/schedules/get/" + scheduleId;
        ScheduleDto res = restTemplate.getForObject(scheduleurl, ScheduleDto.class);
        return res;
    }

    @GetMapping
    public List<FlightScheduleDto> getFlightSchedules() {
           List<FlightSchedule>flightScheduleList=flightScheduleService.getAllFlightSchedules();
           List<FlightScheduleDto> result=new ArrayList<>();
           for(FlightSchedule flightSchedule:flightScheduleList)
           {
               BigInteger flightNum=flightSchedule.getFlightNum();
               Integer id=flightSchedule.getScheduleId();
               ScheduleDto scheduleDto=findById(id);
               FlightDto flightDto=findByFlightNum(flightNum);
               FlightScheduleDto convert = flightScheduleUtil.flightScheduleDto(flightSchedule, scheduleDto, flightDto);
            result.add(convert);
           }
           return result;
    }
    @GetMapping("/get/{id}")
    public FlightScheduleDto getById(@PathVariable("id") BigInteger id)
    {
        FlightSchedule flightSchedule=flightScheduleService.findByScheduleId(id);
        Integer sid=flightSchedule.getScheduleId();
        ScheduleDto scheduleDto=findById(sid);
        BigInteger flightNum=flightSchedule.getFlightNum();
        FlightDto flightDto=findByFlightNum(flightNum);
        FlightScheduleDto convert = flightScheduleUtil.flightScheduleDto(flightSchedule, scheduleDto, flightDto);
        return convert;
    }
}
