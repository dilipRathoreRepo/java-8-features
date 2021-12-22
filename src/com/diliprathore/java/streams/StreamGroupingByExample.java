package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupingByExample {
    public static void main(String[] args) {
        Map<Integer, List<Student>> gradeLevelTotal =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel));

//        System.out.println(gradeLevelTotal);

        Map<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, List<Student>> entry: gradeLevelTotal.entrySet()) {
//            System.out.println("key -> " + entry.getKey() + ", value -> "+ entry.getValue());
            result.put(entry.getKey(), entry.getValue()
                    .stream()
                    .map(Student::getNotebooks)
                    .collect(Collectors.summingInt(Integer::intValue)));
        }

        System.out.println(result);
    }
}
