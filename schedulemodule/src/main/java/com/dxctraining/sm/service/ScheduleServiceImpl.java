package com.dxctraining.sm.service;

import com.dxctraining.sm.dao.IScheduleDao;
import com.dxctraining.sm.entities.Schedule;
import com.dxctraining.sm.exceptions.InvalidArgumentException;
import com.dxctraining.sm.exceptions.ScheduleNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ScheduleServiceImpl implements IScheduleService{
    @Autowired
    private IScheduleDao scheduleDao;

    @Override
    public Schedule addSchedule(Schedule schedule) {
    validate(schedule);
    schedule=scheduleDao.save(schedule);
    return schedule;
    }

    private void validate(Schedule schedule) {
    if(schedule==null)
    {
        throw new InvalidArgumentException("schedule cant be null");
    }
    }

    @Override
    public void removeSchedule(Integer id) {
     scheduleDao.deleteById(id);
    }

    @Override
    public List<Schedule> getAllSchedules() {
        List<Schedule>scheduleList=scheduleDao.findAll();
        return scheduleList;
    }

    @Override
    public Schedule findById(Integer id) {
        Optional<Schedule> exists=scheduleDao.findById(id);
        if(!exists.isPresent())
        {
            throw new ScheduleNotFound("schedule doesnt exists");
        }
        Schedule schedule=exists.get();
        return schedule;
    }
}
