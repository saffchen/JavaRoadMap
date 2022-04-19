package jrm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NestedDataStructure {

    public static void main(String[] args) {
        //обратите внимание на получившуюся структуру
        List<LinkedList<String>> array = new ArrayList<LinkedList<String>>();
        LinkedList<String> firstPart = new LinkedList<>();
        // наполянем структуру данными
        firstPart.add("Element One");
        LinkedList<String> secondPart = new LinkedList<>();
        secondPart.add("Element Two");
        array.add(firstPart);
        array.add(secondPart);

        printStructure(array);// печатает на экран все элементы arrayList

    }

    private static void printStructure(List<LinkedList<String>> list) {
        for (int i = 0; i != list.size(); i++) {
            for (String value : list.get(i)) {
                System.out.println(value);
            }
        }
    }
}
