package jrm;


import org.springframework.beans.factory.annotation.Autowired;

public class Sender {

    private final HttpConnection httpConnection;

    private Message message;

    public Sender(HttpConnection httpConnection) {
        this.httpConnection = httpConnection;
    }


    public void setMessage(Message message) {
        this.message = message;
    }


    public void sendMessage() {
        httpConnection.connect();
        message.createMessage();
        System.out.println("message has been sent");
    }

}
