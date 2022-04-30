package jrm;


public class App {

    public static void main(String[] args) {
        String revertMe = "987654321";
        String reversedString = reverse(revertMe);
        System.out.println(reversedString);
    }

    //перепишите метод так, чтобы он разворачивал строку
    // например 987654321 --> 123456789
    public static String reverse(String revertMe) {
       return new StringBuilder(revertMe).reverse().toString();
    }
}
