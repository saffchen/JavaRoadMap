package jrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    private HttpConnection httpConnection;

    private Message message;

    @Autowired
    public Sender(HttpConnection httpConnection) {
        this.httpConnection = httpConnection;
    }


    @Autowired
    private void setMessage(Message message) {
        this.message = message;
    }

    public void sendMessage() {
        httpConnection.connect();
        message.createMessage();
        // подключение по http:
        //      вызвать метод connect у httpConnection
        // создание сообщения:
        //      вызвать метод createMessage у message

        System.out.println("message has been sent");
    }
}
