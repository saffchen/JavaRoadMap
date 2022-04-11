package jrm;

public class HttpsConnection extends Connection{

    private final String message = "Шифрую соединение";

    HttpsConnection(String user, String password) {
        super("HttpsConnection", user, password);
    }

    @Override
    protected void connect() {
        System.out.println(message);
        System.out.println(getConnectionType());
        System.out.println(getUser());
        System.out.println(getPassword());
    }
}