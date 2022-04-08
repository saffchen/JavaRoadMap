package jrm;

import java.util.Objects;

public class ArrayChanger {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User(12, "Ivan");
        users[1] = new User(20, "Daniil");
        users[2] = new User(15, "Ivan");
        processArray(users);
    }
    static void processArray(User[] arr){
        for (int i =0; i < arr.length; i++){
            if (Objects.requireNonNull(arr[i]).getAge() < 18){
                arr[i] = null;
                System.out.println(i);
            }
        }
    }
}