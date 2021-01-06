package com.test.tuten.timeutc.services;

import com.test.tuten.timeutc.model.Response;
import com.test.tuten.timeutc.model.Time;
import org.springframework.stereotype.Service;

import java.time.*;

@Service
public class TimeServices {

    private String timeToString(int time){
        return time < 10 ? "0" + time: "" + time;
    }

    public Response getTime(Time time){
        LocalTime hour = LocalTime.parse(time.getTime());
        LocalDateTime dateTimeParams = LocalDateTime.of(LocalDate.now(),hour);
        ZoneId zone = ZoneId.of(time.getTimezone());
        ZonedDateTime zonedDateTimeParams = dateTimeParams.atZone(zone);
        ZonedDateTime timeUTC = zonedDateTimeParams.withZoneSameInstant(ZoneId.of("UTC"));
        String timeToString = timeToString(timeUTC.getHour())+":"+timeToString(timeUTC.getMinute())+":"
                +timeToString(timeUTC.getSecond());
        Time result = new Time(timeToString, timeUTC.getZone().toString().toLowerCase());
        return new Response(result);
    }

}
