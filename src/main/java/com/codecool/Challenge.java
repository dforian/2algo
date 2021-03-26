package com.codecool;

public class Challenge {

    public static int minPositive(int a, int b) {

        if (a > 0 && b > 0) {
            return Math.min(a, b);
        }
        if (a <= 0 && b > 0){
            return b;
        }
        if (a > 0 && b <= 0){
            return a;
        }


        return -1;
    }
}
