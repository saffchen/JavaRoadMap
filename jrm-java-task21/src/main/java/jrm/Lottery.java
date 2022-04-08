package jrm;

public class Lottery {
    void sendPrize(int countOfMembers, int lotteryNumber){
        while (countOfMembers != 0) {
            if (countOfMembers == lotteryNumber) {
                System.out.println("билет под номером " + lotteryNumber + " проиграл");
                countOfMembers--;
                continue;
            }
            System.out.println("билет под номером " + countOfMembers + " выиграл 100 рублей");
            countOfMembers--;
        }
    }
}
