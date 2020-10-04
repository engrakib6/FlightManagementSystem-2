package com.dxctraining.sm.service;

import com.dxctraining.sm.entities.Schedule;

import java.util.List;

public interface IScheduleService {
    Schedule addSchedule(Schedule schedule);
    void removeSchedule(Integer id);
    List<Schedule> getAllSchedules();
    Schedule findById(Integer id);

}
