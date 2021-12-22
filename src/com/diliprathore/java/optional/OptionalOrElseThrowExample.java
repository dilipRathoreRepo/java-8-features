package com.diliprathore.java.optional;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseThrowExample {
    public static void main(String[] args) {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName)
                .orElseThrow(() -> new RuntimeException("No Data Available"));
        System.out.println(name);
    }
}
