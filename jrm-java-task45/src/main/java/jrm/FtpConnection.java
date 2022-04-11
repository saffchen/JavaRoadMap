package jrm;

public class FtpConnection extends Connection {

    private final String message = "успешное соединение по ftp";

    public FtpConnection(String user, String password) {
        super("ftp connection", user, password);
    }

    @Override
    protected void connect() {
        System.out.println(message);
        System.out.println(getConnectionType());
        System.out.println(getUser());
        System.out.println(getPassword());
    }
}