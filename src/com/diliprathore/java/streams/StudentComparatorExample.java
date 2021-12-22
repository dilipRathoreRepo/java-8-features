package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StudentComparatorExample {
    public static void main(String[] args) {
        List<String> studentNames = StudentDataBase.getAllStudents()
                .stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(studentNames);
    }
}
