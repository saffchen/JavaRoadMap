package jrm;

public class Connection {
    private String connectionType;
    private String password;
    private String user;

    Connection(String connectionType, String password, String user){
        this.connectionType = connectionType;
        this.password = password;
        this.user = user;
    }
    void connect(){
        if (connectionType != null && password != null && user != null){
            System.out.println(connectionType);
            System.out.println(password);
            System.out.println(user);
        } else {
            throw new IllegalArgumentException();
        }
    }
}