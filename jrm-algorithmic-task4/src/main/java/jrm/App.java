package jrm;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        int count = 11;
        List<Integer> integers = fibonacci(count);
        // на консоли ожидаем последовательность 1 1 2 3 5 8 13 21 34 55 89
        integers.forEach(System.out::println);
    }

    // доработать метод так,
    // чтобы он возвращал последовательность чисел фибоначи опираясь на аргумент
    public static List<Integer> fibonacci(int count) {
        List<Integer> integers = new ArrayList<>();
        int n0 = 1;
        int n1 = 1;
        int n2;
        integers.add(n0);
        integers.add(n1);
        for (int i = 3; i <= count; i++) {
            integers.add(n2 = n0 + n1);
            n0 = n1;
            n1 = n2;
        }
        return integers;
    }
}