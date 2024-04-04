package ua.hillel.barynova.lessons.lesson16;

class Androids implements Smartphones, OperatingSystem {
    @Override
    public void call() {
        System.out.println("Calling from an Android phone");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from an Android phone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet from an Android phone");
    }

    @Override
    public void use() {
        System.out.println("Using Linux OS on an Android phone");
    }
}
