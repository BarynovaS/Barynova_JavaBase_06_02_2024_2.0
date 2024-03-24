package ua.hillel.barynova.lessons.lesson14;

public class TrackerMain {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("John", "Doe", 15, 6, 1998, "john.doe@example.com", "+1234567890", 75.5, 120.0, 8000);
        FitnessTracker user2 = new FitnessTracker("Alice", "Smith", 20, 9, 1987, "alice.smith@example.com", "+1987654321", 65.0, 110.0, 10000);
        FitnessTracker user3 = new FitnessTracker("Emma", "Johnson", 10, 3, 2004, "emma.johnson@example.com", "+1122334455", 60.0, 115.0, 6000);

        System.out.println("====INITIAL USER INFO====");
        System.out.println();
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setLastName("Brown");
        user1.setWeight(73.0);
        user2.setStepsPerDay(12000);

        System.out.println("====UPDATED USER INFO====");
        System.out.println();
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}

