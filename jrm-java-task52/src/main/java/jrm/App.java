package jrm;

public class App {

    public static void main(String[] args) {
        User user = new User();
        user.setEmail("email");
        user.setFirstName("name");
        user.setPhone("11");
       UserDataValidator.validatePhoneNumber(user);
    }
}
