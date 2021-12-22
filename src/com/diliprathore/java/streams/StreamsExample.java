package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Map<String, List<String>> map = studentList.stream()
                        .collect(Collectors.toMap(student -> student.getName(), student -> student.getActivities()));
        System.out.println("Map map is -> " + map);
    }
}
