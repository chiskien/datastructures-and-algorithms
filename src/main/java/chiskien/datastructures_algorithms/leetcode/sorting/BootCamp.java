package chiskien.datastructures_algorithms.leetcode.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BootCamp {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("CK", 12.2));
        students.add(new Student("ASDAS", 155.2));
        students.add(new Student("SDDSG", 2222.0));
        BootCamp b = new BootCamp();
        b.sortByGPA(students);
        System.out.println(students);
    }

    private void sortByGPA(List<Student> studentCollections) {
        studentCollections.sort(((o1, o2) -> Double.compare(o2.gradePointAverage, o1.gradePointAverage)));
    }

    private void sortByName(List<Student> students) {
        Collections.sort(students);
    }
}

class Student implements Comparable<Student> {
    public String name;
    public Double gradePointAverage;

    public Student(String name, Double gradePointAverage) {
        this.name = name;
        this.gradePointAverage = gradePointAverage;
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.compareTo(o.name) == 0) {
            return Double.compare(this.gradePointAverage, o.gradePointAverage);
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradePointAverage=" + gradePointAverage +
                '}';
    }
}

