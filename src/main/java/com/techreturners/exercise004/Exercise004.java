package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Exercise004 {
    LocalDateTime futureTime;
    long gigasecond = 1000000000;

    public Exercise004(LocalDate date) {
        LocalDateTime dt = LocalDateTime.of(date, LocalTime.of(0, 0, 0, 0));

        futureTime = dt.plusSeconds(gigasecond);
    }

    public Exercise004(LocalDateTime dateTime) {
        futureTime = dateTime.plusSeconds(gigasecond);
    }

    public LocalDateTime getDateTime() {
        return futureTime;
    }
}
