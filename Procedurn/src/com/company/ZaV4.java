package com.company;

import java.util.Scanner;

public class ZaV4 {
    public ZaV4() {
    }

    public static void main(String[] args) {
        int sprob = 2;
        int n = 0;
        int komp = 0;
        int player, player2, player3;
        int[] array = new int[3];
        for (; komp < array.length; komp++) {
            array[komp] = (int) (Math.random() * 3) + 1;
            System.out.println("Компютер загадав таке число: " + array[komp] );
        }
        while (n != 2) {
            n++;
            Scanner src = new Scanner(System.in);
            System.out.println("Комп'ютер загадав три числа з проміжку [0;3], спробуй вгадати послідовність за " + sprob + " спроби");
            System.out.print("Введіть перше число: ");
            if (src.hasNextInt()) {
                player = src.nextInt();
                System.out.print("Введіть друге число: ");
                if (src.hasNextInt()) {
                    player2 = src.nextInt();
                    System.out.print("Введіть третє число: ");
                    if (src.hasNextInt()) {
                        player3 = src.nextInt();
                        if (player == array[0] && player2 == array[1] && player3 == array[2]) {
                            System.out.println("Ураа!Ви вгадали,виграш $5000-ваш)");
                            break;
                        } else {
                            System.out.println("Не вгадали,повезе наступного разу : " +  "Лишилась " + (--sprob) + "  спроба");
                        }

                    }
                }
            }
        }
    }
}
