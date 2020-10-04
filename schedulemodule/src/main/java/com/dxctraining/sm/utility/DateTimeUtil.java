package com.dxctraining.sm.utility;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;
@Component
public class DateTimeUtil {
    long toMillis(LocalDateTime arrivalTime){
        ZonedDateTime zonedDateTime=ZonedDateTime.of(arrivalTime, ZoneId.systemDefault());
        long millis= zonedDateTime.toInstant().toEpochMilli();
        return millis;
    }

    public LocalDateTime toDateTime(long millis){
        LocalDateTime datetime =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(millis),
                        TimeZone.getDefault().toZoneId());
        return datetime;
    }
}
