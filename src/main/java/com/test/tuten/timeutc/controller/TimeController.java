package com.test.tuten.timeutc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.tuten.timeutc.model.Response;
import com.test.tuten.timeutc.model.Time;
import com.test.tuten.timeutc.services.TimeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @Autowired
    private TimeServices timeServices;

    @PostMapping("/getTime")
    public Response getTimeZone(@RequestBody Time body) {
        return timeServices.getTime(body);
    }
}
