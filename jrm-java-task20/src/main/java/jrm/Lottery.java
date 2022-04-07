package jrm;

public class Lottery {
    void sendPrize(int countOfMembers, int lotteryNumber){
        while (countOfMembers != 0) {
            if (countOfMembers == lotteryNumber) {
                System.out.println("билет под номером " + lotteryNumber + " выиграл 1000 рублей");
                break;
            }
            countOfMembers--;
        }
    }
}
