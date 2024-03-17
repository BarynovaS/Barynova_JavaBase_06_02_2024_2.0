package ua.hillel.barynova.lessons.lesson9;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (((Math.random() * 19) + 21));
            array[i] = random;
        }
        System.out.println("Team1 :");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + ".");
            } else {
                System.out.print(array[i] + ", ");


            }
        }

        int[] array1 = new int[25];
        for (int j = 0; j < array1.length; j++) {
            int random = (int) ((Math.random() * 19) + 21);
            array1[j] = random;
        }
        System.out.println();
        System.out.println("Team2 :");

        for (int j = 0; j < array1.length; j++) {
            if (j == array1.length - 1) {
                System.out.print(array1[j] + ".");
            }else {
                System.out.print(array1[j] + ", ");
            }
        }

        System.out.println();
        System.out.println();

        int TeamOne = 0;
        for (int i = 0; i < array.length; i++) {
            TeamOne += array[i];

        }
        System.out.println("Sum TeamOne: " + TeamOne / 25.0);

        System.out.println();

        int TeamTwo = 0;
        for (int j = 0; j < array1.length; j++) {
            TeamTwo += array1[j];

        }
        System.out.println("Sum TeamTwo: " + TeamTwo / 25.0);
    }
}





