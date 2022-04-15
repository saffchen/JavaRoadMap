package jrm;

public class InvalidPhoneLengthException extends RuntimeException {
    public InvalidPhoneLengthException() {
        super("Телефон не может быть короче 8 символов");
    }
}
