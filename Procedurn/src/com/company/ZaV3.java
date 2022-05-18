package com.company;

public class ZaV3 {
    public ZaV3() {
    }

    public static void main(String[] args) {
        int src = (int) (Math.random() * 101);
        System.out.println(src);
        if (src >= 0 && src < 10) {
            System.out.println("Кількість чисел - одне");
        } else if (src >= 10 && src < 100) {
            System.out.println("Кількість чисел - два ");
        } else if (src == 100) {
            System.out.println("Кількість чисел - три");
        }
    }
}
