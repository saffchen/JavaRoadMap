package jrm;

public class App {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10};
        int integer = min(arr);
        // на консоли ожидаем число 1, так как цифра 1 является минимальной в наборе
        System.out.println(integer);
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr){
           if(i < min){
               min = i;
           }
        }
        return min;
    }
}