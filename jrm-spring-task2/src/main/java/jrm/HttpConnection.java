package jrm;

import org.springframework.stereotype.Component;

@Component
public class HttpConnection {

    public void connect() {
        System.out.println("connect with HTTP");
    }
}
