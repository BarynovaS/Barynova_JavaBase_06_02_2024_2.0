package ua.hillel.barynova.lessons.lesson10;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Заповнення першого масиву (числа, які загадані фірмою-організатором лотереї)
        int[] lotteryNumbers = generateRandomNumbers(7);

        // Заповнення другого масиву (числа, які вгадав гравець)
        int[] playerNumbers = generateRandomNumbers(7);

        // Сортування масивів
        Arrays.sort(lotteryNumbers);
        Arrays.sort(playerNumbers);

        // Виведення відсортованих масивів
        System.out.println("Числа лотереї (відсортовані): " + Arrays.toString(lotteryNumbers));
        System.out.println("Числа гравця (відсортовані): " + Arrays.toString(playerNumbers));

        // Знаходження кількості збігів
        int matches = countMatches(lotteryNumbers, playerNumbers);

        // Виведення кількості збігів
        System.out.println("Кількість збігів: " + matches);
    }

    // Метод для генерації масиву випадкових чисел
    private static int[] generateRandomNumbers(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(10); // Генерує випадкове число від 0 до 9
        }
        return numbers;
    }
    // Метод для знаходження кількості збігів між двома масивами
    private static int countMatches(int[] array1, int[] array2) {
        int matches = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                matches++;
            }
        }
        return matches;
    }
}

