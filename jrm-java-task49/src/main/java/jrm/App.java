package jrm;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Petr");
        user.setEmail("petr.ivanov@mail.ru");

        UserDataValidator userDataValidator = new UserDataValidator();
        userDataValidator.validatePhoneNumber(user);
    }
}