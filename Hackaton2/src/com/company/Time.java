package com.company;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int timeToSec(Time time) {
        return time.hours * 3600 + time.minutes * 60 + time.seconds;
    }
}
