package com.diliprathore.java.stream_terminal;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMaxByMinByExample {
    public static void main(String[] args) {
        Optional<Student> highestGpaStudent = StudentDataBase.getAllStudents()
                .stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
        highestGpaStudent.ifPresent(System.out::println);
    }
}
