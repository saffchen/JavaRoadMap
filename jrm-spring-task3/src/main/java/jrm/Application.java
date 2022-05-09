package jrm;

import org.springframework.beans.factory.annotation.Autowired;

public class Application {

    private Sender sender;

    public void runApp() {
        sender.sendMessage();
    }

    public Application(Sender sender) {
        this.sender = sender;
    }
}
