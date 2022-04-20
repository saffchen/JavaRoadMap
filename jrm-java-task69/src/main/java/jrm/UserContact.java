package jrm;

import java.util.HashMap;

public class UserContact {

    public static void main(String[] args) {
        String nameForFirstClient = "Иванов Иван Иванович";
        String phoneNumberForFirstClient = "89148500000";
        String nameForSecondUser = "Петров Петр Петрович";
        String phoneForSecondUser = "89148511111";

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put(phoneNumberForFirstClient, nameForFirstClient);
        phoneBook.put(phoneForSecondUser, nameForSecondUser);

        for (String s : phoneBook.keySet()) {
            System.out.println(s);
        }
//создайте HashMap и добавьте key(телефон) и value(имя клиента)
//распечатйте все ключи, которые будут содержаться в HashMap ожидаем, что мы получим

    }
}
