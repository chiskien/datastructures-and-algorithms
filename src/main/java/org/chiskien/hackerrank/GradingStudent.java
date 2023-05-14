package org.chiskien.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradingStudent {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>(10);
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        System.out.println(gradingStudent(grades));
    }

    public static List<Integer> gradingStudent(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade >= 40) {
                int nextMultipleOfFive = 5 * ((grade / 5) + 1);
                if (nextMultipleOfFive - grade < 3) {
                    result.add(nextMultipleOfFive);
                } else {

                    result.add(grade);
                }
            }
        }
        return result;
    }
}
