package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingWithMaxByExample {
    // student with max Gpa under each grade level

    public static void example1() {
        Map<Integer, Student> result = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Student::getGpa)),
                                Optional::get)));  // This 'collectingAndThen' will wrap Optional

        System.out.println(result);

//        for(Map.Entry<Integer, Optional<Student>> element: result.entrySet()) {
//            element.getValue().ifPresent(System.out::println);
//        }

    }


    public static void main(String[] args) {
        example1();
    }
}
