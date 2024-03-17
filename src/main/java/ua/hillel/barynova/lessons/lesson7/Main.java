package ua.hillel.barynova.lessons.lesson7;

import java.util.Scanner;


public class Main {

        public static void main(String[] args) {
            Scanner scan2 = new Scanner(System.in);
            int UnknownNumber, UserNumber, TrysCount = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("ЗАДАЧА: Вгадай число (від 0 до 10).");
            UnknownNumber = (int)Math.floor(Math.random() * 10);
            do {
                TrysCount++;
                System.out.print("Введіть ваше число: ");
                UserNumber = input.nextInt();
                if (UserNumber > UnknownNumber)
                    System.out.println("Моє число менше).");
                else if (UserNumber < UnknownNumber) System.out.println("Моє число більше)).");
                else System.out.println("Ви вгадали");
            } while (UserNumber != UnknownNumber);
            System.out.println("Кількість спроб: " + TrysCount);
        }
    }


