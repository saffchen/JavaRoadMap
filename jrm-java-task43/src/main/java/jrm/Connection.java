package jrm;

public class Connection {
    private String connectionType;
    private String password;
    private String user;

    Connection(String connectionType, String user, String password) {
        this.connectionType = connectionType;
        this.user = user;
        this.password = password;
    }

    protected void connect() {
        if (connectionType != null & password != null & user != null) {
            System.out.println(connectionType);
            System.out.println(user);
            System.out.println(password);
        }
    }
}
