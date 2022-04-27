package jrm;

public class EventListener {
    public static void main(String[] args) {

        EventAction action = () -> "Click at mouse button";
        showEvent(action);
    }

    private static void showEvent(EventAction action) {
        System.out.println(action.makeAction());
    }
}