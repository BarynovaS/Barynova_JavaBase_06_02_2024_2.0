package ua.hillel.barynova.lessons.lesson13;

class Burger {
    boolean bun;
    boolean meat;
    boolean cheese;
    boolean veggies;
    boolean mayo;
    boolean twomeat;

    Burger(boolean bun, boolean meat, boolean cheese, boolean veggies, boolean mayo, boolean twomeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        this.twomeat = twomeat;
        printBurger();
    }

    void printBurger() {
        System.out.println("Склад бургера:");
        System.out.println("Булочка: " + (bun ? "Є" : "Немає"));
        System.out.println("М'ясо: " + (meat ? "Є" : "Немає"));
        System.out.println("Сир: " + (cheese ? "Є" : "Немає"));
        System.out.println("Зелень: " + (veggies ? "Є" : "Немає"));
        System.out.println("Майонез: " + (mayo ? "Є" : "Немає"));
        System.out.println("Подвійне М'ясо: " +(twomeat ? "Є" : "Немає"));
        System.out.println();
    }
}
