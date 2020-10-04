package com.dxctraining.sm.utility;

import com.dxctraining.sm.dto.AirportDetails;
import com.dxctraining.sm.dto.ScheduleDto;
import com.dxctraining.sm.entities.Schedule;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
@Component
public class ScheduleUtility {
    public ScheduleDto dto(Schedule schedule, AirportDetails airportDetails)
    {
       ScheduleDto scheduleDto=new ScheduleDto();
       scheduleDto.setScheduleId(schedule.getScheduleId());
       LocalDateTime aT=schedule.getArrivalTime();
       long arrT=toMillis(aT);
       scheduleDto.setArrivalTime(arrT);
       LocalDateTime dT=schedule.getDepartureTime();
       long dpT=toMillis(dT);
       scheduleDto.setDepartureTime(dpT);
       scheduleDto.setAirportCode(schedule.getAirportCode());
       scheduleDto.setAirportLocation(airportDetails.getLocation());
       scheduleDto.setAirportName(airportDetails.getName());
       scheduleDto.setFromAirport(schedule.getFromAirport());
       scheduleDto.setToAirport(schedule.getToAirport());
        return scheduleDto;
    }
    long toMillis(LocalDateTime arrivalTime){
        ZonedDateTime zonedDateTime=ZonedDateTime.of(arrivalTime, ZoneId.systemDefault());
        long millis= zonedDateTime.toInstant().toEpochMilli();
        return millis;
    }

}
