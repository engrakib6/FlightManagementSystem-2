package com.trainee.schedulemodule.utility;

import com.trainee.schedulemodule.dto.FlightScheduleDto;
import com.trainee.schedulemodule.entities.FlightSchedule;
import org.springframework.stereotype.Component;

@Component
public class FlightScheduleUtil {
    public FlightScheduleDto dto(FlightSchedule flightSchedule)
    {
        FlightScheduleDto convert=new FlightScheduleDto(flightSchedule.getId(),
                flightSchedule.getFlight(),flightSchedule.getAvailableSeats(),flightSchedule.getSchedule());
        return convert;
    }
}
