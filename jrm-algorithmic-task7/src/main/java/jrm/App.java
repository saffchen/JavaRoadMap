package jrm;

public class App {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10};
        int integer = max(arr);
        // на консоли ожидаем число 10, так как цифра 10 является максимальным в наборе
        System.out.println(integer);
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
}