package mate.academy.lesson14.exam;

import java.util.Arrays;

public class Digits {
    /**
     * Реалізуйте метод toArrayOfDigits:
     * <p>
     * Метод приймає ціле число n і
     * повертає масив з його цифрами в зворотньому порядку
     * <p>
     * напр. для n = 46156 повинна повернути [6, 5, 1, 6, 4]. Елементи масиву
     * повинні бути числами.
     *
     * @param n - any int number
     * @return int[]
     */

//    public static int[] toArrayOfDigits(int n) {
//        // write your code here
//        n = Math.abs(n); //remove minus
//        String[] stringNumbers = String.valueOf(n).split("");
//        char[] chars = String.valueOf(n).toCharArray();
//
//        int[] result = new int[stringNumbers.length];
//        for (int i = 0; i < stringNumbers.length; i++) {
//            result[stringNumbers.length - i - 1] = Integer.parseInt(stringNumbers[i]);
//        }
//        return result;
//    }

    public static int[] toArrayOfDigits(int n) {
        // write your code here
        n = Math.abs(n); //remove minus
        int[] result = new int[String.valueOf(n).length()];

        int i = 0;
        while (n != 0) {
            result[i] = n % 10; // 46156 % 10 = 6
            n = n / 10;         // n = 46156 / 10 = 4615
            i++;
        }

        return result;
    }


    public static void main(String[] args) {
        test(toArrayOfDigits(5), new int[]{5}, "singleElement");
        test(toArrayOfDigits(98), new int[]{8, 9}, "twoElements");
        test(toArrayOfDigits(46156), new int[]{6, 5, 1, 6, 4}, "usualCase");
        test(toArrayOfDigits(-100), new int[]{0, 0, 1}, "negativeInteger");
    }

    private static void test(int[] actual, int[] expected, String testName) {
        if (!Arrays.equals(actual, expected)) {
            String errorMessage = String.format(
                    "Test %s failed: %s is not equal to expected %s",
                    testName,
                    Arrays.toString(actual),
                    Arrays.toString(expected));
            System.out.println("ERROR: " + errorMessage);
        } else {
            System.out.println("SUCCESS: " + testName + " passed");
        }
    }
}
