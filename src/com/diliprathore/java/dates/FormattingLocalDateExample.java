package com.diliprathore.java.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {
    public static void parseLocalDate(){
        String date = "2021-12-22";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate -> " + localDate);

//        or

        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE); // explicitly specifying formatter
        System.out.println("localDate1 -> " + localDate1);

        /**
         * Custom Date Format
         */
        String date1 = "2021|12|22";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate2 = LocalDate.parse(date1, dateTimeFormatter);
        System.out.println("localDate2 -> " + localDate2);
    }

    public static void formatLocalDate(){
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        String date = localDate.format(dateTimeFormatter);
        System.out.println("Date in String format -> " + date);
    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
