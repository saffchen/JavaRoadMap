package jrm;

public class InvalidPhoneFormatException extends RuntimeException {
    public InvalidPhoneFormatException() {
        super("Номер телефона должен начинаться с цифры 7");
    }
}
