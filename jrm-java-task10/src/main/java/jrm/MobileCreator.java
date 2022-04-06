package jrm;

public class MobileCreator {
    public static void main(String[] args) {
        Mobile firstModel = new Mobile();
        firstModel.cost = 10000;
        firstModel.countOfButtons = 10;
        Mobile secondModel = new Mobile();
        secondModel.cost = 5000;
        secondModel.countOfButtons = 5;

        if (firstModel.cost == 10000 & firstModel.countOfButtons == 10){
            firstModel.model = "iphone";
        }
        if (secondModel.cost == 5000 & secondModel.countOfButtons == 5){
            secondModel.model = "samsung";
        }
         print(firstModel.model);
        print(secondModel.model);

    }

    private static void print(String text){
        System.out.println(text);
    }
}
