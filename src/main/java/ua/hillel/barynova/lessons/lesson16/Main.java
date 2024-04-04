package ua.hillel.barynova.lessons.lesson16;

public class Main {
    public static void main(String[] args) {

        Androids androidPhone = new Androids();
        iPhones iPhone = new iPhones();


        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.use(); // Використання Linux OS


        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.use(); // Використання iOS
    }
}
