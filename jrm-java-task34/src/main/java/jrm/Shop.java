package jrm;

public class Shop {
    public void sell(User user) {
if (user.getAge() < 18){
    System.out.println("Товар не может быть продан");
} else System.out.println("Покупка совершена успешно");
    }
}
