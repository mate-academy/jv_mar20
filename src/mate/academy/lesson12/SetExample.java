package mate.academy.lesson12;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        String nullValue = null;
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add(nullValue);

        System.out.println(set);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add(nullValue);
        System.out.println(treeSet);

        boolean contains = set.contains("Hello");
    }
}
