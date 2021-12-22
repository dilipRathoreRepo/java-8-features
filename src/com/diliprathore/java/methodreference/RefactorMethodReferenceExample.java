package com.diliprathore.java.methodreference;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class RefactorMethodReferenceExample {
//    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    static boolean greaterThanGradeLevel(Student student) {
        return student.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
