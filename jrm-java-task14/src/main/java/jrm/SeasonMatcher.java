package jrm;

public class SeasonMatcher {

    String winter = "переданный месяц означает, что на улице зима";
    String spring = "переданный месяц означает, что на улице весна";
    String summer = "переданный месяц означает, что на улице лето";
    String autumn = "переданный месяц означает, что на улице осень";
    String invalid = "переданное число невалидно";

    void match(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(winter);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(spring);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(summer);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(autumn);
                break;
            default:
                System.out.println(invalid);

        }
    }

}
