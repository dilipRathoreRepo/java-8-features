package com.diliprathore.java.stream_terminal;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {
    public static void main(String[] args) {
        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNotebooks)));

        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNotebooks) ));
    }
}
