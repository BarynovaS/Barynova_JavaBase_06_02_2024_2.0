package ua.hillel.barynova.lessons.lesson5;

public class Main {
        public static void main(String[] args) {
            System.out.println();
//       Лі
//        воїн - 13
//        лучник - 24
//        вершник - 46

//        Мінь:
//        воїн - 9
//        лучник - 35
//        вершник - 12


//        Розрахувати: загальний показник атаки для обох династій, якщо відомо,
//                що воїнів династії Лі кожного типу було 860,
//                а кількість воїнів династії Мінь кожного типу в півтора рази більша.



            int livoin = 13; //11 180
            int liluc = 24;//20 640   (71 380)
            int liver = 46;//39 560

            int attack = 860;
            double numLI = livoin * attack + liluc * attack + liver * attack;
            System.out.println("LI DYNASTY:"+" "+numLI);
            System.out.println();
            int m1 = 9; // 7 740 (11 610)
            int m2 = 35;// 30 100 (45 150)  72 240
            int m3 = 12;// 10 320 (15 480)
            double Min = (m1 + m2 + m3) * attack * 1.5;
            System.out.println("MIN DYNASTY:"+" "+Min);
            System.out.println();
            double limi = numLI + Min;// 143 620
            System.out.println("SUM OF TWO:"+" "+limi);




      }
    }


