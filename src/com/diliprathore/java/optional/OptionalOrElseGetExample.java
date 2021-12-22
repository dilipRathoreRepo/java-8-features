package com.diliprathore.java.optional;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseGetExample {
    public static void main(String[] args) {
        Optional<Student> studentOptional = Optional.ofNullable(null);
        System.out.println(studentOptional.map(Student::getName).orElseGet(() -> "Default Value")); // similar to 'orElse' method except that it accepts Supplier (i.e. lambda function)
    }
}
