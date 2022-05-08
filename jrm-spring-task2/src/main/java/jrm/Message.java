package jrm;

import org.springframework.stereotype.Component;

@Component
public class Message {

    public void createMessage() {
        System.out.println("new Message has been created");
    }
}
