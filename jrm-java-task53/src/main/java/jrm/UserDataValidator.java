package jrm;

public class UserDataValidator {
    public static void validatePhoneNumber(User user) {
        try{
            if (user.getPhone().length() < 8) {
                //генерировать свое исключение
                throw new InvalidPhoneLengthException ();
            }
            if (!user.getPhone().startsWith("7")){
                //генерировать свое исключение
                throw new InvalidPhoneFormatException ();
            }
        }catch (NullPointerException e){
            System.out.println("Номер телефона не заполнен");
        }
    }
}
