import games.lotteries.OneBonusLottery;
import games.lotteries.SuperLottery;
import games.lotteries.TwoBonusLottery;
import games.pokers.SinglePoker;
import platforms.MJPlatform;

public class Main {

    public static void main(String[] args) {
        OneBonusLottery oneBonusLottery = new OneBonusLottery(1, "12345");
        TwoBonusLottery twoBonusLottery = new TwoBonusLottery(1, "12345");
        SuperLottery superLottery = new SuperLottery(1, "12345");
        System.out.println(oneBonusLottery.getDisplayText());
        System.out.println(twoBonusLottery.getDisplayText());
        System.out.println(superLottery.getDisplayText());

        superLottery.setBetcontent("9853");
        System.out.println(superLottery.getDisplayText());

        superLottery.setEvenBetcontent();
        System.out.println(superLottery.getDisplayText());

        superLottery.setOddBetcontent();
        System.out.println(superLottery.getDisplayText());


        MJPlatform mjPlatform = new MJPlatform();
        mjPlatform.addGame(oneBonusLottery);
        mjPlatform.addGame(twoBonusLottery);
        mjPlatform.addGame(superLottery);
        mjPlatform.addGame(new SinglePoker("A"));

        mjPlatform.bet();
    }
}
