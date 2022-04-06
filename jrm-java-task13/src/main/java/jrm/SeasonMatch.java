package jrm;

public class SeasonMatch {

    String winter = "переданный месяц означает, что на улице зима";
    String spring = "переданный месяц означает, что на улице весна";
    String summer = "переданный месяц означает, что на улице лето";
    String autumn = "переданный месяц означает, что на улице осень";
    String invalid = "переданное число невалидно";

    public void match(int month) {
        if(month == 12 || month == 1 || month == 2){
            System.out.println(winter);
        }
        else if(month == 3 || month == 4 || month == 5){
            System.out.println(spring);
        }
        else if(month == 6 || month == 7 || month == 8){
            System.out.println(summer);
        }
        else if(month == 9 || month == 10 || month == 11){
            System.out.println(autumn);
        } else System.out.println(invalid);
    }
}
