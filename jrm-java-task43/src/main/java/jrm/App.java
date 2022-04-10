package jrm;

public class App {
    public static void main(String[] args) {
        //После добавления нужной логики расскоментировать следующий код. И убедиться, что программа работает корректно
        HttpsConnection httpConnection = new HttpsConnection("https connection", "admin", "123");
        httpConnection.cryptConnection();
    }
}
