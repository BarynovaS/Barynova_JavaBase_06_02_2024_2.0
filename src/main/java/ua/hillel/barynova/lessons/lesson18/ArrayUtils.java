package ua.hillel.barynova.lessons.lesson18;
public class ArrayUtils {

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rows) {
                return false;
            }
        }
        return true;
    }
}