package ua.hillel.barynova.lessons.lesson12;

class Person {
    public static String personInfo(String firstName, String lastName, String city, String phoneNumber) {
        return "Зателефонувати громадянинові " + firstName + " " + lastName + " з міста " + city + " можна за номером " + phoneNumber + ".";
    }
}
public class Main {
    public static void main(String[] args) {
        String person1Info = Person.personInfo("Will", "Smith", "New York", "2936729462846");
        String person2Info = Person.personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        String person3Info = Person.personInfo("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(person1Info);
        System.out.println(person2Info);
        System.out.println(person3Info);
    }
}


// VARIANT 2//

// class Person {
//    String firstName;
//    String lastName;
//    String city;
//    String phone;
//    public Person(String firstName, String lastName, String city, String phone) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.city = city;
//        this.phone = phone;
//    }
//    public String personInfo() {
//        return "Зателефонувати громадянинові " + firstName + " " + lastName + " з міста " + city + " можна за номером " + phone + ".";
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        // Виклики методу personInfo
//        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
//        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
//        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");
//
//        System.out.println(person1.personInfo());
//        System.out.println(person2.personInfo());
//        System.out.println(person3.personInfo());
//    }
//}
