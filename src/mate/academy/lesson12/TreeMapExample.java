package mate.academy.lesson12;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("b", 10);
        map.put("b1", 10);
        map.put("b2", 10);
        map.put("b10", 10);
        map.put("a", 20);
        map.put("d", 30);
        map.put("aba", 30);
        map.put("c", 30);

        System.out.println("b " + "b".hashCode() % 16);
        System.out.println("b1 " + "b1".hashCode() % 16);
        System.out.println("b2 " + "b2".hashCode() % 16);
        System.out.println("b10 " + "b10".hashCode() % 16);
        System.out.println("a " + "a".hashCode() % 16);
        System.out.println("d " + "d".hashCode() % 16);
        System.out.println("aba " + "aba".hashCode() % 16);

        System.out.println(map); // what will be printed here? In what order?
     }
}
