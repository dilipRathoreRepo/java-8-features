package com.diliprathore.java.optional;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static String getStudentName() {
        Student student = null; //StudentDataBase.studentSupplier.get();
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
//        Optional<Student> studentOptional = Optional.ofNullable(null);
        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
//        Student student = getStudentName();
        Optional<String> student = getStudentNameOptional();

        student.ifPresent(s -> System.out.println(s.length()));
    }
}
