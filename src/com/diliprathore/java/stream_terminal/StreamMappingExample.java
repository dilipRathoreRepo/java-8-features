package com.diliprathore.java.stream_terminal;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingExample {
    public static void main(String[] args) {
        List<String> names = StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println(names);
    }
}
