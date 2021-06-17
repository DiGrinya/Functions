package com.company;

import java.util.Arrays;

public class Task1 {

    private Task1(){
    }

    public static boolean isSorted(int[] array, SortOrder order) {

        if ((array == null || array.length == 0)){
            throw new IllegalArgumentException();
        }

        int[] arrT = array.clone();
        int temp = 0;
        if(order==SortOrder.ASC) {
            Arrays.sort(arrT);

        } else
            for (int i = 0; i < arrT.length; i++) {
            for (int j = i+1; j < arrT.length; j++) {
                if(arrT[i] < arrT[j]) {
                    temp = arrT[i];
                    arrT[i] = arrT[j];
                    arrT[j] = temp;
                }
            }
        }
        return (Arrays.equals(arrT,array));

    }

}
