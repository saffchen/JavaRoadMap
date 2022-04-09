package jrm;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] array = {13, 1, 1, 3, 4, 10, 12};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = array.length-2; i < array.length; i++){
            System.out.println(array[i]);
        }
        // найти два максимальных числа в массиве без использования сортировки
    }
}
