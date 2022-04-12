package jrm;

public class UserDataValidator {
    public static void validatePhoneNumber(User user){
        if (user.getPhone().length() < 8){
            System.out.println("Телефон не может быть короче 8 символов");
        }
        if (!user.getPhone().startsWith("7")){
            System.out.println("Номер телефона должен начинаться с цифры 7");
        }
    }
}
