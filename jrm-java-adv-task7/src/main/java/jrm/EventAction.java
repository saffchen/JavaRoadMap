package jrm;

@FunctionalInterface
public interface EventAction {
    String makeAction();

    default void print() {
        System.out.println("Print");
    }
}
