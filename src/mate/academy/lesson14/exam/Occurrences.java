package mate.academy.lesson14.exam;

import java.util.Arrays;

public class Occurrences {
    /**
     * Реалізуйте метод countOccurrences:
     * <p>
     * Реалізуйте метод, який приймає 2 параметри (`str`, `substr`) і повертає
     * кількість разів, що `subst` з'являється у `str`.
     * <p>
     * напр. для str = 'azyxxzyzy', substr = 'zy' метод повинен повернути 3, бо 'zy'
     * з'являється 3 рази: 'a[zy]xx[zy][zy]'.
     * <p>
     * str і substr містять тільки латинські літери нижнього регістру.
     * Літери в substr не повторюються (substr не може бути рівним xyx)
     * <p>
     * countOccurrences('azyxxzyzy', 'zy') == 3
     * countOccurrences('ababagalamaga', 'ba') == 2
     *
     * @param str    - source string
     * @param substr - substring to be found in the source string
     * @return number of occurrences
     */
    public static int countOccurrences(String str, String substr) {
        // write your code here
        String withoutSubString = str.replaceAll(substr, ""); // azyxxzyzy --> axx
        return (str.length() - withoutSubString.length()) / substr.length(); // azyxxzyzy.length - axx.length / zy.length = 3
    }

//    public static int countOccurrences(String str, String substr) {
//        int counter = 0;
//        int indexOf = str.indexOf(substr);
//
//        while (indexOf != -1) {
//            indexOf = str.indexOf(substr, substr.length() + indexOf + 1); // // azyxxzyzy --> indexOf = 1
//            counter++;
//        }
//
//        return counter;
//    }

//    public static int countOccurrences(String str, String substr) {
//        return str.split(substr, -1).length-1;
//    }

    public static void main(String[] args) {
        test(countOccurrences("abcdefg", "z"), 0, "noOccurrence");
        test(countOccurrences("aaaaaaaab", "aa"), 4, "4 aa");
        test(countOccurrences("abcdefgz", "z"), 1, "noOccurrence");
        test(countOccurrences("abcdefg", "a"), 1, "oneOccurrence");
        test(countOccurrences("azyxxzyzy", "zy"), 3, "usualCase");
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
