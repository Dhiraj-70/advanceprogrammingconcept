package dev.dhiraj.advanceprogrammingconcept.comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Roshan", 22, 55),
                new Student("Mohan", 1, 593),
                new Student("Amit", 222, 33),
                new Student("Sunil", 2421, 563),
                new Student("Rohan", 21, 5344),
                new Student("Guru", 12, 538),
                new Student("Arun", 563, 880)
        );
        System.out.println("Sorted based on Marks");
        Comparator<Student> marksComp = (std1, std2) -> std1.marks - std2.marks;
        Collections.sort(studentList, marksComp);
        System.out.println(studentList.toString());

        System.out.println("Sorted based on RollNumber in descending order");
        Comparator<Student> rollNum = (std1, std2) -> std2.rollNumber - std1.rollNumber;
        Collections.sort(studentList, rollNum);
        System.out.println(studentList.toString());
    }
}
