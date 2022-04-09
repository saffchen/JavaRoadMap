package jrm;

public class Example {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 4, 10, 12};
        for (int value : array){
            if (value %2 == 0) {
                System.out.println(value);
            }
        }
    }

}
