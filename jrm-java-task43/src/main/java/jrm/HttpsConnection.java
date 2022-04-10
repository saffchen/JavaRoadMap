package jrm;

public class HttpsConnection extends HttpConnection{
    protected HttpsConnection(String connectionType, String user, String password) {
        super(connectionType, user, password);
    }
    public void cryptConnection(){
        System.out.println("шифрую соединение");
        connect();
    }
}
