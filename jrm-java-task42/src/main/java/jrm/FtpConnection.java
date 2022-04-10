package jrm;

public class FtpConnection extends Connection{
    protected FtpConnection(String connectionType, String password, String user) {
        super(connectionType, password, user);
    }
}
