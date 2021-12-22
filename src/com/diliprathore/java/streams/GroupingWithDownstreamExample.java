package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingWithDownstreamExample {
    public static void example1() {
        Map<Integer, Map<String, List<Student>>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8? "Outstanding": "Average")));
        System.out.println(map);
    }

    public static void example2() {
        Map<Integer, Integer> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getNotebooks)));
        System.out.println(map);
    }

    public static void main(String[] args) {
        example1();
        System.out.println("*****");
        example2();
    }
}
