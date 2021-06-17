package com.company;

public class Task2 {

    public static int[] transform(int[] array, SortOrder order) {
        int[] arrT = array.clone();

        if(order==SortOrder.ASC&&Task1.isSorted(arrT,SortOrder.ASC)||order==SortOrder.DESC&&Task1.isSorted(arrT,SortOrder.DESC)) {

            for (int i = 0; i < arrT.length; i++) {
                arrT[i] += i;
            }
            return arrT;

        }
        return array;
    }
}

   /* private Task2(){
    }

    public static int[] transform(int[] array, SortOrder order) {

        int[] arrT = array.clone();

        if(order==SortOrder.ASC&&Task1.isSorted(arrT,SortOrder.ASC)) {

            for (int i = 0; i < arrT.length; i++) {
                arrT[i] += i;
            }
            return arrT;
        } else if (order==SortOrder.DESC&&Task1.isSorted(arrT,SortOrder.DESC)) {

            for (int i = 0; i < arrT.length; i++) {
                arrT[i] += i;
            }
            return arrT;
        }

        return array;
    }
}
*/