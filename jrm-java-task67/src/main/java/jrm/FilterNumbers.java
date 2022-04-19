package jrm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterNumbers {
    public static void main(String[] args) {
        List<Integer> notFilteringArray = Arrays.asList(0, 3, -2, 3, -100, 6, -5);
        System.out.println(filterNegativeNumbers(notFilteringArray)); // должен распечатать только отрицательные числа
        System.out.println(Arrays.toString(filterPositiveNumbers(notFilteringArray)));// должен распечатать только положительные
    }

    private static List<Integer> filterNegativeNumbers(List<Integer> numbers) {
        List <Integer> newList = new ArrayList<>();
        for (int num : numbers){
            if (num < 0){
                newList.add(num);
            }
        }
        return newList;
    }

    private static Integer[] filterPositiveNumbers(List<Integer> numbers) {
        Integer[] newArray = new Integer[3];
        int pos = 0;
        for (int num : numbers){
            if (num > 0){
                newArray[pos] = num;
                pos++;
            }
        }
        return newArray;
    }
}
