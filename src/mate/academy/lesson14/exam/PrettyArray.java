package mate.academy.lesson14.exam;

import java.util.Arrays;
import java.util.Comparator;

import mate.academy.lesson10.Car;

public class PrettyArray {
    /**
     * Гарним масивом вважається такий масив, в якому для кожного елемента n,
     * в масиві також існує n-1 або n+1.
     * Наприклад:
     * [2,10,9,3] красивий масив, бо
     * 2=3-1
     * 10=9+1
     * 3=2+1
     * 9=10-1
     * Напишіть метод isArrayPretty, який повертає true. якщо параметр array є гарним, інакше false.
     * Також, потрібно повернути false, якщо переданий масив порожній.
     *
     * @param array - the array of int numbers
     * @return is array pretty or not
     */
    public static boolean isArrayPretty(int[] array) {
        if (array.length == 0) {
            return false;
        }

        int count = 0;
        for (int item : array) { // 2
            for (int value : array) {
                if ((item == value + 1) || (item == value - 1)) { //find 1 or 3 in the array
                    count++;
                    break;
                }
            }
        }
        return count == array.length;
    }

    public static void main(String[] args) {
        test(isArrayPretty(new int[]{2, 10, 9, 3}), true, "positiveCase1");
        test(isArrayPretty(new int[]{1, 2, 3, 3}), true, "positiveCase2");
        test(isArrayPretty(new int[]{1, 2, 3, 9}), false, "ihor's case");
        test(isArrayPretty(new int[]{2, 100, 9, 3}), false, "negativeCase1");
        test(isArrayPretty(new int[]{4, 4, 4, 4}), false, "negativeCase2");
        test(isArrayPretty(new int[]{}), false, "emptyArrayPassed");
    }

    private static void test(boolean actual, boolean expected, String testName) {
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
