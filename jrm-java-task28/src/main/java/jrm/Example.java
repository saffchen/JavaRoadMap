package jrm;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int tmp = 0;
        int[][] array = new int[3][4];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j ++){
                array[i][j] = tmp;
                tmp++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // В каждую ячейку массива положить число, каждое последующее число должно увеличиваться на единицу
        // Метод должен вывести все значения массива на экран.
        // На экране должна получитсья именна эта матрица из чисел :
        //
        // 1 2 3 4 5
        // 6 7 8 9 10    // не забудте про пробел между цифр
        // 11 12 13 14
    }
}