package com.company;

public class Task3 {

    private Task3(){
    }

    public static int multiArithmeticElements(int a1, int t, int n) {

        if (n<=0){
            throw new IllegalArgumentException();
        }

        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *=a1;
            a1 += t;
        }
        return sum;
    }
}
