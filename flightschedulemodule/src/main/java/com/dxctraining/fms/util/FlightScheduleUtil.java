package com.dxctraining.fms.util;

import com.dxctraining.fms.dto.FlightDto;
import com.dxctraining.fms.dto.FlightScheduleDto;
import com.dxctraining.fms.dto.ScheduleDto;
import com.dxctraining.fms.entities.FlightSchedule;
import org.springframework.stereotype.Component;

@Component
public class FlightScheduleUtil {

    public FlightScheduleDto flightScheduleDto(
            FlightSchedule flightSchedule, ScheduleDto scheduleDto, FlightDto flightDto)
    {
        FlightScheduleDto convDto=new FlightScheduleDto();
        convDto.setScheduleFlightId(flightSchedule.getScheduleFlightId());
        convDto.setSeatsAvailable(flightSchedule.getAvailableSeats());
        convDto.setScheduleId(scheduleDto.getScheduleId());
        convDto.setArrivalTime(scheduleDto.getArrivalTime());
        convDto.setDepartureTime(scheduleDto.getDepartureTime());
        convDto.setCarrierName(flightDto.getCarrierName());
        convDto.setSeatsCapacity(flightDto.getSeatCapacity());
        convDto.setFlightNum(flightDto.getFlightNum());
        convDto.setFlightModel(flightDto.getFlightModel());
        convDto.setSourceAirport(scheduleDto.getSourceAirport());
        convDto.setDestinationAirport(scheduleDto.getDestinationAirport());
        return convDto;
    }
}
