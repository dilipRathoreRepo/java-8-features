package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class StreamMapReduceExample {
    public static Optional<Integer> getTotalBooks(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .map(Student::getNotebooks)
                .reduce(Integer::max);
    }

    public static Optional<Student> findAnyStudent(List<Student> students) {
        return students.stream()
                .filter(student -> student.getName().equals("Emily"))
                .findAny();
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Optional<Integer> result = getTotalBooks(studentList);
        result.ifPresent(System.out::println);

        Optional<Student> match = findAnyStudent(studentList);
        match.ifPresent(System.out::println);
    }
}
