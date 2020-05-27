package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> students = new ArrayList<>();
        int[] assessStud1 = new int[]{1, 2, 3, 4, 5};
        Student student1 = new Student("stud1", assessStud1);
        students.add(student1);
        int[] assessStud2 = new int[]{2, 2, 3, 3, 5};
        Student student2 = new Student("stud2", assessStud2);
        students.add(student2);
        int[] assessStud3 = new int[]{1, 5, 5, 5, 5};
        Student student3 = new Student("stud3", assessStud3);
        students.add(student3);
        int[] assessStud4 = new int[]{1, 1, 3, 3, 4};
        Student student4 = new Student("stud4", assessStud4);
        students.add(student4);
        int[] assessStud5 = new int[]{4, 4, 3, 4, 4};
        Student student5 = new Student("stud5", assessStud5);
        students.add(student5);

        students.stream()
                .forEach(System.out::println);

        double sum1 = students.stream().map(x -> x.getAssessments())
                .flatMapToInt(Arrays::stream)
                .reduce(0, (x, y) -> x + y);
        double countStudent = students.stream().map(x -> x.getAssessments())
                .flatMapToInt(Arrays::stream).count();
        double sum = sum1 / countStudent;
        System.out.println("Средний бал по всем студентам = " + sum);

    }
}
