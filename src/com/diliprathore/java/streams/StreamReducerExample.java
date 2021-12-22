package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReducerExample {
    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a*b);
    }

    public static Optional<Student> highestGpaStudent(List<Student> studentList) {
        return studentList.stream().reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1: s2);
    }


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integerList1 = new ArrayList<>();
//        System.out.println("performMultiplication -> " + performMultiplication(integerList));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integerList1);
        if (result.isPresent())
            System.out.println("performMultiplicationWithoutIdentity -> " + result.get());
        else
            System.out.println("result is Null");


        Optional<Student> highestGpaStudent = highestGpaStudent(StudentDataBase.getAllStudents());
        highestGpaStudent.ifPresent(student -> System.out.println("Highest GPA student is -> " + student));


    }
}
