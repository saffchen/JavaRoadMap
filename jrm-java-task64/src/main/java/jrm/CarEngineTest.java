package jrm;

public class CarEngineTest {

    public static void main(String... args) {
        passed(new BMW());
        passed(new Mercedes());
    }

    public static void passed(TypeAcceptable<EngineType> carType) {
        if (carType.accept(EngineType.PETROL)){
            System.out.println("Passed: " + carType.getClass().getSimpleName());
        }
    }
}
