package jrm;

public class HttpConnection extends Connection{

    private final String message = "нешифрованное соединение";

    HttpConnection(String user, String password) {
        super("http connection", user, password);
    }

    @Override
    protected void connect() {
        System.out.println(message);
        System.out.println(getConnectionType());
        System.out.println(getUser());
        System.out.println(getPassword());
    }
}