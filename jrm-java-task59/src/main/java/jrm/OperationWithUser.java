package jrm;

public class OperationWithUser {
    public static void changePassword(User user, String password) {
        if (user.getRole() != null && user.getRole() != Role.ADMIN){
            System.out.println("Пароль не может быть изменен пользователем c роль \n" + user.getRole());
        }  if (user.getRole() != null && user.getRole() == Role.ADMIN) {
            System.out.println("Пароль изменен пользователем с роль \n" + user.getRole());
            user.setPassword(password);
        }
    }
}
