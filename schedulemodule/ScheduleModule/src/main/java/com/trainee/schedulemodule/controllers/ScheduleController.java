package com.trainee.schedulemodule.controllers;

import com.trainee.schedulemodule.dto.CreateFlightSchedule;
import com.trainee.schedulemodule.dto.FlightScheduleDto;
import com.trainee.schedulemodule.entities.Flight;
import com.trainee.schedulemodule.entities.FlightSchedule;
import com.trainee.schedulemodule.entities.Schedule;
import com.trainee.schedulemodule.service.IFlightScheduleService;
import com.trainee.schedulemodule.utility.FlightScheduleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    @Autowired
    private IFlightScheduleService scheduleService;
    @Autowired
    private FlightScheduleUtil flightScheduleUtil;

    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseBody
   //@PostMapping("/add")
    public FlightScheduleDto addSchedule(@RequestBody CreateFlightSchedule requestdata) {
        Integer seats = requestdata.getAvailableSeats();
        Flight flight = requestdata.getFlight();
        Schedule schedule = requestdata.getSchedule();
        FlightSchedule schedule1 = new FlightSchedule(flight, seats, schedule);
        schedule1 = scheduleService.addFlightSchedule(schedule1);
        FlightScheduleDto response = flightScheduleUtil.dto(schedule1);
        System.out.println("in the add schedule method");
        return response;
    }





//    }
//    @PostMapping(value = "/add")
//    public ResponseEntity<String>addschedule(@RequestBody CreateFlightSchedule requestdata)
//    {
//        Integer seats=requestdata.getAvailableSeats();
//        Flight flight=requestdata.getFlight();
//       Schedule schedule=requestdata.getSchedule();
//       FlightSchedule schedule1=new FlightSchedule(flight,seats, schedule);
//       schedule1=scheduleService.addFlightSchedule(schedule1);
//       return new ResponseEntity<String>("schedule created",new HttpHeaders(),HttpStatus.OK);
//    }
}
