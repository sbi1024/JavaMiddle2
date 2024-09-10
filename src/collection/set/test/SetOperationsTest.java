package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println("union = " + union);

        Set<Integer> intersection = new HashSet<>();
        intersection.addAll(set1);
        intersection.retainAll(set2);
        System.out.println("intersection = " + intersection);

        Set<Integer> diff = new HashSet<>();
        diff.addAll(set1);
        diff.removeAll(set2);
        System.out.println("diff = " + diff);
    }
}
