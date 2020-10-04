package com.trainee.schedulemodule.utility;

import com.trainee.schedulemodule.dto.AirportDetails;
import com.trainee.schedulemodule.entities.Airport;
import org.springframework.stereotype.Component;
@Component
public class AirportUtil {

    public AirportDetails airportDto(Airport airport){
        AirportDetails details=new AirportDetails(airport.getCode(),airport.getName(),airport.getLocation());
        return details;
    }


}
