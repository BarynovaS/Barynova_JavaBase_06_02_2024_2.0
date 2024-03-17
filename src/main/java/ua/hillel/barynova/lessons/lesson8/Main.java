package ua.hillel.barynova.lessons.lesson8;

public class Main {
    public static void main(String[] args) {
//        int counter = 0;
//        for (int i = 0; ; i++) {
//            if (i / 10 == 4 || i % 10 == 4 || i / 100 == 40 || i % 100 == 40 || i / 10 == 9 || i % 10 == 9 ||
//            i / 100 == 90 || i % 100 == 90){
//                continue;
//
//                    }
//                    if (counter == 100) {
//                        continue;
//                    }
//                    }
//                    counter++;
//
//                   System.out.println(counter + ") " + i );

        int counter = 0;
        int count = 0;
        while (count <= 153) {
            if (containsFourOrNine(count)) {
                count++;
                continue;
            }
            counter++;
            System.out.println( counter + ") " + count);
            count++;}

    }
    private static boolean containsFourOrNine(int number) {
        while (number > 0) {
            int num = number % 10;
            if (num == 4 || num == 9) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}

