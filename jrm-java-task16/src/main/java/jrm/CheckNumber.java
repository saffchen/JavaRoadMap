package jrm;

public class CheckNumber {
    void checkResult() {
        int fromConsole = new WriteItDown().consoleRead();
        if (fromConsole < 5) {
            System.out.println("введенное Вами число меньше 5");
        }
    }
}
