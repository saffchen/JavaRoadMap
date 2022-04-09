package jrm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] notSorted = {100, 24, 456, 1, 4, 6, 7, 10};
        sort(notSorted);
    }

    public static void sort(int[] arr) {
        boolean isSorted =false;
        int tmp;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]) {
                    isSorted = false;
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}