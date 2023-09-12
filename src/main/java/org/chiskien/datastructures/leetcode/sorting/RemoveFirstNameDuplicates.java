package org.chiskien.datastructures.leetcode.sorting;

import java.util.Collections;
import java.util.List;

public class RemoveFirstNameDuplicates {

    public static List<Name> eliminateDuplicate(List<Name> nameList) {
        Collections.sort(nameList);
        int result = 0;
        for (int first = 1; first < nameList.size(); first++) {
            if (!nameList.get(first).firstName.equals(nameList.get(result).firstName)) {
                nameList.set(++result, nameList.get(first));
            }
        }
        nameList.subList(++result, nameList.size()).clear();
        return nameList;
    }


    public static class Name implements Comparable<Name> {
        String firstName;
        String lastName;

        @Override
        public int compareTo(Name name) {
            int cmpFirst = firstName.compareTo(name.firstName);
            if (cmpFirst != 0) {
                return cmpFirst;
            }
            return lastName.compareTo(name.lastName);
        }
    }
}
