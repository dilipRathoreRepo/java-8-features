package com.diliprathore.java.optional;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static void main(String[] args) {
//        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        System.out.println(optionalStudent.map(Student::getName).orElse("Default"));

//        if (optionalStudent.isPresent()) {
//            System.out.println(optionalStudent.get().getName());
//        }
//        System.out.println("Default");
    }
}
