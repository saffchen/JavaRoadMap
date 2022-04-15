package jrm;

public class App {

    // запуск программы после изменений указанных в шагах, должен генерировть InvalidPhoneLengthException
    public static void main(String[] args) {
        User user = new User();
        user.setEmail("email");
        user.setFirstName("name");
        user.setPhone("7");
        UserDataValidator.validatePhoneNumber(user);
    }
}
