package com.diliprathore.java.lambdas;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    public static void main(String[] args) {
        PredicateAndConsumerExample predicateAndConsumerExample = new PredicateAndConsumerExample();
        predicateAndConsumerExample.printNameAndActivities();
    }

    private Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    private Predicate<Student> p2 = student -> student.getGpa() >= 3.9;
    private BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    private BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
        System.out.println("name -> " + name + ", activities -> " + activities);
    };

    private Consumer<Student> c1 = student -> {
//        if (p1.and(p2).test(student)) {
//            biConsumer.accept(student.getName(), student.getActivities());
//        }
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
    }
}
