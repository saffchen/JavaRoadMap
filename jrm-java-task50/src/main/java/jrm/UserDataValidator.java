package jrm;

public class UserDataValidator {
    public static void validatePhoneNumber(User user) {
        try {
            if (user.getPhone().length() < 8) {
                System.out.println("Телефон не может быть короче 8 символов");
            }
            if (!user.getPhone().startsWith("7")) {
                System.out.println("Номер телефона должен начинаться с цифры 7");
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("Номер телефона не заполнен");
        }
    }
}
