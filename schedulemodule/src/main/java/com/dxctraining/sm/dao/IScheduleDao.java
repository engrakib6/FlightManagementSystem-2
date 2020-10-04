package com.dxctraining.sm.dao;

import com.dxctraining.sm.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IScheduleDao extends JpaRepository<Schedule,Integer> {

}