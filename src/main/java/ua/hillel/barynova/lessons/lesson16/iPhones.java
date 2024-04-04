package ua.hillel.barynova.lessons.lesson16;

class iPhones implements Smartphones, OperatingSystem {
    @Override
    public void call() {
        System.out.println("Calling from an iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from an iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet from an iPhone");
    }

    @Override
    public void use() {
        System.out.println("Using iOS on an iPhone");
    }
}

