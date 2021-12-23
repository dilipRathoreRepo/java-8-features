package com.diliprathore.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDateToLocalDateExample {
    public static void main(String[] args) {
        /**
         * Java.util.date to LocalDate and vice versa
         */

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("localDate ->" + localDate);

        Date date1 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("date1 -> " + date1);


        /**
         * java.sql.date to LocalDate and vice versa
         */

        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println("java.sql.date -> " + date2);

        LocalDate sqlDateToLocalDate = date2.toLocalDate();
        System.out.println("sqlDateToLocalDate -> "+ sqlDateToLocalDate);

    }
}
