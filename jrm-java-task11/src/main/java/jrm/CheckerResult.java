package jrm;

public class CheckerResult {
    public static void main(String[] args) {
        Checker checker = new Checker();
        print(checker.checkIt(5));
        print(checker.checkIt(5.0, 8.0));
    }

    private static void print(int i){
        System.out.println(i);
    }
    private static void print(double i){
        System.out.println(i);
    }
}