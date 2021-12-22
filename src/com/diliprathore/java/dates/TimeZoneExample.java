package com.diliprathore.java.dates;

import java.time.*;

public class TimeZoneExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getZone());
        System.out.println(zonedDateTime.toLocalDateTime());
        System.out.println(zonedDateTime.getOffset());

        System.out.println(ZoneId.getAvailableZoneIds());

//        Get time for a specific Zone

        System.out.println("time in India -> " + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));

        System.out.println("LocalDateTime.now(ZoneId.of(\"Asia/Kolkata\")) ->" + LocalDateTime.now(ZoneId.of("Asia/Kolkata"))); // gives localDateTime without time zone

        /**
         *  Convert from LocalDateTime instant to ZonedDateTime
         */

        LocalDateTime localDateTimeChicago = LocalDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("localDateTime of Chicago -> "+ localDateTimeChicago);

        ZonedDateTime zonedDateTimeChicago = localDateTimeChicago.atZone(ZoneId.of("America/Chicago"));
        System.out.println("zonedDateTimeChicago -> " + zonedDateTimeChicago);

        OffsetDateTime offsetDateTime = localDateTimeChicago.atOffset(ZoneOffset.ofHours(-6));
        System.out.println("offsetDateTime -> " + offsetDateTime);

        ZonedDateTime zonedDateTimeChicagoAustralia = localDateTimeChicago.atZone(ZoneId.of("Australia/Melbourne"));
        System.out.println("zonedDateTimeChicagoAustralia -> " + zonedDateTimeChicagoAustralia);

        ZonedDateTime localDateTimeChicago1 = Instant.now().atZone(ZoneId.of("America/Chicago"));
        System.out.println("localDateTimeChicago1 -> " + localDateTimeChicago1);


    }
}
