package com.diliprathore.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;

public class NewDateTimeExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate -> " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime -> " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime -> " + localDateTime);
        System.out.println("Hour in localDateTime -> " + localDateTime.getHour());

        LocalDate localDate1 = LocalDate.of(2018, 12, 10);
        System.out.println("localDate1 using .of method -> " + localDate1);

        System.out.println(localDate1.get(ChronoField.DAY_OF_MONTH));
        System.out.println(localDate1.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(localDate1.get(ChronoField.YEAR));

        System.out.println(localDate.plusDays(2));

        System.out.println(localDate.with(ChronoField.YEAR, 2024));

        System.out.println("isEqual ? -> " + localDate.isEqual(localDate1));
        System.out.println("isBefore ? -> " + localDate.isBefore(localDate1));

        // Period class

        Period period = Period.ofDays(10);
        System.out.println("period of 10 days -> " + period);
    }
}
