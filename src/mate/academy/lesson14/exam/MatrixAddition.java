package mate.academy.lesson14.exam;

import java.util.Arrays;

public class MatrixAddition {

    /**
     * Напишіть функцію, яка приймає дві квадратні матриці (N x N - двовимірні масиви)
     * і поверніть суму двох. Обидві матриці, що передаються у функцію,
     * матимуть розмір N x N (квадрат), містять лише цілі числа.
     * <p>
     * Як скласти дві матриці:
     * <p>
     * Візьміть кожну комірку [n] [m] з першої матриці і додайте її з тією ж клітиною [n] [m]
     * з другої матриці. Це буде комірка [n] [m] матриці розчину.
     * <p>
     * Для прикладу:
     * |1 2 3|     |2 2 1|     |1+2 2+2 3+1|     |3 4 4|
     * |3 2 1|  +  |3 2 3|  =  |3+3 2+2 1+3|  =  |6 4 4|
     * |1 1 1|     |1 1 3|     |1+1 1+1 1+3|     |2 2 4|
     *
     * @param first first array with size [n] x [m]
     * @param second second array with size [n] x [m]
     * @return the sum of arrays
     */
    public static int[][] addMatrix(int[][] first, int[][] second) {
        //write your code here

        Arrays.sort(first);

        if (first.length == 0) {
            return second;
        }

        if (second.length == 0) {
            return first;
        }

        int[][] result = new int[first.length][first[0].length]; // first[0] - ширина матриці

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        test(addMatrix(new int[][]{}, new int[][]{}), new int[][]{}, "EmptyArrays");
        test(addMatrix(new int[][]{{1}}, new int[][]{{2}}), new int[][]{{3}}, "SingleElementArrays");

        int[][] firstSquare = new int[][]{{1, 2, 3}, {3, 2, 1}, {1, 1, 1}};
        int[][] secondSquare = new int[][]{{2, 2, 1}, {3, 2, 3}, {1, 1, 3}};
        int[][] resultSquare = new int[][]{{3, 4, 4}, {6, 4, 4}, {2, 2, 4}};
        test(addMatrix(firstSquare, secondSquare), resultSquare, "SquareArrays");

        int[][] firstRectangle = new int[][]{{10, 20, 30, -10}, {13, 12, 11, -24}, {0, 0, 0, 0}};
        int[][] secondRectangle = new int[][]{{331, 287, 192, -102}, {3, 2, 3, 23}, {0, 0, 0, -10}};
        int[][] resultRectangle = new int[][]{{341, 307, 222, -112}, {16, 14, 14, -1}, {0, 0, 0, -10}};
        test(addMatrix(firstRectangle, secondRectangle), resultRectangle, "RectangleArrays");
    }

    private static void test(int[][] actual, int[][] expected, String testName) {
        if (!Arrays.deepEquals(actual, expected)) {
            String errorMessage = String.format(
                    "Test %s failed: %s is not equal to expected %s",
                    testName,
                    Arrays.deepToString(actual),
                    Arrays.deepToString(expected));
            System.out.println("ERROR: " + errorMessage);
        } else {
            System.out.println("SUCCESS: " + testName + " passed");
        }
    }
}
