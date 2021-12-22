package com.diliprathore.java.optional;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.Optional;

public class OptionalFilterMapFlatmapExample {
    public static void main(String[] args) {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.filter(s -> s.getGpa() >= 3.8).ifPresent(System.out::println);

        Optional<Student> studentOptional1 = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> bikeName = studentOptional1.flatMap(Student::getBike).map(Bike::getName);  /* use flatmap when
        you need to retrieve an Optional object which is part of another optional object*/

        bikeName.ifPresent(System.out::println);
    }
}
