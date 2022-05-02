package jrm;


public class App {

    public static void main(String[] args) {
        String simpleString = "lol";
        boolean reversedString = isPalindrome(simpleString);
        System.out.println(reversedString);
    }

    // метод должен определять является ли, строка палиндромом
    public static boolean isPalindrome(String word) {
        return new StringBuffer(word).reverse().toString().equals(word);
    }
}
