package com.diliprathore.java.lambdas;

import com.diliprathore.java.optional.Bike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {

    /**
     * Total of 6 students in the database.
     * @return
     */

    public static Supplier<Student> studentSupplier = () -> {
        Bike bike = new Bike();
        bike.setModel("CBR 600 RR");
        bike.setName("Honda");
        Student student = new Student("Adam",2,3.6, "male",
                Arrays.asList("swimming", "basketball","volleyball"));
        student.setBike(Optional.ofNullable(bike));
        return student;
    };


    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"), 10);
        Student student2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"), 9);
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"), 15);
        Student student4 = new Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"),14);
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"), 8);
        Student student6 = new Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"), 13);

        List<Student> students = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5,student6));
        return students;
    }
}
