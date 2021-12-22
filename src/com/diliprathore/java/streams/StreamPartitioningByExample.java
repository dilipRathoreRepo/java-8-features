package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartitioningByExample {
    static Predicate<Student> p = student -> student.getGpa() >= 3.8;

    public static void main(String[] args) {
        Map<Boolean, List<Student>> result = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(p));

//        System.out.println(result);

        for(Map.Entry<Boolean, List<Student>> entry: result.entrySet()) {
            System.out.println("Key -> " + entry.getKey() + ", value -> " + entry.getValue());
        }

        System.out.println("With downstream version..");

        Map<Boolean, Set<Student>> result1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(p, Collectors.toSet()));

        System.out.println(result1);

    }
}
