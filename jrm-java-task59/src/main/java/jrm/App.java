package jrm;

public class App {

    public static void main(String[] args) {
        User firstUser = new User("123", Role.CLIENT);
        OperationWithUser.changePassword(firstUser,"321");   // пароль не должен измениться
        System.out.println(firstUser.getPassword());
        User secondUser = new User("111", Role.ADMIN);
        OperationWithUser.changePassword(secondUser,"333");  // пароль должен измениться
        System.out.println(secondUser.getPassword());
    }
}
