package com.test.tuten.timeutc;

import com.test.tuten.timeutc.model.Time;
import com.test.tuten.timeutc.services.TimeServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TimeUtcApplicationTests {

    @Autowired
    private TimeServices timeServices;

    TimeUtcApplicationTests() {
        this.timeServices = new TimeServices();
    }

    @Test
    void contextLoads() {
    }

    @Test
    void TimezoneUTC4() {
        Time time = new Time("12:02:59","-4");
        Time result = timeServices.getTime(time).getResponse();
        assertEquals("16:02:59",result.getTime());
    }

}
