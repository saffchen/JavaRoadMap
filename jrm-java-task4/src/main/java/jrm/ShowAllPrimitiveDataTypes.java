package jrm;

public class ShowAllPrimitiveDataTypes {
    public static void main(String[] args) {
        byte testByte = 127;
        short testShort = 32767;
        int testInt = 2147483647;
        long testLong = 9223372036854775807L;
        float testFloat = 1.3f;
        double testDouble = 1.33;
        char testChar = 'a';
        boolean testBoolean = false;

        System.out.println(testByte);
        System.out.println(testShort);
        System.out.println(testInt);
        System.out.println(testLong);
        System.out.println(testFloat);
        System.out.println(testDouble);
        System.out.println(testChar);
        System.out.println(testBoolean);
    }
}