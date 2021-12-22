package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingWithThreeArgumentsVersion {
    public static void exampleWithThreeArgs() {
        LinkedHashMap<Integer, Set<Student>> linkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, LinkedHashMap::new, Collectors.toSet()));

        System.out.println(linkedHashMap);
    }

    public static void main(String[] args) {
        exampleWithThreeArgs();
    }
}
