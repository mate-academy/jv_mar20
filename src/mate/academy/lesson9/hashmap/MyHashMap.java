package mate.academy.lesson9.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class MyHashMap {
    private Node[] buckets;
    int size = 0;

    // nodes.length = 10;
    // size = 8; // count of elements

    // one bucket has 1_000_000 elements in the LL?

    // HashMap --> O(n) для операції  get() -- O(1);

    // in each bucket - one element - the perfect situation

    private static class Node {
        Object key;
        Object value;
        Node next;
    }

    public void put(Object key, Object value) {
        //check resize?

        int index = key.hashCode() % (buckets.length);
        // key.hashCode() = 21
        // buckets.length = 16
        // index = 21 % 16 = 5

        if (buckets[5] == null) {
            buckets[5] = new Node();
            buckets[5].value = value;
        } else {
            Node cur = buckets[5];
            while (cur.next != null) {
                if (cur.key.equals(key)) { // replace value
                    // break;
                }
            }
            cur.next = new Node();
        }

        // [0]  [1] ... [5] <--- add value into this bucket
    }

    public static void main(String[] args) {
        String string = "   hello  Bodya   ";
        String[] tokens = string.split("\\s+");
        System.out.println(Arrays.toString(tokens));
    }
}
