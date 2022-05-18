package com.company;

public class ZaV2 {
    public ZaV2(){
    }
    public static void main(String[] args) {
        int k1 ,k2;
        double c, S, P;
        k1 = 3;
        k2 = 4;
        c = Math.sqrt((k1 * k1) + k2 * k2);
        S = (int) (0.5 * k1 * k2);
        P = k1 + k2 + c;
        System.out.println( "Площа трикутника: " + S);
        System.out.println( "Периметр трикутника: " + P);
    }
}


