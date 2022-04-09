package jrm;

public class Philosophy {

    public static void main(String[] args) {
        String initPhrase = "REPLACE ME or not to be";
        String loverCase = toLowerCase(initPhrase);
        String replacingPhrase = replaceInitialString(loverCase);
        compareToPhrase(replacingPhrase);
    }

    //написать логику для метода
    private static String toLowerCase(String phrase) {
        // привести фразу "REPLACE ME or not to be" в нижний регистр и вернуть наружу
        return phrase.toLowerCase();
    }

    //написать логику для метода
    private static String replaceInitialString(String phrase) {
        String forReplace = "Be"; // замена для фразы replace me
        // заменить фразу "replace me" на слово "Be" и вернуть результат наружу
        return phrase.replace("replace me", forReplace);
    }

    private static void compareToPhrase(String phrase) {
        String expectedPhrase = "Be or not to be";
        if (expectedPhrase.equals(phrase)) {
            System.out.println("БЫТЬ");
        } else {
            System.out.println("Где-то закралась ошибка");
        }
    }
}
