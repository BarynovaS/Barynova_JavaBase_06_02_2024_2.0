package ua.hillel.barynova.lessons.lesson17;
import java.util.Scanner;
public class Main {
    static double totalCost = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        orderDrinks();
        System.out.println("Customer should pay: " + totalCost);
    }

    static void orderDrinks() {
        boolean wantMoreDrinks = true;
        do {
            System.out.println("Choose a drink: ");
            for (DrinksMachine drink : DrinksMachine.values()) {
                System.out.println(drink);
            }
            String choice = scanner.nextLine().toUpperCase();

            if (!isValidChoice(choice)) {
                System.out.println("Invalid choice. Please select a valid drink.");
                continue;
            }

            DrinksMachine selectedDrink = DrinksMachine.valueOf(choice);
            double price = calculatePrice(selectedDrink);
            prepareDrink(selectedDrink);
            totalCost += price;

            System.out.println("Do you want to order another drink? (yes/no): ");
            String answer = scanner.nextLine().toLowerCase();
            wantMoreDrinks = answer.equals("yes");
        } while (wantMoreDrinks);
    }

    static boolean isValidChoice(String choice) {
        for (DrinksMachine drink : DrinksMachine.values()) {
            if (drink.name().equals(choice)) {
                return true;
            }
        }
        return false;
    }

    static double calculatePrice(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                return Drinks.COFFEE;
            case TEA:
                return Drinks.TEA;
            case LEMONADE:
                return Drinks.LEMONADE;
            case MOJITO:
                return Drinks.MOJITO;
            case MINERAL_WATER:
                return Drinks.MINERAL_WATER;
            case COCA_COLA:
                return Drinks.COCA_COLA;
            default:
                return 0;
        }
    }

    static void prepareDrink(DrinksMachine drink) {
        // Implement the logic to prepare each drink here
        System.out.println("Preparing " + drink);
    }
}