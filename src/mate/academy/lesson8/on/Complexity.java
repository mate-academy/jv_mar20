package mate.academy.lesson8.on;

import java.util.ArrayList;
import java.util.List;

public class Complexity {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();


        System.out.println("O(1)");
        int a = 1 + 4;

        // loop has O(n) complexity
        int n = strings.size();
        for (int i = 0; i < n; i++) {  // depends on how much elemnts you have in the array
            System.out.println("Hello");   // 15 ms
            System.out.println("Hello");   // 15 ms
            System.out.println("Hello");   // 15 ms
            System.out.println("Hello");   // 15 ms
            System.out.println("Hello");   // 15 ms
            System.out.println("Hello");   // 15 ms
            System.out.println("Hello");   // 15 ms
            System.out.println("Hello");   // 15 ms
            System.out.println("Hello");   // 15 ms
        }

        // loop has O(n) complexity
        for (int i = 0; i < n; i++) {  // O (n2)
            for (int j = 0; j < n; j++) {
                System.out.println("Hello 2");   // 15 ms
            }
        }
    }

    // 2 * O(n) ... 2 O(n) ---> O(n)

    // how to reach O(n2) ?
}
