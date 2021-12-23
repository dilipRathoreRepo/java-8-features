package com.diliprathore.java.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime -> " + localDateTime);

        String stringLocalDateTime = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("stringLocalDateTime -> " + stringLocalDateTime);

        /**
         * Custom DateTimeFormatter
         */

        String date = "2021-12-2212|24|33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH|mm|ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse(date, dateTimeFormatter);
        System.out.println("localDateTime1 -> " + localDateTime1);


        String date1 = "2021-12-22abc12|24|33";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(date1, dateTimeFormatter1);
        System.out.println("localDateTime2 -> " + localDateTime2);
    }
}
