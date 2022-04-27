package jrm;

public class EventListener {
    public static void main(String[] args) {
        EventAction eventAction = new EventAction() {
            @Override
            public String makeAction() {
                return "Click at mouse button";
            }
        };
        showEvent(eventAction);
    }

    private static void showEvent(EventAction action) {
        System.out.println(action.makeAction());
    }
}