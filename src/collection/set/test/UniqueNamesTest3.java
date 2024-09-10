package collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>();

        for (Integer input : inputArr) {
            set.add(input);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
