package ua.hillel.barynova.lessons.lesson14;

import java.util.Calendar;

class FitnessTracker {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String phone;
    private double weight;
    private double pressure;
    private int stepsPerDay;
    private int age;


    //Конструктор
    public FitnessTracker(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone, double weight, double pressure, int stepsPerDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
        this.age = calculateAge();
    }


    // Розрахунок віку користувача
    private int calculateAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yearOfBirth;
    }

    // Метод для виведення інформації про обліковий запис користувача
    public void printAccountInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + pressure);
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println();
    }

//Геттери та сеттери
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getPressure() {
        return pressure;
    }
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    public int getStepsPerDay() {
        return stepsPerDay;
    }
    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }
}
