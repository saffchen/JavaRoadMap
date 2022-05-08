package jrm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {

    @Autowired
    private Sender sender;

    public void runApp() {
        sender.sendMessage();
    }
}