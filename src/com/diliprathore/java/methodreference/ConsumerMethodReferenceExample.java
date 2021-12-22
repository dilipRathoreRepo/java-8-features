package com.diliprathore.java.methodreference;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerMethodReferenceExample {
    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;
    static BiPredicate<Integer, Double> p3 = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    public static void main(String[] args) {
        Supplier<List<Student>> listSupplier = StudentDataBase::getAllStudents;
        listSupplier.get().forEach(student -> {
//            if (p1.and(p2).test(student)) {
//                System.out.println(student);
//            }
            if (p3.test(student.getGradeLevel(), student.getGpa())) {
                System.out.println(student);
            }
        });
    }
}
