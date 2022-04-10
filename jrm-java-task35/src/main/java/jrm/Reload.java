package jrm;

public class Reload {
    private int a;
    private int b;
    private int c;

    private final String constructorWithOneParam = "Вызван конструктор с одним параметром";
    private final String constructorWithCoupleParams = "Вызван конструктор с двумя параметрами";
    private final String constructorWithThreeParams = "Вызван конструктор с тремя параметрами";

    public Reload(int a) {
        this.a = a;
        System.out.println(constructorWithOneParam);
    }

    public Reload(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(constructorWithCoupleParams);
    }

    public Reload(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(constructorWithThreeParams);
    }
}
