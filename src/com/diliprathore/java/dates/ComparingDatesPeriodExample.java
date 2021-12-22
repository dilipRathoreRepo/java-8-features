package com.diliprathore.java.dates;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate localDateStart = LocalDate.of(2019, 12, 02);
        LocalDate localDateEnd = LocalDate.now();

        Period period = localDateStart.until(localDateEnd);
        System.out.println("period is -> " + period);
        // OR
        Period period_2 = Period.between(localDateStart, localDateEnd);
        System.out.println("period using between is -> " + period_2);
        System.out.println("Period -> " + period.getYears() + " years, " + period.getMonths()
        + ", months " + period.getDays() + " days");

        Period period1 = Period.ofYears(20);
        System.out.println("20 years to months -> " + period1.toTotalMonths());

//        Checking Duration for time difference
        LocalTime localTime1 = LocalTime.of(4, 10, 15);
        LocalTime localTime2 = LocalTime.of(5, 22, 37);
        long differenceInMinutes = localTime1.until(localTime2, ChronoUnit.MINUTES);
        long differenceInSecs = localTime1.until(localTime2, ChronoUnit.SECONDS);
        //
        Duration differenceInMinutes_2 = Duration.between(localTime1,localTime2);
        System.out.println("differenceInMinutes_2 Duration -> " + differenceInMinutes_2);
        System.out.println("differenceInMinutes_2.toMinutes() -> " + differenceInMinutes_2.toMinutes());
        System.out.println("differenceInMinutes_2.getSeconds() -> " + differenceInMinutes_2.getSeconds());
        System.out.println("differenceInMinutes_2.toSeconds() -> " + differenceInMinutes_2.toSeconds());

        System.out.println("localTime1 -> " + localTime1);
        System.out.println("localTime2 -> " + localTime2);
        System.out.println("difference in minutes -> " + differenceInMinutes);
        System.out.println("differenceInSecs -> " + differenceInSecs);


//        Instant (EPOC)
        Instant instant = Instant.now();
        System.out.println("Instant -> "+ instant);

        Instant instant1 = Instant.now();

        System.out.println("Diff -> " + Duration.between(instant, instant1).getNano());


    }
}
