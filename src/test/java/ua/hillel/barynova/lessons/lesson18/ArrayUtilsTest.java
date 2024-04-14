package ua.hillel.barynova.lessons.lesson18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    @Test
    public void testIsSquareMatrix() {
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Assertions.assertTrue(ArrayUtils.isSquareMatrix(squareMatrix));

        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        Assertions.assertFalse(ArrayUtils.isSquareMatrix(nonSquareMatrix));
    }

    @Test
    public void testCalculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        double expectedAverage = 3.0;
        Assertions.assertEquals(expectedAverage, ArrayUtils.calculateAverage(array), 0.001);

        int[] emptyArray = {};
        Assertions.assertEquals(0.0, ArrayUtils.calculateAverage(emptyArray), 0.001);
    }
}