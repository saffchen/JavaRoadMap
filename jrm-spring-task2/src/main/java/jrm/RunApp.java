package jrm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 1) получить bean Application из контекста
        Application application = context.getBean(Application.class);
        application.runApp();// 2) вызвать метод runApp();
        context.close();
    }
}
