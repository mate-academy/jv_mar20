package mate.academy.lesson14.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapUsage {
    /**
     * Обчислити суму чисел в хеш мапі де ключ буде містити keyPart
     *
     * Наприклад:
     * Якщо keyPart = "hello", а хеш мапа має наступний вміст
     * data.put("myhelloworld", 4);
     * data.put("Hello", 7);
     * data.put("AwesomeString", 8);
     * data.put("Wow!!!! HELLO", 9);
     *
     * результатом виконання методу буде 4 + 7 + 9 = 20
     *
     * Якщо мапа пуста - повернути 0
     * Якщо строка пуста - повернути суму всіх Integer
     *
     * @param data    - HashMap with some data
     * @param keyPart - a string you need to check that a key contains it or not
     * @return
     */
    public static int calculateSum(Map<String, Integer> data, String keyPart) {
         // write your code here

        // find where keyPart is present in the key
        int result = 0;
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (entry.getKey().toLowerCase().contains(keyPart.toLowerCase())) {
                result = result + entry.getValue();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        test(calculateSum(new HashMap<>(), ""), 0, "emptyHashMap");
        test(calculateSum(Map.of(
                "myhelloworld", 4,
                "Hello", 7,
                "AwesomeString", 8,
                "Wow!!!! HELLO", 9), ""), 28, "emptyKeyPart");
        test(calculateSum(Map.of(
                "myhelloworld", 4,
                "Hello", 7,
                "AwesomeString", 8,
                "Wow!!!! HELLO", 9), "hello"), 20, "usualCase");
    }

    private static void test(int actual, int expected, String testName) {
        if (actual != expected) {
            String errorMessage = String.format(
                    "Test %s failed: %s is not equal to expected %s",
                    testName,
                    actual,
                    expected);
            System.out.println("ERROR: " + errorMessage);
        } else {
            System.out.println("SUCCESS: " + testName + " passed");
        }
    }
}
