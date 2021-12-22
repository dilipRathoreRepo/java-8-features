package com.diliprathore.java.lambdas;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateStudentExample {
    public static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    public static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (p1.and(p2).test(student)) {
                System.out.println(student);
            }
        });

//        System.out.println("Approach using filter");
//        studentList.stream().filter(p1).collect(Collectors.toList()).forEach(System.out::println);
    }
}
