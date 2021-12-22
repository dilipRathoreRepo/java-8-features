package com.diliprathore.java.defaultstaticmethods;

import com.diliprathore.java.lambdas.Student;
import com.diliprathore.java.lambdas.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {
    static Consumer<Student> studentConsumer = System.out::println;
    static Comparator<Student> studentComparatorByName = Comparator.comparing(Student::getName);
    static Comparator<Student> studentComparatorByGrade = Comparator.comparing(Student::getGradeLevel);
    static Comparator<Student> studentComparatorByNameByGrade = studentComparatorByGrade.thenComparing(studentComparatorByGrade);

    public static void sortWithNullValues(List<Student> studentList){
        Comparator<Student> comparatorForNulls = Comparator.nullsFirst(studentComparatorByNameByGrade);
        studentList.sort(comparatorForNulls);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
//        studentList.forEach(studentConsumer);
//
//        System.out.println("After sorting..\n");
//        studentList.sort(studentComparatorByName);
//        studentList.forEach(studentConsumer);

//        Multiple level sorting
        studentList.sort(studentComparatorByGrade.thenComparing(studentComparatorByName));
        System.out.println("After sorting first at grade and then at name..\n");

        studentList.forEach(studentConsumer);

//         Sorting with Null values
        System.out.println("\nSorting with Null values..");
        studentList.add(null);
        sortWithNullValues(studentList);
    }
}
