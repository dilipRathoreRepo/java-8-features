package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatmapExample {

    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        List<String> result = studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
//                .collect(Collectors.toList());
//                .count()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
