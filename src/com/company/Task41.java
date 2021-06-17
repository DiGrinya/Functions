package com.company;

public class Task41 {
    public static double sumGeometricElements(int a1, double t, int alim) {

        double sum = a1;
        double tmp = a1*t;

        if (t>=1|| t <=0|| a1==0|| alim>=a1|| alim<0){
            throw new IllegalArgumentException();
        }


        while (tmp>alim) {

            sum+= tmp;
            tmp = tmp*t;
            if (tmp<0.009) break;
        }

        return Math.round(sum);
    }
}

