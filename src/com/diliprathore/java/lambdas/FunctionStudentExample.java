package com.diliprathore.java.lambdas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> function = students -> {
        Map<String, Double> map = new HashMap<>();
        students.forEach(student -> {
            if (student.getGradeLevel() >= 3) {
                map.put(student.getName(), student.getGpa());
            }
        });
        return map;
    };


    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(function.apply(studentList));
    }
}
