package com.diliprathore.java;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> consumer1 = student -> System.out.println(student.getName());
    static Consumer<Student> consumer2 = student -> System.out.println(student.getActivities());

    static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println("name -> " + name
            + ", activities -> " + activities);


    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
//        studentList.forEach((student -> {if (student.getGradeLevel() >=3) {
//        consumer1.andThen(consumer2).accept(student);}

        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));

    }
}