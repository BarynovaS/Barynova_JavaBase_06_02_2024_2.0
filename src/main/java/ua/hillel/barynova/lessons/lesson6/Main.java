package ua.hillel.barynova.lessons.lesson6;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a team name 1");
            String user1 = scan.next();
            System.out.println("Name team1 :" + user1);

            System.out.println("Points team 1 :");

            int u1 = 10;
            int u2 = 5;
            int u3 = 12;
            int u4 = 24;
            int u5 = 81;

            if (scan.hasNextInt()) {
                u1 = scan.nextInt();
                System.out.println("User1:" + u1);

                if (scan.hasNextInt()) {
                    u2 = scan.nextInt();
                    System.out.println("User2:" + u2);

                    if (scan.hasNextInt()) {
                        u3 = scan.nextInt();
                        System.out.println("User3:" + u3);

                        if (scan.hasNextInt()) {
                            u4 = scan.nextInt();
                            System.out.println("User4:" + u4);

                            if (scan.hasNextInt()) {
                                u5 = scan.nextInt();
                                System.out.println("User5:" + u5);


                                int u6 = 40;
                                int u7 = 4;
                                int u8 = 21;
                                int u9 = 2;
                                int u10 = 16;

                                System.out.println("Please enter a team name 2");
                                String user2 = scan.next();
                                System.out.println("Name team2 :" + user2);

                                System.out.println("Points team 2 :");


                                if (scan.hasNextInt()) {
                                    u6 = scan.nextInt();
                                    System.out.println("User6 :" + u6);

                                    if (scan.hasNextInt()) {
                                        u7 = scan.nextInt();
                                        System.out.println("User7 :" + u7);

                                        if (scan.hasNextInt()) {
                                            u8 = scan.nextInt();
                                            System.out.println("User8 :" + u8);

                                            if (scan.hasNextInt()) {
                                                u9 = scan.nextInt();
                                                System.out.println("User9 :" + u9);

                                                if (scan.hasNextInt()) {
                                                    u10 = scan.nextInt();
                                                    System.out.println("User10 :" + u10);

                                                    // среднее число 1: 26
                                                    // среднее число 2: 17
                                                    int po1 = ((u1 + u2 + u3 + u4 + u5) / 5);
                                                    int po2 = ((u6 + u7 + u8 + u9 + u10) / 5);
                                                    System.out.println( po1);
                                                    System.out.println( po2);





                                                    System.out.println();
                                                    char star ='☆';
                                                    System.out.println(star +"CONGRATULATIONS"+star);








                                                }
                                            }
                                        }
                                    }
                                }


                            }
                        }
                    }
                }
            }

        }


    }

