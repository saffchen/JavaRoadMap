package jrm;

public class UserDataValidator {
    public static void validatePhoneNumber(User user) {
        try{
            if (user.getPhone().length() < 8) {
                throw new IllegalArgumentException("Телефон не может быть короче 8 символов");
            }
            if (!user.getPhone().startsWith("7")){
                throw new IllegalArgumentException("Номер телефона должен начинаться с цифры 7");
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Номер телефона не заполнен");
        }
    }
}
