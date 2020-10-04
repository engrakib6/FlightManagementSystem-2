package com.trainee.schedulemodule.dao;

import com.trainee.schedulemodule.entities.Airport;
import com.trainee.schedulemodule.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ScheduleDao extends JpaRepository<Schedule,Integer>{
    //List<Schedule> betweenAirports(Airport source,Airport destination);
}
