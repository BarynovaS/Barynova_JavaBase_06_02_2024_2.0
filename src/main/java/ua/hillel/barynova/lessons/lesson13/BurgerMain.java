package ua.hillel.barynova.lessons.lesson13;

public  class BurgerMain {
    public static void main(String[] args) {
        System.out.println("BURGERS");
        System.out.println("==========================");
        System.out.println("Normal Burger");
        Burger normalBurger = new Burger(true, true,true,true,true,false);
        System.out.println("Diet Burger");
        Burger dietBurger = new Burger(true,true,true,true,false,false);
        System.out.println("Doul Meat Burger");
        Burger doublMeatBurger = new Burger(true,true,true,true,true,true);
    }
}