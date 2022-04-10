package jrm;

public class App {
    //После создания всех нужных классов расскоментируйте следующие строки и запустите приложение
   public static void main(String[] args) {
        HttpConnection httpConnection = new HttpConnection("http connection", "admin", "123");
        httpConnection.connect();
    }
}
