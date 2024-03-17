package ua.hillel.barynova.lessons.lesson11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розмірів матриці
        System.out.print("Введіть кількість рядків (M): ");
        int M = 0;
        if (scanner.hasNextInt()) {
            M = scanner.nextInt();
            System.out.println(M);
        }else {
            System.out.println("Не вірно введене значеня. ERROR");
            System.exit(0);
        }
        System.out.print("Введіть кількість стовпців (N): ");
        int N = 0;
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
            System.out.println(N);
        } else {
            System.out.println("Не вірно введені данні. ERROR");
            System.exit(0);
        }
        // Генерація матриці M x N з випадковими значеннями
        int[][] matrix = generateRandomMatrix(M, N);

        // Транспонування матриці
        int[][] transposedMatrix = transposeMatrix(matrix);

        // Виведення результатів
        System.out.println("\nВихідна матриця:");
        printMatrix(matrix);

        System.out.println("\nТранспонована матриця:");
        printMatrix(transposedMatrix);
    }
    // Метод для генерації матриці M x N з випадковими значеннями
    private static int[][] generateRandomMatrix(int M, int N) {
        int[][] matrix = new int[M][N];
        Random random = new Random();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = random.nextInt(100); // Генеруємо випадкове число від 0 до 99
            }
        }
        return matrix;
    }
    // Метод для транспонування матриці
    private static int[][] transposeMatrix(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int[][] transposedMatrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }
    // Метод для виведення матриці на екран
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

