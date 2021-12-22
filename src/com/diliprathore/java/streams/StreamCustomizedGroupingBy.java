package com.diliprathore.java.streams;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCustomizedGroupingBy {
    public static void main(String[] args) {
        Map<String, List<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8? "OUTSTANDING": "AVERAGE"));

        System.out.println(map);
    }
}
