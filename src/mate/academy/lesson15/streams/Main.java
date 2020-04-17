package mate.academy.lesson15.streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("abc", "cde", "hello world");
        int sum = 0;
        for (int i = 0; i < strings.size(); i++) {
            sum = sum + strings.get(i).length();
        }
        System.out.println(sum);

        int streamSum = strings.stream() // strings = list of String
                .mapToInt(s -> s.length()) // stringList convert to list of int
                .sum();
        System.out.println(streamSum);

    }
}
