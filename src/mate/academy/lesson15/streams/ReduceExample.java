package mate.academy.lesson15.streams;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> ages = List.of(25, 30, 45, 28, 32);
        int computedAges = ages.stream().reduce((a, b) -> a + b).orElse(0);
    }
}
