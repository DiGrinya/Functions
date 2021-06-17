package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {15, 17, 20};

        System.out.println(Task3.multiArithmeticElements(1,2,0));
        System.out.println(Task1.isSorted(arr,SortOrder.ASC));
        System.out.println(Arrays.toString(Task2.transform(arr,SortOrder.DESC)));
        System.out.println(Task41.sumGeometricElements(5,0.9,0));
    }
}
