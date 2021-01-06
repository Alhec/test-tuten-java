package com.test.tuten.timeutc.model;

public class Time {

    private String time;
    private String timezone;

    public Time(String time, String timezone) {
        this.time = time;
        this.timezone = timezone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

}
