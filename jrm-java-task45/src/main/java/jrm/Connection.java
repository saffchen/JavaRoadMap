package jrm;

public abstract class Connection {
    private String connectionType;
    private String user;
    private String password;

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    Connection(String connectionType, String user, String password) {
        this.connectionType = connectionType;
        this.user = user;
        this.password = password;
    }
    protected abstract void connect();
}
