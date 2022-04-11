package jrm;

public class App {
    public static void main(String[] args) {
        Server.establishingConnection(new FtpConnection("admin", "123"));
    }
}
